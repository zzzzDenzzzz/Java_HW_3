package task.four;
import static java.lang.System.*;

public class Car extends Device {
    private final String model;

    public Car(String name, String model) {
        super(name);
        this.model = model;
    }

    @Override
    public void desc() {
        super.desc();
        out.println("Тип: Автомобиль");
        out.println("Модель: " + model);
    }
}
