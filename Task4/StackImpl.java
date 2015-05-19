package Task4;
import java.util.ArrayList;
import java.util.List;

public class StackImpl implements Stack {
    List<Object> list = new ArrayList<Object>();

    @Override
    public void pushElement(int index, Object object) {

        if (list.contains(object)) {
            System.out.println("This element already exist");
        }
        list.add(index, object);
    }

    @Override
    public void deleteElement(int index) {
        list.remove(index);

    }

    @Override
    public int length() {

        return list.size();
    }

    @Override
    public boolean isEmpty() {
        if (list.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public void Clear() {
        list.removeAll(list);

    }
public static void main(String args[])
{
    StackImpl stak= new StackImpl();
    stak.pushElement(0, 555);
    System.out.println(stak);
}
}
