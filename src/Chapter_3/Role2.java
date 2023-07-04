package Chapter_3;

/* # 27 # перечисление с полями и методами # Role.java */
public enum Role2 {
    GUEST("guest"), CLIENT("client"), MODERATOR("moderator"), ADMIN("administrator");
    private String typeName;

    Role2(String typeName) {
        this.typeName = typeName;
    }
}
