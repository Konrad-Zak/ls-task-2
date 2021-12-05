import java.util.EmptyStackException;

public class Main {
    public static void main(String[] args) {

        StructureStack structureStack = new StructureStack();

        try {
            structureStack.Push(8);
            System.out.println("Actual min number in stack: " + structureStack.PeekMin());
            structureStack.Push(15);
            System.out.println("Actual min number in stack: " + structureStack.PeekMin());
            structureStack.Push(4);
            System.out.println("Actual min number in stack: " + structureStack.PeekMin());
            structureStack.Pop();
            System.out.println("Actual min number in stack: " + structureStack.PeekMin());
            structureStack.Push(2);
            System.out.println("Actual min number in stack: " + structureStack.PeekMin());
        } catch (EmptyStackException emptyStackException){
            emptyStackException.printStackTrace();
        }
    }
}
