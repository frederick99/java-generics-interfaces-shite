import java.util.Iterator;

public class GenericStack<I> extends GenericList<I> implements CreateIterator {
    public GenericStack(){
        head = null;
        length = 0;
    }

    public void push(I data) {
        add(data);
    }

    public I pop() {
        return delete();
    }

    @Override
    void add(I data) {
        head = new Node<I>(data, head);
        length++;
    }

    @Override
    I delete() {
        if (length == 0)
            return null;

        I data = head.data;
        head = head.next;
        length--;
        return data;
    }

    @Override
    public Iterator<I> createIterator() {
        return new GLIterator<I>(this);
    }
}
