package Chapter_4;

/* # 6 # вызов нестатического final-метода из конструктора # AuthenticationService.java */
public class AuthenticationService {
    public AuthenticationService() {
        authenticate();
    }

    public final void authenticate() {
        // appeal to the database
    }
}
