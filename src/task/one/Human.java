package task.one;
import static java.lang.System.*;

public class Human {
    private String name;
    private int age;
    private String gender;

    // Конструктор класса Human
    public Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // Метод для вывода информации о человеке
    public void displayInfo() {
        out.println("Name: " + name);
        out.println("Age: " + age);
        out.println("Gender: " + gender);
    }
}
