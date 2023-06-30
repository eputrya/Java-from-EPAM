package Chapter_3;

/* # 13 # final-поля и переменные # Card.java */

public class Card2 {
    public final long BANK_ID;

    {
        BANK_ID = 111_111_111_111L;
    } // only once !!

    public Card2() {
        // initialization in the constructor is now impossible
    }

    public Card2(long id) {
        // BANK_ID = id; // compile error
    }
}
