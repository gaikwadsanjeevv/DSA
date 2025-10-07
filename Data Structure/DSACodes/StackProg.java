import java.util.Stack;

public class StackProg {
    public static void main(String[] args) {

        Stack <String> stack = new Stack<String>();

        stack.push("Sanjeev");
        stack.push("Gaikwad");
        stack.push("Nashik");
        stack.push("USA");
        stack.push("USA");
        stack.push("USA");

        System.out.println(stack.empty());
        System.out.println(stack.search("USA"));
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
     }
}
