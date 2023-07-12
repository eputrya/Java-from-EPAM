package Chapter_4;

/* # 3 # попытка наследования приватного метода # Dumb.java # Dumber.java */
public class Dumb2 {
    private void action() {
        System.out.println("Dumb");
    }
}

class Dumber2 extends Dumb2 {
    //  @Override
    // compile error
    void action() {
        System.out.println("Dumber");
    }
}
