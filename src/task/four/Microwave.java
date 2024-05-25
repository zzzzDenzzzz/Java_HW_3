package task.four;
import static java.lang.System.*;

public class Microwave extends Device {
    private final int power;

    public Microwave(String name, int power) {
        super(name);
        this.power = power;
    }

    @Override
    public void desc() {
        super.desc();
        out.println("Тип: Микроволновка");
        out.println("Мощность: " + power + " Вт");
    }
}
