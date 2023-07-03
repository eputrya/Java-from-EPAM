package Chapter_3;

/* # 22 # определение количества параметров метода # DemoVarargMain.java */
public class DemoVarargMain {
    public static int defineArgCount(Integer... args) {
        if (args.length != 0) {
            for (int element : args) {
                System.out.printf("arg:%d ", element);
            }
        } else {
            System.out.print("No arg ");
        }
        return args.length;
    }

    public static void main(String... args) {
        System.out.println("N=" + defineArgCount(7, 42, 555));
        Integer[] arr = {1, 2, 3, 4, 5, 42, 7};
        System.out.println("N=" + defineArgCount(arr));
        System.out.println(defineArgCount());
        // defineArgCount(arr, arr); // compile error
        // defineArgCount(71, arr); // compile error
    }
}
