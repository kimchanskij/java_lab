package lab4;

public class User {
    private String login;
    private String password;

    public User(String log, String pass) {
        login = log;
        password = pass;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
