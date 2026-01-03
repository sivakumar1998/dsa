package singlyLinkedList;

public class SinglyLinkedList {
   private ListNode head;
    private int length;
    public ListNode getHead() {
        return head;
    }

    public void setHead(ListNode head) {
        this.head = head;
    }
public int getLength(){
        return length;
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
        length++;
    }
    public void insertValueAtTheEndOfSinglyLinkedList(int value){
        ListNode node=new ListNode(value);
        ListNode lastNode=head;
        if(head!=null) {
            while (lastNode.getNextNode() != null) {
                lastNode = lastNode.getNextNode();
            }
            lastNode.setNextNode(node);
            length++;
        }else{
            head=node;
            length++;
        }
    }

    public void insertValeAtSpecifiedLocation(int data, int position){
        if(position==1){
            ListNode node=new ListNode(data);
            node.setNextNode(head);
            head=node;
            length++;
        }else{
            int count =1;
            ListNode node=new ListNode(data);
            ListNode temp=head;
            while((count< position-1)&& (position <= length+1)){
                temp=temp.getNextNode();
                count++;
            }
            node.setNextNode(temp.getNextNode());
            temp.setNextNode(node);
           length++;
        }
    }
public ListNode deleteNodeAtTheBegining(){
        if(head==null){
            return head;
        }
        else{
            ListNode temp=head;
            head=temp.getNextNode();
            temp.setNextNode(null);
            return temp;
        }


}
}
