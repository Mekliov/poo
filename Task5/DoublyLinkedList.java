package Task5;
public class DoublyLinkedList {
    public static int nodeNumber = 0;
    int data;
    DoublyLinkedList nextNode;
    DoublyLinkedList prevNode;

    public DoublyLinkedList(int data) {
        this.data = data;
        nodeNumber++;
    }
}
