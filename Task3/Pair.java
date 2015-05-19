package Task3;
public class Pair {
    private final Object object1;
    private final Object object2;

    public Pair(Object object1, Object object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    public Object getObject1() {

        return object1;
    }

    public Object getObject2() {
        return object2;
    }

    @Override
    public String toString() {

        return getObject1().toString() + " " + getObject2().toString();
    }

    @Override
    public boolean equals(Object obj) {
        Pair object = (Pair) obj;
        boolean result = false;
        if (this != null && obj != null) {
            if (this.getObject1().equals(object.getObject1()) && this.getObject2().equals(object.getObject2())) {
                result = true;
            } else {
                result = false;
            }

        }

        return result;

    }

}
