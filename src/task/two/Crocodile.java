package task.two;
import static java.lang.System.*;

public class Crocodile extends Animal {
    private int length;

    public Crocodile(String name, int age, int length) {
        super(name, age);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void swim() {
        out.println(getName() + " плавает.");
    }
}
