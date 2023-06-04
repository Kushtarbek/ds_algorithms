package Stack;

public class GenericStack {
//    public static void main(String[] args) {
//
//    }
    public class Stack<Item>{
        private Node first = null;
        private class Node {
            Item item;
            Node next;
        }

        public boolean isEmpty(){
            return first == null;
        }

        public void push(Item item) {
            Node oldfist = first;
            first = new Node();
            first.item = item;
            first.next = oldfist;
        }

        public Item pop(){
            Item item = first.item;
            first = first.next;
            return item;
        }
}


}
