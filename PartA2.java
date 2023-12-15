
public class PartA2 {
    public static void main(String[] args) {
        for (int die1 = 1; die1 <= 6; die1++) {
            for (int die2 = 1; die2 <= 6; die2++) {
                System.out.print("(" + die1 + ", " + die2 + ")\t");
            }
            System.out.println();
        }
    }
}
