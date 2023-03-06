package Chapter_1;

// # 9 # «туго» инкапсулированный класс (Java Bean) #

public class Coin2 {
    private double diameter;
    private double weight;

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double value) {
        if (value > 0) {
            diameter = value;
        } else {
            System.out.println("Negative diameter!");
        }
    }

    public double getWeight() { // correct name
        return weight;
    }

    private void setWeight(double value) {
        weight = value;
    }
}