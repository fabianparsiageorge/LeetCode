// Java program to find middle of linked list
class Middle_of_the_Linked_List {
    ListNode head; // head of linked list

    public static void main(String[] args) {
        Middle_of_the_Linked_List llist = new Middle_of_the_Linked_List();
        for (int i = 6; i > 0; --i) {
            llist.push(i);
        }
        llist.printList();
        llist.middleNode();
    }

    void middleNode() {
        ListNode tortois = head;
        ListNode hare = head;

        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            tortois = tortois.next;
        }
        System.out.println("The middle element is [" +
                tortois.value + "] \n");

    }

    /* Inserts a new ListNode at front of the list. */
    public void push(int new_data) {
		/* 1 & 2: Allocate the ListNode &
				Put in the value*/
        ListNode new_node = new ListNode(new_data);

        /* 3. Make next of new ListNode as head */
        new_node.next = head;

        /* 4. Move the head to point to new ListNode */
        head = new_node;
    }

    /* This function prints contents of linked list
    starting from the given node */
    public void printList() {
        ListNode tnode = head;
        while (tnode != null) {
            System.out.print(tnode.value + "->");
            tnode = tnode.next;
        }
        System.out.println("NULL");
    }

    /* Linked list node */
    class ListNode {
        int value;
        ListNode next;

        ListNode(int value) {
            this.value = value;
            next = null;
        }
    }
}