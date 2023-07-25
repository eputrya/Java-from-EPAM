package Chapter_4;

/* # 13 # поведение статического метода при «переопределении» # StaticMain.java */
public class StaticDumb {
    public static void go() {
        System.out.println("go() from StaticDumb");
    }
}

class StaticDumber extends StaticDumb {
    // @Override - compile error
    public static void go() { // similar to dynamic polymorphism
        System.out.println("go() from StaticDumber");
    }
}

class StaticMain {
    public static void main(String[] args) {
        StaticDumb dumb = new StaticDumber();
        dumb.go(); // warning: static member accessed via instance reference
        StaticDumber dumber = null;
        dumber.go(); // will not NullPointerException
    }
}