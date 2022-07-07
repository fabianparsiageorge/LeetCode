import java.math.BigInteger;

public class Plus_One {
    public static void main(String[] args) {
        int[] digits = {7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 6};
        int[] result = plusOne(digits);

        for (int i : result) {
            System.out.print(i);
        }
    }

    public static int[] plusOne(int[] digits) {
        String str = "";
        boolean allNine = false;
        int[] result;

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 9) {
                allNine = true;
            } else {
                allNine = false;
                break;
            }
        }
        if (allNine) {
            result = new int[digits.length + 1];
        } else {
            result = new int[digits.length];
        }

        for (int i : digits) {
            str += i;
        }
        BigInteger b = new BigInteger(str);
        BigInteger c = new BigInteger("1");
        b = b.add(c);
        str = "" + b;

        for (int i = 0; i <= str.length() - 1; i++) {
            String s = String.valueOf(str.charAt(i));
            result[i] = Integer.parseInt(s);
        }
        return result;
    }
}
