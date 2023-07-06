package Chapter_3;

/* # 32 # методы класса-record # RecordMain.java */
public class RecordMain {
    public static void main(String[] args) {
        ImmutableRec object = new ImmutableRec("Jan", 777);
        System.out.println(object.id());
        System.out.println(object.name());
        System.out.println(object.toString());
        ImmutableRec object2 = new ImmutableRec("Jan", 777);
        System.out.println(object.equals(object2));
    }
}
