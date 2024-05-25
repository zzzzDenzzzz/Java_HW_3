package task.four;
import static java.lang.System.*;

public class Device {
    private String name;

    public Device(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sound() {
        out.println(name + " издает звук.");
    }

    public void show() {
        out.println("Название устройства: " + name);
    }

    public void desc() {
        out.println("Описание устройства: " + name);
    }
}
