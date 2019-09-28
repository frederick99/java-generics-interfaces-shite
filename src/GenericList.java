import java.util.Iterator;

abstract class GenericList<I> {
    Node<I> head;
    int length;

    void print() {
        StringBuilder sb = new StringBuilder("[");
        Iterator iterator = new GLIterator<I>(this);
        // tell me if there is a better way to do this
        if (iterator.hasNext())
            sb.append(iterator.next());
        while (iterator.hasNext()) {
            sb.append(", ");
            sb.append(iterator.next());
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

    abstract void add(I data);
    abstract I delete();

    int size() { return length; }

    static class Node<T> {
        T data;
        Node<T> next;

        Node() {
            data = null;
            next = null;
        }

        Node(T data) {
            this.data = data;
            this.next = null;
        }

        Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }
}
