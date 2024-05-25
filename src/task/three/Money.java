package task.three;
import static java.lang.System.*;

public class Money {
    private int dollars;
    private int cents;

    public Money(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
    }

    public int getDollars() {
        return dollars;
    }

    public int getCents() {
        return cents;
    }

    public void setDollars(int dollars) {
        this.dollars = dollars;
    }

    public void setCents(int cents) {
        this.cents = cents;
    }

    public void display() {
        out.println("$" + dollars + "." + cents);
    }

    public void decrease(int amount) {
        if (amount >= 100) {
            dollars -= amount / 100;
            cents -= amount % 100;
        } else {
            cents -= amount;
        }
        if (cents < 0) {
            dollars--;
            cents += 100;
        }
    }
}
