public class Longest_Substring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int substringLength = lengthOfLongestSubstring(s);
        System.out.println(substringLength);
    }

    public static int lengthOfLongestSubstring(String s) {
        String substring = "";
        for (int i = 0; i < s.length(); i++) {
            String letter = String.valueOf(s.charAt(i));
            if (substring.contains(letter)) {
                System.out.println(letter);
                System.out.println(letter + " is in " + substring);
                String rgx = "^[a-z]?" + letter;
                substring = substring.replaceAll(rgx, "");
                substring += letter;
                System.out.println(substring);

            } else {
                System.out.println(letter);
                System.out.println(letter + " is not in " + substring);
                substring += letter;
                System.out.println(substring);
            }
        }
        return substring.length();
    }
}
