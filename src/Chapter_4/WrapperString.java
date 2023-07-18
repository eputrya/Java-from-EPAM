package Chapter_4;

// # 8 # класс-оболочка для класса String # WrapperString.java
public class WrapperString {
    private String str;

    public WrapperString() {
        str = new String();
    }

    public WrapperString(String str) {
        this.str = str;
    }

    public int length() { // delegate method
        return str.length();
    }

    public boolean isEmpty() { // delegate method
        return str.isEmpty();
    }

    public int indexOf(int arg) { // delegate method
        int value = 0; // new realization
        return value;
    }
    // other
}
