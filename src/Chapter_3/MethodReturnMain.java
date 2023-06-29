package Chapter_3;

// # 7 # вызов метода и извлечение результатов из параметра MethodReturnMain.java

public class MethodReturnMain {
    public static void main(String[] args) {
        MethodAction method = new MethodAction();
        int num = 739_015_428;
        int[] result = new int[10];
        int length = method.numberParser(num, result);
        System.out.println(length);
        for (int j = 0; j < length; j++)
            System.out.printf("%d, ", result[j]);
    }
}
