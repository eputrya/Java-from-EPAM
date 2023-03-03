package Chapter_1;

// # 2 # простое объектно-ориентированное приложение # FirstProgram.java

public class FirstProgram {
    public static void main(String[] args) {
        // declaring and creating an object
        TutorialAction action = new TutorialAction();
        // calling a method that outputs a string
        action.printMessage("tutorial-> https://docs.oracle.com/javase/tutorial/");
    }
}