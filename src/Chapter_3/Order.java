package Chapter_3;

public class Order {
    // class instance variable
    private long orderId;
    // class/static variable
    static int bonus;
    // class instance final variable
    public final int CURRENT_RANGE = (int) (Math.random() * 42);
    // class instance final variable
    // private final MutableType mutable = new MutableType();
    // class/static final variable
    public final static int PURCHASE_TAX = 5;

    // constructors
    // methods
    public double calculatePrice(double price, int counter) {
        // local variable of the method does not get the default value
        double amount;
        // amount++; compile error, variable not initialized
        amount = (price - bonus) * counter; // initialization of a local variable
        double tax = amount * PURCHASE_TAX / 100;
        return amount + tax;
    }
}
