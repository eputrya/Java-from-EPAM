package Chapter_3;

import Chapter_2.Course;

/* # 21 # параметризованные конструкторы и методы # SimpleAction.java */
public class SimpleAction {
    public <T extends Course> SimpleAction(T course) {
        // code
    }

    public <T> SimpleAction() {
        // code
    }

    public <T extends Course> float calculateMark(T course) {
        // code
        return 1.1f;
    }

    public <T> boolean printReport(T course) {
        // code
        return true;
    }

    public <T> void check() {
        // code
    }
}
