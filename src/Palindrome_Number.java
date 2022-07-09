public class Palindrome_Number {
    public static void main(String[] args) {
        int x = 0;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        int original = x;
        if (x < 0) {
            x = x * -1;
        }
        int reverse = 0, remainder;
        while (x != 0) {
            remainder = x % 10;
            reverse = reverse * 10 + remainder;
            x = x / 10;
        }
        return original == reverse;
    }
}
