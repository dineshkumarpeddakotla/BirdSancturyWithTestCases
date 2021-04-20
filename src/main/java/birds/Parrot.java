package birds;

public class Parrot extends Bird implements IEatable,IFlyable{

    static int count;

    public void fly(){
        System.out.println("Parrot is Flying");
    }

    public void eat(){
        System.out.println("Parrot is Eating");
    }

    @Override
    void incrementCount() {
        count++;
    }

    @Override
    void decrement() {
        count--;
    }

    @Override
    int getCount() {
        return count;
    }
}
