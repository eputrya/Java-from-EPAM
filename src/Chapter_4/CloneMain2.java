package Chapter_4;

import java.util.ArrayList;

/* # 20 # демонстрация глубокого клонирования # CloneMain.java */
public class CloneMain2 {
    public static void main(String[] args) {
        Abiturient abiturient = new Abiturient();
        ArrayList<Byte> list = new ArrayList<>();
        list.add((byte) 1);
        list.add((byte) 2);
        abiturient.setList(list);
        Abiturient abiturient1 = abiturient.clone();
        list = abiturient1.getList();
        list.remove(0);
        list.add((byte) 9);
        System.out.println(abiturient);
        System.out.println(abiturient1);

    }
}
