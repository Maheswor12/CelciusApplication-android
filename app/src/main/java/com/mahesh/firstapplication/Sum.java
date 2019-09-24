package com.mahesh.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Sum extends AppCompatActivity {
private EditText firstnumber,secondnumber;
private Button btnaddition;
//private TextView ans_data;
int first, second, result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum);

        firstnumber=findViewById(R.id.firstnumber);
        secondnumber=findViewById(R.id.secondnumber);
        btnaddition=findViewById(R.id.btnaddition);
//        ans_data=findViewById(R.id.ans_data);

        btnaddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               first = Integer.parseInt(firstnumber.getText().toString());
               second = Integer.parseInt(secondnumber.getText().toString());
               result = first+second;
                Toast.makeText(Sum.this, "Sum of two number is: "+result, Toast.LENGTH_LONG).show();
//               ans_data.setText(result);
            }
        });


    }
}
