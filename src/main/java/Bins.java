import java.util.Map;
import java.util.TreeMap;

public class Bins {

    TreeMap<Integer, Integer> bins;

    public Bins(Integer minRollTotal, Integer maxRollTotal) {
        this.bins = new TreeMap<Integer, Integer>();
        this.setBins(minRollTotal, maxRollTotal);
    }

    public TreeMap<Integer, Integer> getBins() {
        return bins;
    }


    public void setBins(Integer minRollTotal, Integer maxRollTotal) {
        for (int i = minRollTotal; i <= maxRollTotal; i++) {
            bins.put(i, 0);
        }
    }

    public Integer getOccurrenceValue(Integer rollTotal) {
        return bins.get(rollTotal);
    }

    public void increaseOccurrence(Integer rollTotal) {

        Integer previousOccurrence = bins.get(rollTotal);
        bins.put(rollTotal, previousOccurrence += 1);
    }

    public Integer percentOccurrence(Integer occurrenceValue, Integer numberOfRolls) {

        Float occur = (occurrenceValue.floatValue() / numberOfRolls.floatValue());

        return Math.round(occur * 100);

    }
}
