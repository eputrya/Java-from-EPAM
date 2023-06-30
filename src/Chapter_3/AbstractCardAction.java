package Chapter_3;

/* # 14 # абстрактный класс и метод # AbstractCardAction.java */

import java.math.BigDecimal;

public abstract class AbstractCardAction {
    private BigDecimal amount;

    public AbstractCardAction() {
    }

    public abstract void doPayment(BigDecimal amountPayment); // no implementation

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
