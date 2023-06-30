package Chapter_3;

/* # 12 # final-поля и переменные # Card.java */

public class Card {
    // uninitialized constant
    public final long BANK_ID; // initialization is not done by default!

    public Card() {
        // initialization in the constructor in this case is required!
        BANK_ID = 100_000; // only once
    }

    public Card(long id) {
        // initialization in the constructor in this case is required!
        BANK_ID = id; // only once
    }

    public final boolean checkRights(final int NUMBER) {
        int value = 1;
        final int CODE = 42 + value;
        // NUMBER = 1; // compile error
        // CODE = 1;  // compile error
        return CODE == NUMBER;
    }
}
