public class Longest_Substring {
    public static void main(String[] args) {
        String s = "dvdf";
        int substringLength = lengthOfLongestSubstring(s);
        System.out.println(substringLength);
    }

    public static int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int maxLength = 0;

        String substring = "";

        while (j < s.length()) {
            if (!substring.contains(String.valueOf(s.charAt(j)))) {
                substring += String.valueOf(s.charAt(j));
                maxLength = Math.max(substring.length(), maxLength);
                j++;
            } else {
                substring = substring.replace(String.valueOf(s.charAt(i)), "");
                i++;
            }
        }
        return maxLength;
    }
}
