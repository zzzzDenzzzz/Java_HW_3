package task.four;
import static java.lang.System.*;

public class Kettle extends Device {
    private final int volume;

    public Kettle(String name, int volume) {
        super(name);
        this.volume = volume;
    }

    @Override
    public void desc() {
        super.desc();
        out.println("Тип: Чайник");
        out.println("Объем: " + volume + " мл");
    }
}
