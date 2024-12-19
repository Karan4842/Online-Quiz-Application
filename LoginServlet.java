@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    
    private UserManager userManager;  // Use the UserManager class to check credentials

    @Override
    public void init() throws ServletException {
        super.init();
        // Initialize the userManager here, typically it could be a singleton or could be fetched from a database.
        userManager = new UserManager();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get username and password from request
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Use UserManager to verify login credentials
        boolean success = userManager.loginUser(username, password);

        // Redirect to appropriate page based on login success or failure
        if (success) {
            // If login is successful, redirect to the home page or dashboard
            response.sendRedirect("dashboard.html");  // or any page you want to redirect to after login
        } else {
            // If login fails, redirect back to login page with an error message
            response.sendRedirect("login.html?error=true");
        }
    }
}
