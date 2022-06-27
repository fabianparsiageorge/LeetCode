import java.util.ArrayList;

class Palindrome_Linked_List {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(2, new ListNode(1, null)))));
        Boolean result = isPalindrome(head);
        System.out.println(result);
    }

    public static boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        while (head != null) {
            arr.add(head.val);
            head = head.next;
        }
        int i = 0, j = arr.size() - 1;
        while (i < j) {
            if (arr.get(i) != arr.get(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}