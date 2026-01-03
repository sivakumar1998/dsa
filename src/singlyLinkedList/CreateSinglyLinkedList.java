package singlyLinkedList;

public class CreateSinglyLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insertValueAtTheEndOfSinglyLinkedList(90);
        sll.display();
        sll.insertValueAtBeginingOfSinglyLinkedList(9);
        sll.display();
        sll.insertValueAtBeginingOfSinglyLinkedList(8);
        sll.display();
        sll.insertValueAtTheEndOfSinglyLinkedList(40);
        sll.display();
        sll.insertValueAtTheEndOfSinglyLinkedList(50);
        sll.display();
        sll.insertValueAtTheEndOfSinglyLinkedList(70);
        sll.display();
        System.out.println(sll.getLength());
        sll.insertValeAtSpecifiedLocation(80,6);
        sll.display();
        System.out.println(sll.getLength());
        sll.insertValeAtSpecifiedLocation(60,8 );
        sll.display();
        System.out.println(sll.getLength());
        System.out.println("deleted node:"+sll.deleteNodeAtTheBegining());
        System.out.println("deleted node:"+sll.deleteNodeAtTheBegining());
        System.out.println("deleted node:"+sll.deleteNodeAtTheBegining());
        System.out.println("deleted node:"+sll.deleteNodeAtTheBegining());
        System.out.println("deleted node:"+sll.deleteNodeAtTheBegining());
        System.out.println("deleted node:"+sll.deleteNodeAtTheBegining());
        System.out.println("deleted node:"+sll.deleteNodeAtTheBegining());
        System.out.println("deleted node:"+sll.deleteNodeAtTheBegining());
        System.out.println("deleted node:"+sll.deleteNodeAtTheBegining());
        sll.display();
    }
}
 