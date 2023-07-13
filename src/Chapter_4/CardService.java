package Chapter_4;

/* # 5 # вызов полиморфного метода # CardService.java */
public class CardService {
    public void doService(CardAction action, double amount) {
        action.doPayment(amount);
    }
}
