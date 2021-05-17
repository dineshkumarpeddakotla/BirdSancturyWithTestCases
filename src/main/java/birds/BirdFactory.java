package birds;

//BirdFactory is created to get the different bird class by this class
public class BirdFactory {

    // enum class is created for constant varaibles
    enum BirdType {
        PARROT,
        PENGUINS,
        TOY_DUCK,
        DUCK
    }

    //declared BirdFactory instance variable for singleton variable for use single pattern
    private static BirdFactory instance;

    //private default constructor
    private BirdFactory() {

    }

    //created getInstance method to access bird factory object for one time use by creating instance
    public static synchronized BirdFactory getInstance() {
        if (instance == null)
            instance = new BirdFactory();
        return instance;
    }

    //getBird method is used to call different bird classes to create new object
    public Bird getBird(BirdType birdType) {
        switch (birdType) {
            case PARROT:
                return new Parrot();
            case PENGUINS:
                return new Penguins();
            case TOY_DUCK:
                return new ToyDuck();
            case DUCK:
                return new Duck();
            default:
                return null;
        }
    }
}
