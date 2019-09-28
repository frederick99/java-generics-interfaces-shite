public class GenericQueue<I> extends GenericList<I> {
    private Node tail;
    public GenericQueue(){}

    public void enqueue(I data) {
        add(data);
    }

    public I dequeue() {
        return delete();
    }

    @Override
    void add(I data) {
        if (length == 0) {
            head = new Node<I>(data);
            tail = head;
        } else {
            tail.next = new Node<I>(data);
            tail = tail.next;
        }
        length++;
    }

    @Override
    I delete() {
        if (length == 0)
            return null;

        I data = head.data;
        head = head.next;
        if (head == null)
            tail = null;
        length--;
        return data;
    }
}
