package Chapter_3;

/* # 37 # исключительная ситуация при индексировании объекта-матрицы
# MatrixException.java */
public class MatrixException extends Exception {
    public MatrixException() {
    }

    public MatrixException(String message) {
        super(message);
    }

    public MatrixException(String message, Throwable cause) {
        super(message, cause);
    }

    public MatrixException(Throwable cause) {
        super(cause);
    }
}
