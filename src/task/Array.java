package task;
import task.seven.ISort;
import task.six.IMath;
import java.util.Arrays;
import  static java.lang.System.*;

public class Array implements IMath, ISort {
    private int[] elements;
    private int size;
    private static final String INDEX_OUT_OF_BOUNDS_MESSAGE = "Index out of bounds";
    private static final String EMPTY_ARRAY_MESSAGE = "Array is empty";

    public Array(int capacity) {
        elements = new int[capacity];
        size = 0;
    }

    public int size() {
        return size;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(INDEX_OUT_OF_BOUNDS_MESSAGE);
        }
        return elements[index];
    }

    public void set(int index, int value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(INDEX_OUT_OF_BOUNDS_MESSAGE);
        }
        elements[index] = value;
    }

    public void add(int value) {
        if (size == elements.length) {
            resize();
        }
        elements[size] = value;
        size++;
    }

    private void resize() {
        int[] newArray = new int[elements.length * 2];
        arraycopy(elements, 0, newArray, 0, size);
        elements = newArray;
    }

    public void print() {
        for (int element : elements) {
            out.print(element + " ");
        }
        out.println();
    }

    private void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    @Override
    public int max() {
        if (size == 0) {
            throw new IllegalStateException(EMPTY_ARRAY_MESSAGE);
        }
        int max = elements[0];
        for (int i = 1; i < size; i++) {
            if (elements[i] > max) {
                max = elements[i];
            }
        }
        return max;
    }

    @Override
    public int min() {
        if (size == 0) {
            throw new IllegalStateException(EMPTY_ARRAY_MESSAGE);
        }
        int min = elements[0];
        for (int i = 1; i < size; i++) {
            if (elements[i] < min) {
                min = elements[i];
            }
        }
        return min;
    }

    @Override
    public float avg() {
        if (size == 0) {
            throw new IllegalStateException(EMPTY_ARRAY_MESSAGE);
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += elements[i];
        }
        return (float) sum / size;
    }

    @Override
    public void sortAsc() {
        Arrays.sort(elements, 0, size);
    }

    @Override
    public void sortDesc() {
        Arrays.sort(elements, 0, size);
        reverseArray(elements);
    }
}

