class Stack {
    int maxSize;
    int top;
    int[] stackArray;
    Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }
    void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow! Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println(value + " pushed into stack");
        }
    }
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Cannot pop");
        } else {
            int popped = stackArray[top--];
            System.out.println(popped + " popped from stack");
        }
    }
    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element is: " + stackArray[top]);
        }
    }
}
class StackOverflowUnderflowExample {
    public static void main(String[] args) {
        Stack stack = new Stack(3);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}
