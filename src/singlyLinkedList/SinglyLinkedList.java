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

    public void insertValueAtBeginingOfSinglyLinkedList(int value){
        ListNode node=new ListNode(value);
        node.setNextNode(head);
        head=node;
    }
    public void insertValueAtTheEndOfSinglyLinkedList(int value){
        ListNode node=new ListNode(value);
        ListNode lastNode=head;
        if(head!=null) {
            while (lastNode.getNextNode() != null) {
                lastNode = lastNode.getNextNode();
            }
            lastNode.setNextNode(node);
        }else{
            head=node;
        }
    }

}
