import java.util.Iterator;

/*
 *  problem description : https://pastebin.com/pFbThkZi
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println("Testing stack");
        GenericStack<Integer> stack = new GenericStack<Integer>();
        stack.print();
        stack.push(4);
        stack.push(6);
        stack.print();

        System.out.println("Testing iterator");
        Iterator iter = stack.createIterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
