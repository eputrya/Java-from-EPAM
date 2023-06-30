package Chapter_3;

/* # 15 # логические блоки при объявлении класса # Department.java
# DemoLogicMain.java */

public class Department {
    {
        System.out.println("logic (1) id=" + this.id);
    }

    static {
        System.out.println("static logic");
    }

    private int id = 42;

    public Department(int id) {
        this.id = id;
        System.out.println("constructor id=" + id);
    }

    public int getId() {
        return id;
    }

    {
        /* not very good location of the logical block */
        System.out.println("logic (2) id=" + id);
    }
}

class DemoLogicMain {
    public static void main(String[] args) {
        new Department(71);
        new Department(17);
    }
}