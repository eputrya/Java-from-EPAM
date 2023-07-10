package Chapter_3;

/* # 35 # класс-создатель матрицы # MatrixCreator.java */
public class MatrixCreator {
    public void fillRandomized(MatrixRefactoring matrix, int minValue, int maxValue) {
        int v = matrix.getVerticalSize();
        int h = matrix.getHorizontalSize();
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < h; j++) {
                try {
                    int value = (int) ((Math.random() * (maxValue - minValue)) + minValue);
                    matrix.setElement(i, j, value);
                } catch (Exception e) {
                    // Log: exception impossible
                }
            }
        }
    }
    // public int[][] createArray(int n, int m, int minValue, int maxValue){/*code/
    // public void createFromFile(Matrix matrix, File f){ /* code */}
    // public [][] createFromStream(Matrix matrix, Stream stream){/* code */}
}
