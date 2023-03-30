package Chapter_2;

/* # 7 # список значений в операторе switch */

public class DefineLevel7 {
    public static void main(String[] args) {
        int value = 1;
        switch (value) {
            case 1, 2, 3, 4 -> System.out.println("1, 2, 3 or 4");
            case 777 -> System.out.println("Range: " + value);
            case 0 -> System.out.println("0");
            default -> System.out.println("Default");
        }
    }
}
