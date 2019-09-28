import java.util.Iterator;

public class GLIterator<I> implements Iterator<I> {
    private GenericList<I>.Node<I> curr;

    public GLIterator(GenericList<I> list) {
        curr = list.head;
    }

    @Override
    public boolean hasNext() {
        return curr != null;
    }

    @Override
    public I next() {
        I data = curr.data;
        curr = curr.next;
        return data;
    }
}
