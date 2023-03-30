package Chapter_2;

/* # 3 # преобразование строки в целое число # */

public class ConvertString {
    public static void main(String[] args) {
        String arg = "42";
        try {
            int value1 = Integer.parseInt(arg);
            Integer value2 = Integer.valueOf(arg);
            Integer value3 = Integer.decode(arg);
        } catch (NumberFormatException e) {
            System.err.println("invalid number format: " + arg + " : " + e);
        }
    }
}
