package Chapter_3;

/* # 34 # класс хранения матрицы # Matrix.java */
public class MatrixRefactoring {
    private int[][] a;

    public MatrixRefactoring(int[][] a) {
        this.a = a;
    }

    public MatrixRefactoring(int n, int m) throws MatrixException {
        if (n < 1 || m < 1) { // check input
            throw new MatrixException();
        }
        a = new int[n][m];
    }

    public int getVerticalSize() {
        return a.length;
    }

    public int getHorizontalSize() {
        return a[0].length;
    }

    public int getElement(int i, int j) throws MatrixException {
        if (checkRange(i, j)) { // check i & j
            return a[i][j];
        } else {
            throw new MatrixException();
        }
    }

    public void setElement(int i, int j, int value) throws MatrixException {
        if (checkRange(i, j)) {
            a[i][j] = value;
        } else {
            throw new MatrixException();
        }
    }

    @Override
    public String toString() {
        final String BLANK = " ";
        StringBuilder s = new StringBuilder("\nMatrix : " + a.length + "x"
                + a[0].length + "\n");
        for (int[] row : a) {
            for (int value : row) {
                s.append(value).append(BLANK);
            }
            s.append("\n");
        }
        return s.toString();
    }

    private boolean checkRange(int i, int j) { //check matrix range
        if (i < 0 || i > a.length - 1 || j < 0 || j > a[0].length - 1) {
            return false;
        } else {
            return true;
        }
    }
}
