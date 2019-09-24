package com.mahesh.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Farenheit extends AppCompatActivity {
    private EditText firstnumber;
    private Button btnfarenheit;
    int first, result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farenheit);
        firstnumber=findViewById(R.id.firstnumber);
        btnfarenheit=findViewById(R.id.btnfarenheit);

        btnfarenheit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first =  Integer.parseInt(firstnumber.getText().toString());
                result = ((first - 32)*5)/9;
                Toast.makeText(Farenheit.this, "Subtraction  is: "+result+" C", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
