package Chapter_1;

import java.io.IOException;

// # 13 # чтение символа из потока System.in # ReadCharMain.java 24

public class ReadCharMain {
    public static void main(String[] args) {
        int x;
        try {
            x = System.in.read();
            char c = (char) x;
            System.out.println("Character Code: " + c + " = " + x);
        } catch (IOException e) {
            System.err.println("i\\o error " + e);
        }
    }
}
