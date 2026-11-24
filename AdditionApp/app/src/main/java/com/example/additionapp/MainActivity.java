package com.example.additionapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    Button btnAdd;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        btnAdd = findViewById(R.id.btnAdd);
        txtResult = findViewById(R.id.txtResult);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String a = num1.getText().toString();
                String b = num2.getText().toString();

                if (a.isEmpty() || b.isEmpty()) {
                    txtResult.setText("Enter both numbers");
                    return;
                }

                double n1 = Double.parseDouble(a);
                double n2 = Double.parseDouble(b);

                double sum = n1 + n2;

                txtResult.setText("Result: " + sum);
            }
        });
    }
}
