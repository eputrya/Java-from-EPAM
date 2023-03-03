package Chapter_1;

//  # 6 # вывод аргументов командной строки в консоль # PrintArgumentMain.java

public class PrintArgumentMain {
    public static void main(String[] args) {
        for (String str : args) {
            System.out.printf("Argument-->%s%n", str);
        }
    }
}
