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
    void print() {
        StringBuilder sb = new StringBuilder("[");
        Node<I> curr = head;
        while (curr != null) {
            sb.append(curr.data.toString());
            sb.append(",");
            curr = curr.next;
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

    @Override
    void add(I data) {
        Node<I> node = new Node<I>();
        node.data = data;
        node.next = head;
        head = node;
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
    public Iterator createIterator() {
        return new GLIterator<I>(this);
    }
}
