public class Length_of_Last_Word {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        int result = lengthOfLastWord(s);
        System.out.println(result);
    }

    public static int lengthOfLastWord(String s) {
        s = s.replaceAll("\\s+$", "");
        int lengthCount = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            }
            lengthCount++;
        }
        return lengthCount;
    }
}
