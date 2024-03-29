package Chapter_4;

import java.util.ArrayList;

/* # 19 # глубокое клонирование # Abiturient.java */
public class Abiturient implements Cloneable {
    private int id = 7;
    private ArrayList<Byte> list = new ArrayList<>();

    public ArrayList<Byte> getList() {
        return list;
    }

    public void setList(ArrayList<Byte> list) {
        this.list = list;
    }

    @Override
    public Abiturient clone() {
        Abiturient copy = null;
        try {
            copy = (Abiturient) super.clone();
            copy.list = (ArrayList<Byte>) list.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return copy;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Abiturient{");
        sb.append("id=").append(id);
        sb.append(", list=").append(list);
        sb.append("}");
        return sb.toString();
    }
}
