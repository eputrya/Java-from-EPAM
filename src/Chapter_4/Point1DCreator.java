package Chapter_4;

import java.util.Random;

/* # 12 # методы-подставки # Point1DCreator.java # Point2DCreator.java # PointMain.java*/
public class Point1DCreator {
    public Point1Dv3 create() {
        System.out.println("log in Point1DCreator");
        return new Point1Dv3(new Random().nextInt(100));
    }
}

class Point2DCreator extends Point1DCreator {
    @Override
    public Point2Dv2 create() {
        System.out.println("log in Point2DCreator");
        Random random = new Random();
        return new Point2Dv2(random.nextInt(10), random.nextInt(10));
    }
}

class PointMainv2 {
    public static void main(String[] args) {
        Point1DCreator creator = new Point2DCreator();
        // Point2Dv2 point = creator.create(); // compile error
        Point1Dv3 pointA = creator.create(); /* when compiling - overload, when running - overriding */
        System.out.println(pointA);
        Point2DCreator creator2 = new Point2DCreator();
        Point2Dv2 pointB = creator2.create();
        System.out.println(pointB);
    }
}