package Stack;

import java.util.LinkedList;

public class GenStack<E> {
    private LinkedList<E> list  = new LinkedList<E>();

    public void push(E item){
        list.addFirst(item);
    }

    public E pop() {
        return list.poll();
    }

    public E peek(){
        return list.peek();
    }

    public boolean hasItems(){
        return !list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public static void main (String[] args) {
        GenStack<String> gs = new GenStack<String>();

        System.out.println("Pushing four items onto the stack");
        gs.push("One");
        gs.push("Two");
        gs.push("Three");
        gs.push("Four");
    }
}
