package task.five;
import static java.lang.System.*;

public class Ukulele extends MusicalInstrument {
    private final int numberOfStrings;

    public Ukulele(String name, int numberOfStrings) {
        super(name);
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void desc() {
        super.desc();
        out.println("Тип: Укулеле");
        out.println("Количество струн: " + numberOfStrings);
    }
}
