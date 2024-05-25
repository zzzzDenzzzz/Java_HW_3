import task.Array;
import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Array array = new Array(5);
        array.add(10);
        array.add(215);
        array.add(20);
        array.add(-2);
        array.add(30);

        out.println("Максимум: " + array.max());
        out.println("Минимум: " + array.min());
        out.println("Среднее: " + array.avg());

        out.println("Исходный массив:");
        array.print();

        out.println("Сортировка по возрастанию:");
        array.sortAsc();
        array.print();

        out.println("Сортировка по убыванию:");
        array.sortDesc();
        array.print();
    }
}