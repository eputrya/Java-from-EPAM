package Chapter_3;

/* # 30 # класс для создания неизменяемых объектов # ImmutableType.java */
public final class ImmutableType {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public ImmutableType(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // equals, hashCode, toString
}
