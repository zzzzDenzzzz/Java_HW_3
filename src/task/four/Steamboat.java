package task.four;
import static java.lang.System.*;

public class Steamboat extends Device {
    private final String manufacturer;
    private final int passengerCapacity;

    public Steamboat(String name, String manufacturer, int passengerCapacity) {
        super(name);
        this.manufacturer = manufacturer;
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void desc() {
        super.desc();
        out.println("Тип: Пароход");
        out.println("Производитель: " + manufacturer);
        out.println("Вместимость пассажиров: " + passengerCapacity);
    }
}
