package birds;

//created Bird abstract class
public abstract class Bird {

    //declared static variable
    static int count;
    //declared getCount method
    abstract int getCount();

    //declared and given body to incrementCount and decrement methos
    void incrementCount() {
        count++;
    }

    void decrement(){
        count--;
    }

    //overriding hashcode
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    //overriding equals method
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
}
