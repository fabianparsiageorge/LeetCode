public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public String getValue() {
        String result = val + " ";
        if (next != null) {
            result += next.getValue();
        }
        return result;
    }
}