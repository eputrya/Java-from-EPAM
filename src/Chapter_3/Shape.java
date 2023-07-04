package Chapter_3;

/* # 28 # объявление перечисления с методом # Shape.java */
public enum Shape {
    RECTANGLE, TRIANGLE, CIRCLE;

    public double defineSquare(double... x) {
        // here may be checking the parameters for correctness
        double area = 0;
        switch (this) {
            case RECTANGLE -> area = x[0] * x[1];
            case TRIANGLE -> area = x[0] * x[1] / 2;
            case CIRCLE -> area = Math.pow(x[0], 2) * Math.PI;
            default -> new EnumConstantNotPresentException(getDeclaringClass(), name());
        }
        return area;
    }
}
