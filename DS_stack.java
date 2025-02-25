import java.util.Stack;

public class DS_stack {
    public static void main(String[] args){
        //Stack - LIFO
        //Stack - Vertical tower

        Stack<String> stack = new Stack<String>();

        System.out.println(stack.empty());

        stack.push("a");
        stack.push("aa");
        stack.push("aaa");
        stack.push("aaaa");

        System.out.println("Original stack: "+stack);

        String letter = stack.pop();
        System.out.println("first element pop: "+letter);

        stack.pop();
        stack.pop();
        System.out.println("stack after pop : "+stack);

        stack.push("b");
        stack.push("bb");
        stack.push("bbbb");

        System.out.println("element on the top: "+stack.peek());
        System.out.println("stack after peek : "+stack);

        System.out.println("position of element b: "+stack.search("b")); // start from position 1 from the top, if does not exist return -1

        //uses of stack :
        //undo/ redo text editor
        //back / forward browser
        //back tracking algorithm
        //calling function




    }

}
