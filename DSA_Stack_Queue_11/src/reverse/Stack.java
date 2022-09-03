package reverse;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class Stack<T>{
    private LinkedList<T> stack;
    public Stack(){
        stack = new LinkedList<>();
    }
    public void push(T element){
        stack.addFirst(element);
    }
    public T pop(){
       if (isEmpty()){
           throw new EmptyStackException();
       }
       return stack.removeFirst();
    }
    public boolean isEmpty(){
        return stack.size() == 0;
    }
    public int size(){
        return stack.size();
    }

}
