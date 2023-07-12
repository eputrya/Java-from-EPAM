package Chapter_4;

/* # 4 # попытка переопределения final-метода # MasterCardAction.java
# VisaCardAction.java */
public class MasterCardAction extends CreditCardAction {
    @Override // doPayment() cannot be polymorphic
    public final void doPayment(double amountPayment) {
        System.out.println("complete from MasterCard");
    }
}

class VisaCardAction extends MasterCardAction {
    // @Override
    // public void doPayment(double amountPayment) {// impossible method
    //}
}
