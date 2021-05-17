package birds;

import java.util.HashSet;
import java.util.Set;

public class BirdSanctuary {
    //declared new  hashset of birdsList
    private final Set<Bird> birdsList = new HashSet<>();
    static BirdSanctuary instance;

    //declared private BirdSanctuary constructor
    private BirdSanctuary(){

    }

    //declared getInstance method to create new object when ever its called
    public synchronized static BirdSanctuary getInstance(){
        if (instance== null){
            instance = new BirdSanctuary();
        }
        return instance;
    }

    /**
     * add method adds different birds to birds list
     * @param bird bird name
     * added try and catch blocks for exceptions and also throws one custom exception
     */
    public void add(Bird bird)  {
        try {
            if (bird == null) {
                throw new BirdSanctuaryAddException("Bird does not exist");
            }
            if(birdsList.add(bird)) {
                bird.incrementCount();
            }
        } catch(BirdSanctuaryAddException e) {
            e.printStackTrace();
        }
    }

    /**
     * remove method remove bird from bird list
     * @param bird bird name
     */
    public void remove(Bird bird){
        birdsList.remove(bird);
        bird.decrement();
    }

    //printFlyable method print all flyable birds by filtering birdsList by using streams
    public void printFlyable() {
        birdsList.stream().filter(bird -> bird instanceof IFlyable).forEach(bird -> ((IFlyable)bird).fly());
    }

    //printSwimable method print all swimable birds by filtering birdsList by using streams
    public void printSwimable() {
        birdsList.stream().filter(bird -> bird instanceof ISwimable).forEach(bird -> ((ISwimable)bird).swim());
    }

    //printEatable method print all eatable birds by filtering birdsList by using streams
    public void printEatable(){
        birdsList.stream().filter(bird -> bird instanceof IEatable).forEach(bird -> ((IEatable)bird).eat());
    }
}
