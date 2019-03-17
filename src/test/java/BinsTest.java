import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class BinsTest {
    private Integer minRollTotal = 3;
    private Integer maxRollTotal = 5;


    @Test
    public void createABin(){
        //Given
        Bins bin2 = new Bins(1,3);
        bin2.setBins(minRollTotal, maxRollTotal);
        Integer expected = 0;

        //When
        bin2.getBins();
        Integer actual = bin2.getOccurrenceValue(minRollTotal);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getOccurrenceValueTest(){
        //Given
        Bins bin = new Bins(1,2);
        bin.setBins(1,5);
        bin.getBins();
        Integer expected = 2;

        //When
        bin.increaseOccurrence(4);
        bin.increaseOccurrence(4);
        Integer actual = bin.getOccurrenceValue(4);

        //Then
        Assert.assertEquals(expected,actual);

    }


    @Test
    public void increaseOccurrence() {
        //Given
        Bins bin = new Bins(1,2);
        bin.setBins(1,5);
        bin.getBins();
        Integer expected = 2;

        //When
        bin.increaseOccurrence(4);
        bin.increaseOccurrence(4);
        Integer actual = bin.getOccurrenceValue(4);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void percentOfOccurrenceTest(){
        //Given
        Bins bin = new Bins(1,2);
        Integer expected = 60;

        //When
        Integer actual = bin.percentOccurrence(3,5);

        //Then
        Assert.assertEquals(expected,actual);
    }
}