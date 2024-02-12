package com.example.lab5;// app/src/main/java/com.example.yourprojectname/MainActivity.java

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.lab5.PasswordValidator;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextPassword;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextPassword = findViewById(R.id.editTextPassword);
        textViewResult = findViewById(R.id.textViewResult);

        Button buttonRunTests = findViewById(R.id.buttonRunTests);
        buttonRunTests.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runTests();
            }
        });
    }

    // Rest of the code remains the same

    // Method to run tests and display results
    public void runTests() {
        PasswordValidator validator = new PasswordValidator();
        String userEnteredPassword = editTextPassword.getText().toString();

        // Test cases
        String result = "Test Case 1: Missing 1 upper case - " + (validator.isMissingUpperCase(userEnteredPassword) ? "Fail" : "Pass") + "\n"
                + "Test Case 2: Missing 1 lower case - " + (validator.isMissingLowerCase(userEnteredPassword) ? "Fail" : "Pass") + "\n"
                + "Test Case 3: Missing 1 numeric - " + (validator.isMissingNumeric(userEnteredPassword) ? "Fail" : "Pass") + "\n"
                + "Test Case 4: Missing 1 special character - " + (validator.isMissingSpecialCharacter(userEnteredPassword) ? "Fail" : "Pass") + "\n"
                + "Test Case 5: Has all requirements - " + (validator.hasAllRequirements(userEnteredPassword) ? "Pass" : "Fail");

        textViewResult.setText(result);
    }
}
