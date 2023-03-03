package Chapter_1;

public class Coin {
    public double diameter; // encapsulation violation
    private double weight;  // correct encapsulation

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double value) {
        if (value > 0) {
            diameter = value;
        } else {
            diameter = 0.01; // default value
        }
    }

    public double takeWeight() { // incorrect method name
        return weight;
    }

    public void setWeight(double value) {
        weight = value;
    }
}