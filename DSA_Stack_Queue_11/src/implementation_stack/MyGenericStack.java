package implementation_stack;

import java.util.EmptyStackException;
import java.util.LinkedList;

import static javafx.beans.binding.Bindings.isEmpty;

public class MyGenericStack <T> {
    public LinkedList<T> stack;
    public MyGenericStack(){
        stack = new LinkedList<>();
    }
    // Cài đặt phương thức push()
    public void push(T elements){
        stack.addFirst(elements);
    }
    // Cài đặt phương thức pop()
    public T pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    //Cài đặt phương thức isEmpty()
    public boolean isEmpty() {
        if (stack.size()==0){
            return true;
        }
        return false;
    }
    //Cài đặt phương thức size()
    public int size(){
        return stack.size();
    }
}
