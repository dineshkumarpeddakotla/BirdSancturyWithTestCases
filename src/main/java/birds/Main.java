package birds;

public class Main {

    //main method
    public static void main(String[] args) {
        //created new object by called BirdSanctuary.getInstance() method
        BirdSanctuary sanctuary = BirdSanctuary.getInstance();

        //created new object by called BirdFactory.getInstance() method
        BirdFactory birdFactory = BirdFactory.getInstance();
        Bird parrot = birdFactory.getBird(BirdFactory.BirdType.PARROT);
        Bird parrotObj = birdFactory.getBird(BirdFactory.BirdType.PARROT);
        Bird duck = birdFactory.getBird(BirdFactory.BirdType.DUCK);
        Bird penguins = birdFactory.getBird(BirdFactory.BirdType.PENGUINS);
        Bird penguinObj = birdFactory.getBird(BirdFactory.BirdType.PENGUINS);
        Bird toyDuck = birdFactory.getBird(BirdFactory.BirdType.TOY_DUCK);

        //added birds to birdsList in BirdSanctuary
        sanctuary.add(null);
        sanctuary.add(penguins);
        sanctuary.add(parrotObj);
        sanctuary.add(duck);
        sanctuary.add(parrot);
        sanctuary.add(penguinObj);
        sanctuary.add(toyDuck);
        sanctuary.add(duck);

        //remove birds from list
        sanctuary.remove(parrotObj);
        sanctuary.remove(toyDuck);

        //used all print method
        sanctuary.printEatable();
        sanctuary.printFlyable();
        sanctuary.printSwimable();

        //prints count of different birds in the birdSanctuary
        System.out.println(duck.getCount());
        System.out.println(parrot.getCount());
        System.out.println(penguins.getCount());
        System.out.println(toyDuck.getCount());
    }
}
