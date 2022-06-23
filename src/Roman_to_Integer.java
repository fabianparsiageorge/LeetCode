import java.util.HashMap;
import java.util.Map;

public class Roman_to_Integer {


    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInteger(s));
    }

    public static int romanToInteger(String s) {
        Map<Character, Integer> numbersMap = new HashMap<>();
        numbersMap.put('I', 1);
        numbersMap.put('V', 5);
        numbersMap.put('X', 10);
        numbersMap.put('L', 50);
        numbersMap.put('C', 100);
        numbersMap.put('D', 500);
        numbersMap.put('M', 1000);

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i != s.length() - 1 && numbersMap.get(s.charAt(i + 1)) > numbersMap.get(s.charAt(i))) {
                sum += numbersMap.get(s.charAt(i + 1)) - numbersMap.get(s.charAt(i));
                i++;
            } else {
                sum += numbersMap.get(s.charAt(i));
            }
        }
        return sum;
    }
}
