package Chapter_1;

// # 8 # демонстрация последствий нарушения инкапсуляции # CoinMain.java

public class CoinMain {
    public static void main(String[] args) {
        Coin coin = new Coin();
        coin.diameter = -0.12; // incorrect: direct access--> ob.setWeight(100);
        // coin.weight = -150; // field is not available: compile error
    }
}
