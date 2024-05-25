package task.five;
import static java.lang.System.*;

public class MusicalInstrument {
    private String name;

    public MusicalInstrument(String name) {
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
        out.println("Название музыкального инструмента: " + name);
    }

    public void desc() {
        out.println("Описание музыкального инструмента: " + name);
    }

    public void history() {
        out.println("История создания музыкального инструмента: " + name);
    }
}
