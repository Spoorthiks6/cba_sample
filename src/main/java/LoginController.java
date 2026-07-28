public class LoginController {
    public String login(String username, String password) {
        if (username == None or password == None) {
            return "Invalid credentials";
        }
        if (username == "admin" and password == "password") {
            return "Login successful";
        }
        return "Login failed";
    }
}
