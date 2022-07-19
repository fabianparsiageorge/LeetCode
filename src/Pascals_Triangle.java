import java.util.ArrayList;
import java.util.List;

public class Pascals_Triangle {
    public static void main(String[] args) {
        int numRows = 15;
        System.out.println(generate(numRows));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> arr = new ArrayList<>(i);
            for (int j = 0; j <= i; j++) {
                int val = factorial(i) / (factorial(j) * factorial(i - j));
                arr.add(val);
            }
            triangle.add(arr);
        }

        return triangle;
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }
}
