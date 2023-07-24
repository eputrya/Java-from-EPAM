package Chapter_4;

// # 9 # super и this в конструкторе # Point1D.java # Point2D.java # Point3D.java
public class Point1D {
    private int x;

    public Point1D(int x) {
        this.x = x;
    }
}

class Point2D extends Point1D {
    private int y;

    public Point2D(int x, int y) {
        super(x);
        this.y = y;
    }
}

class Point3D extends Point2Dv2 {
    private int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
        this(-1, -1, -1); // call Point3D constructor with parameters
    }
}
