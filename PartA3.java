import java.util.HashMap;
import java.util.Map;

class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
public class PartA3 {
    public static void main(String[] args) {
        Map<Integer, Integer> sumCounts = new HashMap<>();
        for (int die1 = 1; die1 <= 6; die1++) {
            for (int die2 = 1; die2 <= 6; die2++) {
                int totalSum = die1 + die2;
                sumCounts.put(totalSum, sumCounts.getOrDefault(totalSum, 0) + 1);
            }
        }
        int totalCombinations = 6 * 6; 
        for (int sumValue = 2; sumValue <= 12; sumValue++) { 
            int count = sumCounts.getOrDefault(sumValue, 0);
            Fraction probability = new Fraction(count, totalCombinations);
            System.out.printf("Sum: %d, Probability: %s%n", sumValue, probability);
        }
    }
}
