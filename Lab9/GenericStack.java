package Lab9;

public class GenericStack<E> {

    private E[] elements;
    private int size = 0;
    private static final int CAPACITY = 10;

    public GenericStack() {
        elements = (E[]) new Object[CAPACITY];
    }

    public int getSize() {
        return size;
    }

    public E peek() {
        if (isEmpty()) {
            System.out.println("array is empty");
        }
        return elements[size - 1];
    }

    public E pop() {
        if (isEmpty()) {
            System.out.println("array is empty");
        }
        E value = elements[--size];
        elements[size] = null;
        return value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(E value) {
        if (size == elements.length) {
            E[] newElements;
            newElements = (E[]) new Object[elements.length * 2];

            for (int i = 0; i < elements.length; i++) {
                newElements[i] = elements[i];
            }

            elements = newElements;

        }

        elements[size] = value;
        size++;
    }

}