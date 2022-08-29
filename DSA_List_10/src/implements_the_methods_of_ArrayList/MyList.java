package implements_the_methods_of_ArrayList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void ensureCapa() {
        if (size > elements.length) {
            int biggerSize = size * 2 + 1;
            elements = Arrays.copyOf(elements, biggerSize);
        }
    }

    public void add(int index, E e) {
        if (index >= 0 && index <= size) {
            size += 1;
            ensureCapa();
            for (int i = size - 2; i >= index; i--) {
                elements[i + 1] = elements[i];
            }
            elements[index] = e;
        }
        else{
            System.out.println("index khong hop le");
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= DEFAULT_CAPACITY) {
            throw new IndexOutOfBoundsException("index" + index + "out of bounds");
        }
    }

    public E remove(int index) {
        E temp = null;
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                elements[i] = elements[i + 1];
            }
            size -= 1;
            return temp;
        }
        else {
            return null;
        }
    }


    public int size() {
        return this.size;
    }

    public boolean contains(E e) {
        for (int i = 0; i < DEFAULT_CAPACITY; i++) {
            if (e.equals(elements[i]))
                return true;
        }
        return false;
    }

    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(elements[i]))
                return i;
        }
        return -1;
    }

    public boolean add(E e) {
        return false;
    }

    public int lastIndexOf(E e) {
        for (int i = size; i < size; i--) {
            if (e.equals(elements[i]))
                return i;
        }
        return -1;
    }

    public E get(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index : " + index + ",size : " + index);
        }
        return (E) elements[index];
    }

    public void clear() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void printMyList() {
        int i = 0;
        for (E e : (E[]) elements) {
            System.out.println("Element " + i + " : " + e);
            i++;
        }
    }

    @Override
    public String toString() {
        return "MyList = " + Arrays.toString(elements);
    }
}
