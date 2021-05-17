package birds;

public class Duck extends Bird implements IEatable,IFlyable,ISwimable{
    static int count=0;

    //fly method prints flying
    public void fly(){
        System.out.println("Duck is Flying");
    }

    //eat method prints eating
    public void eat(){
        System.out.println("Duck is Eating");
    }

    //swim method prints swimming
    public void swim(){
        System.out.println("Duck is Swimming");
    }

    /*
    overriding the incrementCount ,decrement and getCount methods
     */
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
