public class Stack <V> {
    private int maxSize;
    private int top;
    private V arr[];


    /*
    Java does not allow generic type arrays. So we have used an
    array of Object type and type-casted it to the generic type V.
    This type-casting is unsafe and produces a warning.
    Comment out the line below and execute again to see the warning.
    */
    @SuppressWarnings("unchecked")
    public Stack( int max_size) {
        this.maxSize = max_size;
        this.top = -1; //initially when stack is empty
        arr = (v[] new Object[max_size]);  //type casting Object[] to V[]
    }

    //returns the maximum size capacity
    public getCapacity() {
        return maxSize;
    }

    //returns true if Stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    //returns true if Stack is full
    public boolean isFull() {
        return top == maxSize -1;
    }

    //returns the value at top of Stack
    public V top() {
        if(isEmpty()){
            return null;
        }
        return array[top];
    }


}

/*
Stack as a container, in which we can add items and remove them.
Only the top of this container is open, so the item we put in first will be taken out last,
and the items we put in last will be taken out first. This is called the LAST IN FIRST OUT (LIFO) ordering.

Used in Depth First Search and Expression Evaluation Algorithm, etc.

Stacks are used for the below actions:
    To backtrack to the prev task/state e.g. in a recursive code
    To store a partially completed task e.g. when you are exploring a two different paths
    on Graph from a point while calculating the smallest path to the target.

A typical Stack must offer the following functionalities:
    push	Inserts an element at the top
    pop	    Removes an element from the top and returns it
    isFull	Returns true if the stack is full and false otherwise
    isEmpty	Returns true if the stack is empty and false otherwise
    top	    Returns the element at the top (i.e., the one added most recently)

* */
