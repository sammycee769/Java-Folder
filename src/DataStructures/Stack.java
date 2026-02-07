package DataStructures;


public class Stack {
    private String[] stack;
    private int top;
    private  int size;

    public Stack(int size) {
        top = -1;
        this.size = size;
        stack = new String[size];
    }

    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == size - 1;
    }

    public void push(String value)  {
        if (isFull()){
            throw new IllegalStateException("Stack is full");
        }
        stack[++top] = value;
    }
    public String pop() {
        if (isEmpty()){
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top--];
    }
    public String peek() {
        if (isEmpty()){
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top];
    }

}
