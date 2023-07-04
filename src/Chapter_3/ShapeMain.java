package Chapter_3;

/* # 29 # применение перечисления # ShapeMain.java */
public class ShapeMain {
    public static void main(String[] args) {
        double x = 2, y = 3;
        Shape sh;
        sh = Shape.RECTANGLE;
        System.out.printf("%9s = %5.2f%n", sh, sh.defineSquare(x, y));
        sh = Shape.valueOf(Shape.class, "TRIANGLE");
        System.out.printf("%9s = %5.2f%n", sh, sh.defineSquare(x, y));
        sh = Shape.CIRCLE;
        System.out.printf("%9s = %5.2f%n", sh, sh.defineSquare(x));
    }
}
