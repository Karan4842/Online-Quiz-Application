import java.util.HashMap;
import java.util.Map;

public class UserManager {

    // In-memory user store (for demonstration)
    private Map<String, User> users = new HashMap<>();

    // Method to register a new user
    public boolean registerUser(String username, String email, String password) {
        if (users.containsKey(username)) {
            System.out.println("User already exists!");
            return false; // User already exists
        }
        if (username.isEmpty() || email.isEmpty() || password.isEmpty()) {
            System.out.println("All fields are required!");
            return false;
        }
        users.put(username, new User(username, email, password));
        System.out.println("User registered successfully!");
        return true;
    }

    // Method to login a user
    public boolean loginUser(String username, String password) {
        User user = users.get(username);

        if (user != null && user.getPassword().equals(password)) {
            System.out.println("Login successful!");
            return true;
        }
        System.out.println("Invalid username or password!");
        return false;
    }

    // Inner class to represent a User
    static class User {
        private String username;
        private String email;
        private String password;

        public User(String username, String email, String password) {
            this.username = username;
            this.email = email;
            this.password = password;
        }

        public String getPassword() {
            return password;
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        // Example usage
        userManager.registerUser("john_doe", "john@example.com", "password123");
        userManager.loginUser("john_doe", "password123");

        // Additional test cases
        userManager.registerUser("jane_doe", "jane@example.com", "");
        userManager.loginUser("john_doe", "wrongpassword");
    }
}
