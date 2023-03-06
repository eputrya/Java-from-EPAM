package Chapter_1;

/* # 10 # создание объекта, доступ к полям и методам объекта # CompareCoin.java
# CoinMain.java */

public class CompareCoin {
    public void compareDiameter(Coin2 first, Coin2 second) {
        double delta = first.getDiameter() - second.getDiameter();
        if (delta > 0) {
            System.out.println("The first coin is more than the second for " + delta);
        } else if (delta == 0) {
            System.out.println("Coins have the same diameter");
        } else {
            System.out.println("The second coin is more than the first on " + -delta);
        }
    }
}
