package Chapter_4;

/* # 18 # безопасная передача по ссылке # CloneMain.java */

class CloneMain {
    private static void preparation(Student student) {
        try {
            student = (Student) student.clone(); // cloning
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        student.setId(1000);
        System.out.printf("->id = " + student.getId());
    }

    public static void main(String[] args) {
        Student ob = new Student();
        ob.setId(71);
        System.out.printf("id = " + ob.getId());
        preparation(ob);
        System.out.printf("id = " + ob.getId());
    }
}
