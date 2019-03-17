import org.junit.Assert;
import org.junit.Test;

public class DiceTest {
    private Integer numberOfDice = 2;
    private Dice dice = new Dice(numberOfDice);




    @Test
    public void getMinRollTotal() {
        //Given
        dice.setMinRollTotal(numberOfDice);
        Integer expected = 2;

        //When
        Integer actual = dice.getMinRollTotal();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getMaxRollTotal() {
        //Given
        dice.setMaxRollTotal(numberOfDice);
        Integer expected = 12;

        //When
        Integer actual = dice.getMaxRollTotal();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void rollDice() {
        //Given
        Integer roll = dice.rollDice();

        //When
        Boolean actual = roll >= 1 && roll <= 6;

        //Then
        Assert.assertEquals(true,actual);
    }

    @Test
    public void getSumOfDice(){
        //Given
        Integer sumOfRoll = dice.getSumOfDice(numberOfDice);

        //When
        Boolean actual = sumOfRoll >= 2 && sumOfRoll <= 12;

        //Then
        Assert.assertEquals(true,actual);
    }

}