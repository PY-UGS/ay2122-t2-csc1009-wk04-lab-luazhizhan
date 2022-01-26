public class StackOfIntegers {
    private int[] elements;
    private int size = 0;

    public StackOfIntegers() {
        this.elements = new int[16];
    }

    public StackOfIntegers(int capacity) {
        this.elements = new int[capacity];
    }

    public boolean empty() {
        return size == 0;
    }

    public int peek() {
        if (empty()) {
            throw new ArrayIndexOutOfBoundsException("Stack is empty");
        }
        return this.elements[size];
    }

    public void push(int value) {
        if (size == this.elements.length - 1) {
            throw new StackOverflowError("Exceeded stack capacity");
        }
        this.elements[size++] = value;
    }

    public int pop() {
        if (empty()) {
            throw new ArrayIndexOutOfBoundsException("Stack is empty");
        }
        int element = this.elements[--size];
        return element;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }

}
