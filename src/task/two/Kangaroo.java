package task.two;
import static java.lang.System.*;

class Kangaroo extends Animal {
    private int jumpHeight;

    public Kangaroo(String name, int age, int jumpHeight) {
        super(name, age);
        this.jumpHeight = jumpHeight;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(int jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    public void jump() {
        out.println(getName() + " прыгает на высоту " + jumpHeight + " м.");
    }
}
