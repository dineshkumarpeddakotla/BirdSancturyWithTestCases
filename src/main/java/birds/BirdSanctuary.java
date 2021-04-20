package birds;

import java.util.HashSet;
import java.util.Set;

public class BirdSanctuary {
    private final Set<Bird> birdsList = new HashSet<>();
    static BirdSanctuary instance;

    private BirdSanctuary(){

    }

    public synchronized static BirdSanctuary getInstance(){
        if (instance== null){
            instance = new BirdSanctuary();
        }
        return instance;
    }

    public void add(Bird bird)  {
       try {
           if(bird == null){
               throw  new BirdSanctuaryAddException("You Have Passed Null, Please Check Again");
           }
           if (birdsList.add(bird)){
               bird.incrementCount();
           }
       } catch (BirdSanctuaryAddException e) {
           e.printStackTrace();
       }


    }

    public void remove(Bird bird){
        birdsList.remove(bird);
        bird.decrement();
    }

    public void printFlyable() {
        birdsList.stream().filter(bird -> bird instanceof IFlyable).forEach(bird -> ((IFlyable)bird).fly());
    }

    public void printSwimable() {
        birdsList.stream().filter(bird -> bird instanceof ISwimable).forEach(bird -> ((ISwimable)bird).swim());
    }

    public void printEatable(){
        birdsList.stream().filter(bird -> bird instanceof IEatable).forEach(bird -> ((IEatable)bird).eat());
    }
}
