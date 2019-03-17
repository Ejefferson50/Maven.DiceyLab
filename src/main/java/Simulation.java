import java.sql.SQLOutput;
import java.util.TreeMap;

import static oracle.jrockit.jfr.events.Bits.intValue;

public class Simulation {
    private Dice dice;
    private Bins bin;
    private Integer numberOfTosses;
    private Integer numberOfDice;
    private Integer minRollTotal;
    private Integer maxRollTotal;
    private Integer occurrenceValue;

    public Simulation(Integer numberOfDice, Integer numberOfTosses) {

        this.dice = new Dice(numberOfDice);
        this.dice.setMaxRollTotal(numberOfDice);
        this.dice.setMinRollTotal(numberOfDice);
        this.minRollTotal = dice.getMinRollTotal();
        this.maxRollTotal = dice.getMaxRollTotal();
        this.bin = new Bins(this.minRollTotal, this.maxRollTotal);
        this.numberOfTosses = numberOfTosses;
        this.numberOfDice = numberOfDice;


    }

    public void runSimulation() {
        for (int i = 1; i <= this.numberOfTosses; i++) {
            this.bin.increaseOccurrence(dice.getSumOfDice(this.numberOfDice));
        }
    }

    public String printStars(Integer percent) {
        Integer numberStars = this.bin.percentOccurrence(this.occurrenceValue, this.numberOfTosses);
        String stars = "";
        for (int i = 0; i < numberStars; i++) {
            stars += "*";
        }
        return stars;
    }

    public String printResults() {
        StringBuilder sim = new StringBuilder("***\nSimulation of " + this.numberOfDice + " dice tossed " +
                this.numberOfTosses + " times.\n***\n\n");


        for (int i = this.minRollTotal; i <= this.maxRollTotal; i++) {
            this.occurrenceValue = this.bin.getOccurrenceValue(i);
            Integer percent = bin.percentOccurrence(this.occurrenceValue, this.numberOfTosses);
            sim.append(String.format("%3d : %7d : %2d %% %s %n", i, this.occurrenceValue, percent, printStars(percent)));
        }
        System.out.print(sim.toString());
        return sim.toString();
    }

}
