package task.one;
import static java.lang.System.*;

public class Pilot extends Human {
    private String aircraftType;

    // Конструктор класса Pilot
    public Pilot(String name, int age, String gender, String aircraftType) {
        super(name, age, gender);
        this.aircraftType = aircraftType;
    }

    // Геттеры и сеттеры
    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    // Метод для вывода информации о летчике
    public void displayInfo() {
        super.displayInfo();
        out.println("Aircraft Type: " + aircraftType);
    }
}
