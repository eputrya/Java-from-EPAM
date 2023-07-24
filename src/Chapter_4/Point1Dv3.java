package Chapter_4;

/* # 11 # динамическое связывание методов # Point1D.java # Point2D.java
# Point3D.java # PointReport.java # PointMain.java */
public class Point1Dv3 {
    private int x;

    public Point1Dv3(int x) {
        this.x = x;
    }

    public double length() {
        return Math.abs(x);
    }

    @Override
    public String toString() {
        return " x=" + x;
    }
}

class Point2Dv2 extends Point1Dv3 {
    private int y;

    public Point2Dv2(int x, int y) {
        super(x);
        this.y = y;
    }

    @Override
    public double length() {
        return Math.hypot(super.length(), y);
        /* just length() is possible, because the method will call itself,
        which will lead to infinite and an error at runtime */
    }

    @Override
    public String toString() {
        return super.toString() + " y=" + y;
    }
}

class Point3Dv2 extends Point2Dv2 {
    private int z;

    public Point3Dv2(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public Point3Dv2() {
        this(-1, -1, -1);
    }

    @Override
    public double length() {
        return Math.hypot(super.length(), z);
    }

    @Override
    public String toString() {
        return super.toString() + " z=" + z;
    }
}

class PointReport {
    public void printReport(Point1Dv3 point) {
        System.out.printf("length=%.2f %s%n", point.length(), point);
    }
}

class PointMain {
    public static void main(String[] args) {
        PointReport report = new PointReport();
        Point1Dv3 point1 = new Point1Dv3(-7);
        report.printReport(point1);
        Point2Dv2 point2 = new Point2Dv2(3, 4);
        report.printReport(point2);
        Point3Dv2 point3 = new Point3Dv2(3, 4, 5);
        report.printReport(point3);

    }
}