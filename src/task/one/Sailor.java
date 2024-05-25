package task.one;
import static java.lang.System.*;

class Sailor extends Human {
    private String shipName;

    // Конструктор класса Sailor
    public Sailor(String name, int age, String gender, String shipName) {
        super(name, age, gender);
        this.shipName = shipName;
    }

    // Геттеры и сеттеры
    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    // Метод для вывода информации о моряке
    public void displayInfo() {
        super.displayInfo();
        out.println("Ship Name: " + shipName);
    }
}
