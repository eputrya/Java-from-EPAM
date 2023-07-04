package Chapter_3;

public enum Role {
    GUEST, CLIENT, MODERATOR, ADMIN
}

class RoleMain {
    public static void main(String[] args) {
        Role role = Role.valueOf("Admin".toUpperCase());
        switch (role) {
            case GUEST -> System.out.println(role + " can only watch");
            case CLIENT -> System.out.println(role + " can place orders");
            case MODERATOR -> System.out.println(role + " can manage his section");
            case ADMIN -> System.out.println(role + " controls everything");
        }
    }
}
