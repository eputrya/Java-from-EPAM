package Chapter_2;

/* # 4 # тип String в операторе switch */

public class DefineLevel {

    public int defineLevel(String role) {
        int level;
        switch (role) { // or role.LowerCase()
            case "guest":
                level = 0;
                break;
            case "client":
                level = 1;
                break;
            case "moderator":
                level = 2;
                break;
            case "admin":
                level = 3;
                break;
            default:
                throw new IllegalArgumentException("non-authentic role = " + role);
        }
        return level;
    }
}
