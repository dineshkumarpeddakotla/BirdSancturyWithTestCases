package birds;

public abstract class Bird {
    static int count;
    abstract int getCount();

    void incrementCount() {
        count++;
    }

    void decrement(){
        count--;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
}
