package Task5;


public class DoublyLMain {

    public static void main(String[] args) {
        LinkedList list= new LinkedList();
        list.add(1);
        list.add(20);
        list.add(41);
        list.add(16);
        list.add(144);
        list.insert(2, 2);
        list.remove(3);
       
        System.out.println(list.getTail());
        list.getHead();
        list.print();
        
       
    }

}
