import static oracle.jrockit.jfr.events.Bits.intValue;

public class Dice {

    protected Integer numberOfDice;
    protected Integer minRollTotal;
    protected Integer maxRollTotal;

    public Dice(Integer numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    public Integer getMinRollTotal() {
        return minRollTotal;
    }

    public void setMinRollTotal(Integer numberOfDice) {
        this.minRollTotal = numberOfDice;
    }

    public Integer getMaxRollTotal() {
        return maxRollTotal;
    }

    public void setMaxRollTotal(Integer numberOfDice) {
        this.maxRollTotal = numberOfDice * 6;
    }

    public Integer rollDice() {
        Integer tossValue = intValue(Math.random() * 6 + 1);
        return tossValue;
    }

    public Integer getSumOfDice(Integer numberOfDice) {
        Integer sumOfDice = 0;
        for (int i = 1; i <= numberOfDice; i++) {
            sumOfDice += rollDice();
        }
        return sumOfDice;
    }

}








