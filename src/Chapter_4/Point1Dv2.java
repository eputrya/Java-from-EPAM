package Chapter_4;

// # 10 # ошибка с зацикливанием вызова конструктора # Point1Dv2.java
public class Point1Dv2 {
    private int x;

    public Point1Dv2(int x){ // recursive constructor invocation
        // this();
        this.x = x;
    }

    public Point1Dv2(){ // recursive constructor invocation
        this(42);
    }
}
