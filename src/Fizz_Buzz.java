import java.util.ArrayList;
import java.util.List;

public class Fizz_Buzz {
    public static void main(String[] args) {
        int n = 15;
        List<String> s = fizzBuzz(n);
        System.out.println(s);
    }

    public static List<String> fizzBuzz(int n) {
        List<String> str = new ArrayList<>();
        int idx = 0;
        while (idx < n) {
            int i = idx + 1;
            if (i % 3 == 0 && i % 5 == 0) {
                str.add("FizzBuzz");
            } else if (i % 3 == 0) {
                str.add("Fizz");
            } else if (i % 5 == 0) {
                str.add("Buzz");
            } else {
                str.add(Integer.toString(i));
            }
            idx++;
        }
        return str;
    }
}
