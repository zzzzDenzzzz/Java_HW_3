package task.five;
import static java.lang.System.*;

public class Trombone extends MusicalInstrument {
    private final String key;

    public Trombone(String name, String key) {
        super(name);
        this.key = key;
    }

    @Override
    public void desc() {
        super.desc();
        out.println("Тип: Тромбон");
        out.println("Ключ: " + key);
    }
}
