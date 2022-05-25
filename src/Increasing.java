import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Increasing {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Input array size: ");
        int[] numbers = new int[Integer.parseInt(READER.readLine())];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("input " + i + " element");
            numbers[i] = Integer.parseInt(READER.readLine());
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ",");
        }

        // --------

        boolean isStrictlyIncreasing = true;

        for (int i = 0; i < numbers.length - 1; i++) {
           if ((numbers[i] >= numbers[i+1])) {
               isStrictlyIncreasing = false;
               break;
            }
        }

        if (!isStrictlyIncreasing) {
            System.out.println("The sequence is not strictly increasing");
            return;
        }

       System.out.println("The sequence is strictly increasing");

    }
}