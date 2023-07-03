package Chapter_3;

/* # 19 # использование метасимвола в параметризованном классе # Task.java
# TaskMain.java */

public class Task<T extends Number> {
    private String name;
    private T mark;

    public Task(T mark, String name) {
        this.name = name;
        this.mark = mark;
    }

    public T getMark() {
        return mark;
    }

    public boolean equalsToMark(Task<T> task) {
        return roundMark() == task.roundMark();
    }

    private int roundMark() {
        return Math.round(mark.floatValue());
    }
}

class TaskMain {
    public static void main(String[] args) {
        Task<Double> task1 = new Task<Double>(71.41D, "JSE"); // 71.5
        Task<Double> task2 = new Task<Double>(71.45D, "JEE"); // 71.5
        System.out.println(task1.equalsToMark(task2));
        Task<Integer> task = new Task<Integer>(71, "Scala");
        // task1.equalsToMark(task); // compile error: incompatible types
    }
}
