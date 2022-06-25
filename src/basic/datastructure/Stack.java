package basic.datastructure;

public class Stack {

    public static void main(String[] args) {

        java.util.Stack<Integer> stack = new java.util.Stack<Integer>();
        for (int i=1; i<11; i++) {
            stack.push(i);
        }

        System.out.println("==== 현재 위치 : stack.peek() => " + stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println("==== 현재 위치 : stack.peek() => " + stack.peek());

    }

}
