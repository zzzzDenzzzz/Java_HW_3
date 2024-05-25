package task.one;
import static java.lang.System.*;

public class Builder extends Human {
    private String specialization;

    // Конструктор класса Builder
    public Builder(String name, int age, String gender, String specialization) {
        super(name, age, gender);
        this.specialization = specialization;
    }

    // Геттеры и сеттеры
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    // Метод для вывода информации о строителе
    public void displayInfo() {
        super.displayInfo();
        out.println("Specialization: " + specialization);
    }
}
