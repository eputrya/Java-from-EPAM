package Chapter_4;

/* # 1 # наследование класса и переопределение метода # CardAction.java
# CreditCardAction.java # CardRunner.java */
public class CardAction {
    public void doPayment(double amountPayment) {
        System.out.println("complete from debt card");
    }
}

class CreditCardAction extends CardAction {
    @Override // is used  when override a method in sub class
    public void doPayment(double amountPayment) { // override method
        System.out.println("complete from credit card");
    }

    public boolean checkCreditLimit() { // own method
        return true;
    }
}

class CardRunner {
    public static void main(String[] args) {
        CardAction action1 = new CardAction();
        CardAction action2 = new CreditCardActionv2();
        CreditCardActionv2 cc = new CreditCardActionv2();
        // CreditCardAction cca = new CardAction(); // compile error: class cast
        action1.doPayment(15.5); // method of CardAction
        action2.doPayment(21.2); // polymorphic method: CreditCardAction
        // dc2.checkCreditLimit(); // compile error: non-polymorphic method
        ((CreditCardActionv2) action2).checkCreditLimit(); // ok
        cc.doPayment(7.0); // non-polymorphic method CreditCardAction
        // ((CreditCardAction) action1).checkCreditLimit(); // runtime error: class cast
    }
}

