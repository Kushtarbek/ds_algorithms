package Stack;

import java.util.Iterator;

public interface Iterable <Item>{
    Iterator<Item> iterator();
} //Iterable is an interface that has a method that returns an Iterator.


//public interface Iterator<Item> {
//    boolean hasNext();
//    Item next();
//    void remove();
//} //Iterator is interface that has methods hasNext() and next().

//Why make data structure Iterabel?
//Java supports elegant client code

//for (String s : stack)
//System.out.println(s);

//>>>> equivalent code to the above
//Iterator<String> i = stack.iterator();
//while(i.hasNext()){
//    String s = i.next();
//    System.out.printlb(s)
//        }
