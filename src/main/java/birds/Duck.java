package birds;

public class Duck extends Bird implements IEatable,IFlyable,ISwimable{
    static int count=0;



    public void fly(){
        System.out.println("Duck is Flying");
    }

    public void eat(){
        System.out.println("Duck is Eating");
    }

    public void swim(){
        System.out.println("Duck is Swimming");
    }

    @Override
    void incrementCount() {
        count++;
    }

    @Override
    void decrement() {
        Bird.count--;
    }

    @Override
    int getCount() {
        return count;
    }

}
