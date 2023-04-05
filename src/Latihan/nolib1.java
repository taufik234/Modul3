package Latihan;

public class nolib1 {
    private int top;
    private int capacity;
    private String[] array;

    public nolib1(int capacity) {
        this.capacity = capacity;
        this.array = new String[capacity];
        this.top = -1;
    }

    public void push(String value) {
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        array[++top] = value;
    }

    public String pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return array[top--];
    }

    public String peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return array[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public int search(String value) {
        for (int i = top; i >= 0; i--) {
            if (array[i].equals(value)) {
                return top - i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        nolib1 st = new nolib1(5);
        st.push("aku");
        st.push("Anak");
        st.push("Indonesia");

        System.out.println("Next : " + st.peek());

        st.push("Raya");
        System.out.println(st.pop());
        st.push("!");

        int count = st.search("aku");
        while (count != -1 && count > 1){
            st.pop();
            count--;
        }
        System.out.println(st.pop());
        st.isEmpty();
        System.out.println(st.isEmpty());
    }
}
