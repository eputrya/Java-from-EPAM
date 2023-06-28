package Chapter_3;

/* # 3 # плохое проектирование метода max() # MathUgly*/
public class MathUgly {
    private double a;
    private double b;

    public void setA(double a) {
        this.a = a;
    }

    private void setB(double b) {
        this.b = b;
    }

    public double max() {
        return a > b ? a : b;
    }
}
