package birds;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

public class TestBirdSanctuary {

    //created test cases to test whether new birds are added
    @Test
    public void whenBirdIsAddToBirdSanctuary() {
        BirdSanctuary birdSanctuary = BirdSanctuary.getInstance();

        Parrot parrot = new Parrot();
        birdSanctuary.add(parrot);
        int count = parrot.getCount();
        Assertions.assertEquals(1, count);
    }

    //created test cases to test whether null is added to birdList
    @SuppressWarnings("deprecation")
    @Test
    public void whenNullIsAddedToBirdSanctuary() {
        BirdSanctuary birdSanctuary = BirdSanctuary.getInstance();

        ExpectedException exceptionRule = ExpectedException.none();
        exceptionRule.expect(BirdSanctuaryAddException.class);
        birdSanctuary.add(null);
    }
}
