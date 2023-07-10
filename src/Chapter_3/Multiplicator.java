package Chapter_3;

/* # 36 # класс действия над матрицей # Multiplicator.java */
public class Multiplicator {
    public MatrixRefactoring multiply(MatrixRefactoring p, MatrixRefactoring q) throws MatrixException {
        int v = p.getVerticalSize();
        int h = q.getHorizontalSize();
        int controlSize = p.getHorizontalSize();
        if (controlSize != q.getVerticalSize()) {
            throw new MatrixException("incompatible matrices");
        }
        MatrixRefactoring result = new MatrixRefactoring(v, h);
        try {
            for (int i = 0; i < v; i++) {
                for (int j = 0; j < h; j++) {
                    int value = 0;
                    for (int k = 0; k < controlSize; k++) {
                        value += p.getElement(i, k) * q.getElement(k, j);
                    }
                    result.setElement(i, j, value);
                }
            }
        } catch (Exception e) {
            // log: exception impossible
        }
        return result;
    }
}
