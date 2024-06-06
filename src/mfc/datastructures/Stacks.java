package mfc.datastructures;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args){
        Stack<String> stack = new Stack<String>();

        stack.push("S.T.A.L.K.E.R");
        stack.push("DOOM");
        stack.push("Battlefield");
        stack.push("Minecraft");

//      Print stack
        System.out.println(stack);
//      Remove top item from stack and put its value on topObj var
        String topObj = stack.pop();
//      Print stack after pop
        System.out.println(stack);
//      Print topObj var
        System.out.println(topObj);

//      Print topmost item on stack
        System.out.println(stack.peek());
//      Search position of an object within stack, returns its position, starting at (1 indexed), if not found, returns -1
        System.out.println(stack.search("S.T.A.L.K.E.R"));

        //Uses of stacks
        //Undo/redo features in text editors
        //Moving back/forward in browser histories
        //Backtracking algorithms
        //Calling functions (call stack)
    }
}
