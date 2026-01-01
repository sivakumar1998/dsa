package singlyLinkedList;

public class CreateSinglyLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        ListNode head = new ListNode(10);
        ListNode node2 = new ListNode(20);
        ListNode node3 = new ListNode(30);
        node2.setNextNode(node3);
        sll.setHead(head);
        sll.getHead().setNextNode(node2);
        sll.display();
        sll.insertNodeAtBeginingOfSinglyLinkedList(9);
        sll.display();
        sll.insertNodeAtBeginingOfSinglyLinkedList(8);
        sll.display();

    }
}
