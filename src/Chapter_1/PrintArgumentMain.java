package Chapter_1;

public class PrintArgumentMain {
    public static void main(String[] args) {
        for (String str : args) {
            System.out.printf("Argument-->%s%n", str);
        }
    }
}
