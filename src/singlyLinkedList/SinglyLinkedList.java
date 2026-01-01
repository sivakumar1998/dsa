package singlyLinkedList;

public class SinglyLinkedList {
   private ListNode head;

    public ListNode getHead() {
        return head;
    }

    public void setHead(ListNode head) {
        this.head = head;
    }

    public void display() {
        ListNode tempnode = head;
        while (tempnode != null) {
            System.out.print(tempnode.getData() + "->");
            tempnode = tempnode.getNextNode();
        }
        System.out.print("null");
        System.out.println();
    }

    public void insertNodeAtBeginingOfSinglyLinkedList(int value){
        ListNode node=new ListNode(value);
        node.setNextNode(head);
        head=node;
    }

}
