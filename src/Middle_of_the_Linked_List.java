public class Middle_of_the_Linked_List {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
        ListNode result = middleNode(head);
        System.out.println(result.getValue());

    }

    public static ListNode middleNode(ListNode head) {
        ListNode tortoise = head;
        ListNode hare = head;

        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            tortoise = tortoise.next;
        }
        return tortoise;
    }
}