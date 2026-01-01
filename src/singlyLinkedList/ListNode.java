package singlyLinkedList;

public class ListNode {
    private int data;
    private ListNode nextNode;
    public ListNode(int data){
        this.data=data;
        this.nextNode=null;
    }
    public void setNextNode(ListNode node){
        nextNode=node;
    }
    public ListNode getNextNode(){
        return nextNode;
    }
    public int getData(){
        return data;
    }
}
