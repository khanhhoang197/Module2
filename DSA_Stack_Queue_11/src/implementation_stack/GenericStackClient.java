package implementation_stack;

public class GenericStackClient {
    public static void stackOfStrings(){
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("C0622G1 ");
        stack.push("Class ");
        stack.push("Khanh ");
        stack.push("Đức ");
        stack.push("Hoàng ");
        stack.push("Student ");
        System.out.printf("1.1 Size of stack after push operations: %s",stack.size());
        System.out.print("\n1.2 Pop elements from stack : ");
        while (!stack.isEmpty()){
            System.out.printf("%s", stack.pop());
        }
        System.out.printf("\n1.3 Size of stack after pop operations : %s", stack.size());
    }
    public static void stackOfIntegers(){
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(1 );
        stack.push(2 );
        stack.push(5 );
        stack.push(4 );
        stack.push(0 );
        stack.push(3 );
        System.out.printf("2.1 Size of stack after push operations: %d", stack.size());
        System.out.print("\n2.2 Pop elements from stack : ");
        while (!stack.isEmpty()){
            System.out.printf("%d",stack.pop());
        }
        System.out.printf("\n2.3 Size of stack after pop operations : %d\n", stack.size());
    }

    public static void main(String[] args) {
        System.out.println("1. Stack of Strings");
        stackOfStrings();
        System.out.println("\n2. Stack of integers");
        stackOfIntegers();

    }
}
