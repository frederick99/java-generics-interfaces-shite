public abstract class GenericList<I> {
    Node<I> head;
    protected int length;

    abstract void print();
    abstract void add(I data);
    abstract I delete();

    int size() { return length; }

    class Node<T> {
        public T data;
        Node<T> next;
    }
}
