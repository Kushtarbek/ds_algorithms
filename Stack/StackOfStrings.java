package Stack;

public class StackOfStrings {
//    public static void main(String[] args) {
        StackOfStrings stack = new StackOfStrings();
        while( !StdIn.isEmpty()) {
            String s = StdIn.readString();
            if(s.equals("-")) StdOut.print(stack.pop());
            else    stack.push(s);
        }
    //}
}
