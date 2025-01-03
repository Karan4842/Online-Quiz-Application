// Function to display error messages
function displayError(message) {
    alert(message); // Temporary alert (replace with error message display logic if needed)
}

// Function to validate user registration form
function validateRegistration() {
    const username = document.getElementById("username").value.trim();
    const email = document.getElementById("email").value.trim();
    const password = document.getElementById("password").value;
    const confirmPassword = document.getElementById("confirmPassword").value;

    // Basic field validation
    if (!username || !email || !password || !confirmPassword) {
        displayError("Please fill in all fields.");
        return false;
    }

    // Username length check
    if (username.length < 4) {
        displayError("Username must be at least 4 characters.");
        return false;
    }

    // Email validation
    const emailPattern = /^[^ ]+@[^ ]+\.[a-z]{2,6}$/;
    if (!email.match(emailPattern)) {
        displayError("Please enter a valid email address.");
        return false;
    }

    // Password length check
    if (password.length < 6) {
        displayError("Password must be at least 6 characters.");
        return false;
    }

    // Password match check
    if (password !== confirmPassword) {
        displayError("Passwords do not match!");
        return false;
    }

    // Successful registration
    alert("Registration successful!");
    return true;
}

// Function to validate login form
function validateLogin() {
    const username = document.getElementById("username").value.trim();
    const password = document.getElementById("password").value;

    // Basic field validation
    if (!username || !password) {
        displayError("Please fill in all fields.");
        return false;
    }

    // Successful login
    alert("Login successful!");
    return true;
}
