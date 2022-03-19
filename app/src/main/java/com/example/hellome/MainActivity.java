package com.example.hellome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etFirstname;
    private EditText etName;
    private TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialisations();
    }
    private void initialisations() {

        Button btSend;

        // Make GUI link
        etFirstname = findViewById(R.id.etFirstname);
        etName = findViewById(R.id.etName);
        btSend = findViewById(R.id.btSend);
        tvMessage = findViewById(R.id.tvMessage);
        // Listen event onclick on send button
        btSend.setOnClickListener(v -> {
            String msg = " ";
            String headMsg;
            // Create end of message string by catching values
            msg += etFirstname.getText().toString() + " ";
            msg += etName.getText().toString() + " !";
            // Set message in textview
            headMsg = tvMessage.getText() + msg;
            tvMessage.setText(headMsg);
            // Set short time popup
            Toast.makeText(getApplicationContext(), getString(R.string.labelHi) + msg,
                    Toast.LENGTH_LONG).show();
        });
    }
}