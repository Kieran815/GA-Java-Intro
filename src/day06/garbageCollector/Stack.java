package day06.garbageCollector;

class Stack {
    static final int MAX = 5;
    int top;
    int[] a = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        return (top < 0);
    }

    Stack() {
        top = -1;
    }

    boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return a[top--];
        }
    }

    int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return a[top];
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
            if (i < a.length - 1) {
                sb.append(",");
            }
        }
        sb.append(']');
        return sb.toString();
    }
}

class Main {
    public static void main(String... args) {
        Stack s = new Stack();
        s.push(10); // `push` object to stack
        s.push(20);
        s.push(30);
        System.out.println(s.peek()); // `peek` at next operation in stack
        System.out.println(s.pop() + " Popped from stack"); // `pop` off of stack

        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70); // this `push` will cause a `Stack Overflow`: there are only 5 allotted slots of meme

        System.out.println(s); // sout stack object

    }
}
