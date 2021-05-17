package birds;

public class Penguins extends Bird implements IEatable,ISwimable{
    static int count;

    public void eat() {
        System.out.println("Penguins is Eating");
    }

    public void swim() {
        System.out.println("Penguins is Swimming");
    }

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
