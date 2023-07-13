package Chapter_4;

/* # 7 # переопределение не final-метода # NewAuthenticationService.java */
public class NewAuthenticationService extends AuthenticationService {
    // @Override
    public void authentication() {
        //empty method
    }
}

// сли убрать final в объявлении метода суперкласса,
// то становится возможным переопределить метод в подклассе