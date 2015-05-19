package Task5;

public class LinkedList implements DList {
    static DoublyLinkedList root;
    static DoublyLinkedList curr;
    static DoublyLinkedList temp;

    @Override
    public void add(int data) {
        DoublyLinkedList node = new DoublyLinkedList(data);
        if (root == null) {
            root = node;
            root.nextNode = null;
            root.prevNode = null;
        } else {
            curr = root;
            while (curr.nextNode != null) {
                curr = curr.nextNode;
            }
            curr.nextNode = node;
            node.prevNode = curr;
            node.nextNode = null;

        }

    }

    @Override
    public int size() {

        return DoublyLinkedList.nodeNumber;
    }

    @Override
    public void getHead() {
        curr = root;
        while (DoublyLinkedList.nodeNumber > 1) {
            
            if (curr.nextNode != null) {
                curr = curr.nextNode;
            }
            DoublyLinkedList.nodeNumber--;
        }
        System.out.println(curr.data);

    }

    @Override
    public int getTail() {
        curr = root;

        return curr.data;
    }

    @Override
    public void remove(int index) {
        int num = 1;
        curr = root;
        if (index == 1) {
            root = curr.nextNode;
            curr=curr.nextNode;
            curr.prevNode = null;
        }
        else
        {
            while(num!=index)
            {
                curr=curr.nextNode;
                num++;
            }
        }
        if(curr.nextNode==null)
        {
            curr.prevNode.nextNode=null;
            curr.prevNode=null;
        }
        else
        {
            curr.prevNode.nextNode=curr.nextNode;
            curr.nextNode.prevNode=curr.prevNode;
        }
            

    }

    @Override
    public void insert(int data, int after) {
        DoublyLinkedList node = new DoublyLinkedList(data);
        int num = 1;
        curr = root;
        while (num != after && curr != null) {
            curr = curr.nextNode;
            num++;
        }
        temp = curr.nextNode;
        curr.nextNode = node;
        node.nextNode = temp;
        temp.prevNode = node;
        node.prevNode = curr;

    }

    @Override
    public void print() {
      curr=root;
      while(curr!=null)
      {
          System.out.println(curr.data);
          if(curr.nextNode!=null)
          {
              curr=curr.nextNode;
          }
          else if(curr.nextNode==null)
          {
              break;
          }
      }
        
    }
    
}
