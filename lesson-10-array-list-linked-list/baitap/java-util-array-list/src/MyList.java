import java.util.ArrayList;
import java.util.List;

public class MyList<E>  implements Cloneable {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private E type;
    private  List<E> arrayList = new ArrayList<>();

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(E element) {
        this.type = element;
    }

    public void add(int index, E e) {
        arrayList.add(index, e);
    }
    public void remove(int i) {
        arrayList.remove(i);
    }

    public int size() {
        return arrayList.size();
    }

//    public E clone() {
//        return (E) arrayList.c
//
//    }

    public boolean contains (E o) {
        return arrayList.contains(o);
    }

    public int indexOf (E o) {
        return arrayList.indexOf(o);
    }

    public boolean add(E e) {
        arrayList.add(e);
        return true;
    }


    public E get(int i) {
        return arrayList.get(i);
    }

    public void clear() {
        arrayList.clear();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (E e : arrayList) {
            result.append(e).append(" ");
        }
        return result.toString();
    }
}
