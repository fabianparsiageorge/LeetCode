public class Add_Binary {
    public static void main(String[] args) {
        String a = "1010", b = "1011";
        String result = addBinary(a, b);
        System.out.println(result);
    }

    public static String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder ouput = new StringBuilder();

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
            }
            ouput.append(sum % 2);
            carry = sum / 2;
            i--;
            j--;
        }

        if (carry == 1) {
            ouput.append(carry);
        }
        return ouput.reverse().toString();
    }
}
