package com.mahesh.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Celcius extends AppCompatActivity {
    private EditText firstnumber;
    private Button btncelcius;
    int first, result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celcius);
        firstnumber=findViewById(R.id.firstnumber);
        btncelcius=findViewById(R.id.btncelcius);

        btncelcius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first =  Integer.parseInt(firstnumber.getText().toString());
                result = ((first*9)/5)/32;
                Toast.makeText(Celcius.this, "Subtraction  is: "+result+" F", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
