package Chapter_3;

// # 6 # метод с параметром возвращаемым значением # MethodAction.java

public class MethodAction {
    public int numberParser(int number, int[] numbers) {
        String str = String.valueOf(number);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char code = str.charAt(i);
            int n = Character.digit(code, 10);
            numbers[i] = n;
        }
        return length;
    }
}
