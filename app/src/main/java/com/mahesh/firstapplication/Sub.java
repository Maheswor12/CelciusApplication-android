package com.mahesh.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Sub extends AppCompatActivity {
    private EditText firstnumber,secondnumber;
    private Button btnsubtraction;
    int first, second, result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        firstnumber=findViewById(R.id.firstnumber);
        secondnumber=findViewById(R.id.secondnumber);
        btnsubtraction=findViewById(R.id.btnsubtraction);

        btnsubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               first =  Integer.parseInt(firstnumber.getText().toString());
               second =  Integer.parseInt(secondnumber.getText().toString());
               result = first-second;
                Toast.makeText(Sub.this, "Subtraction  is: "+result, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
