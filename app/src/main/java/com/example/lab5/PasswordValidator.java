package com.example.lab5;

// app/src/main/java/com.example.yourprojectname/PasswordValidator.java

public class PasswordValidator {

    // Regular expression for password validation
    private static final String PASSWORD_PATTERN =
            "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";

    // Test case: Missing 1 upper case character
    public boolean isMissingUpperCase(String password) {
        return !password.matches(".*[A-Z].*");
    }

    // Test case: Missing 1 lower case character
    public boolean isMissingLowerCase(String password) {
        return !password.matches(".*[a-z].*");
    }

    // Test case: Missing 1 numeric character
    public boolean isMissingNumeric(String password) {
        return !password.matches(".*\\d.*");
    }

    // Test case: Missing 1 special character
    public boolean isMissingSpecialCharacter(String password) {
        return !password.matches(".*[@$!%*?&].*");
    }

    // Test case: Has all requirements
    public boolean hasAllRequirements(String password) {
        return password.matches(PASSWORD_PATTERN);
    }
}

