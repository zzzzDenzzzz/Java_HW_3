package task.two;
import static java.lang.System.*;

public class Tiger extends Animal {
    private String type;

    public Tiger(String name, int age, String type) {
        super(name, age);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void hunt() {
        out.println(getName() + " охотится.");
    }

    public void roar() {
        out.println(getName() + " рычит.");
    }
}
