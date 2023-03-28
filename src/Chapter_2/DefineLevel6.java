package Chapter_2;

/* # 6 # прямое присваивание оператора switch */

public class DefineLevel6 {

    public int defineLevel(String role) {
        var result = switch (role) {
            case "guest" -> 0;
            case "client" -> 1;
            case "moderator" -> 2;
            case "admin" -> 3;
            default -> {
                System.out.println("non-authentic role = " + role);
                yield -1;
            }
        };
        return result;
    }
}
