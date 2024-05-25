package task.five;
import static java.lang.System.*;

public class Cello extends MusicalInstrument {
    private final String size;

    public Cello(String name, String size) {
        super(name);
        this.size = size;
    }

    @Override
    public void desc() {
        super.desc();
        out.println("Тип: Виолончель");
        out.println("Размер: " + size);
    }
}
