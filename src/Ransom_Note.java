public class Ransom_Note {
    public static void main(String[] args) {

        String ransomNote = "fihjjjjei", magazine = "hjibagacbhadfaefdjaeaebgi";
        boolean result = canConstruct(ransomNote, magazine);
        System.out.println(result);
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        boolean result = true;
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            if (magazine.contains(String.valueOf(ch))) {
                String str = String.valueOf(ch);
                magazine = magazine.replaceFirst(str, "");
            } else {
                return false;
            }
        }
        return result;
    }
}
