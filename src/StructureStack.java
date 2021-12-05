
import java.util.EmptyStackException;
import java.util.Stack;

public class StructureStack {
    private final Stack<Integer> stack;
    private Integer minNumber;

    public StructureStack() {
        this.stack = new Stack<>();
    }

    public Integer PeekMin()throws EmptyStackException {
        if(CheckEmptyStack()) {
            throw new EmptyStackException();
        }
        return minNumber;
    }

    public void Pop()throws EmptyStackException {
        if(CheckEmptyStack()) {
            throw new EmptyStackException();
        } else{
            Integer t = stack.pop();
            if (t < minNumber) {
                minNumber = 2 * minNumber - t;
            }
        }
    }

    public void Push(Integer x) {
        if (CheckEmptyStack()) {
            minNumber = x;
            stack.push(x);
        }
        if (x < minNumber) {
            stack.push(2*x - minNumber);
            minNumber = x;
        } else {
            stack.push(x);
        }
    }

    private boolean CheckEmptyStack() {
        return stack.isEmpty();
    }
}

