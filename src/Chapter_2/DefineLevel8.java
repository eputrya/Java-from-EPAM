package Chapter_2;

/* # 8 # оператор switch как метод */

public class DefineLevel8 {
    public static void main(String[] args) {
        int value = 1;
        System.out.println(
                switch (value) {
                    case 2, 3, 4 -> "2,3 or 4";
                    case 777 -> "Range: " + value;
                    case 0 -> "0";
                    default -> "Default";
                }
        );
    }
}
