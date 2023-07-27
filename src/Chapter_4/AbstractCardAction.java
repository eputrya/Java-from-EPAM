package Chapter_4;

/* # 14 # абстрактный класс и метод # AbstractCardAction.java */
public abstract class AbstractCardAction {
    private long actionId;

    public AbstractCardAction() {
    }

    public void check() {
    }

    public abstract void doPayment(double amountPayment);
}
