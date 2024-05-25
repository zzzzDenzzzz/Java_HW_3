package task.five;
import static java.lang.System.*;

public class Violin extends MusicalInstrument {
    private final String material;

    public Violin(String name, String material) {
        super(name);
        this.material = material;
    }

    @Override
    public void desc() {
        super.desc();
        out.println("Тип: Скрипка");
        out.println("Материал: " + material);
    }
}
