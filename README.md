## WORKSHOP to ADD TWO NUMBERS
# Addnumbers
## Aim:
To create and design an android application to add two numbers using android studio.

## EQUIPMENTS REQUIRED:
Android Studio(Latest Version)

## ALGORITHM:
Step 1: Open Android Stdio and then click on File -> New -> New project.

Step 2: Then type the Application name as smsintent and click Next.

Step 3: Then select the Minimum SDK as shown below and click Next.

Step 4: Then select the Empty Activity and click Next. Finally click Finish.

Step 5: Design layout in activity_main.xml.

Step 6:Display details give in MainActivity file.

Step 7: Save and run the application.

## PROGRAM:
Program to create and design an android application to add two numbers using Intent.
```
Program Developed by :Ragul D
Register Number:212225230221

```

**activity_main.xml**
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="25dp"
    android:gravity="center">


    <TextView
        android:id="@+id/title"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Addition of Two Numbers"
        android:textSize="26sp"
        android:textStyle="bold"
        android:textColor="#000000"
        android:gravity="center"
        android:layout_marginBottom="30dp"/>

    <EditText
        android:id="@+id/num1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="30dp"
        android:layout_marginBottom="15dp"
        android:hint="Enter first number"
        android:inputType="numberDecimal|numberSigned"
        android:minHeight="48dp" />

    <EditText
        android:id="@+id/num2"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginBottom="20dp"
        android:hint="Enter second number"
        android:inputType="numberDecimal|numberSigned"
        android:minHeight="48dp" />
    <Button
        android:id="@+id/btnAdd"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="ADD" />

    <TextView
        android:id="@+id/txtResult"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="20dp"
        android:gravity="center"
        android:text="Result:"
        android:textSize="24sp" />

</LinearLayout>

```

**MainActivity.java**
```
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

```
## OUTPUT:
![alt text](<Screenshot 2026-11-24 084610.png>)

![alt text](<Screenshot 2026-11-24 084459.png>)

![alt text](<Screenshot 2026-11-24 084547.png>)

![alt text](<Screenshot 2026-11-24 084558.png>)
## RESULT:
Thus a Simple Android Application create a addition for two numbers using Android Studio is developed and executed successfully.
