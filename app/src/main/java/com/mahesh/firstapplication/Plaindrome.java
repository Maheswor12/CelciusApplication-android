package com.mahesh.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Plaindrome extends AppCompatActivity {
    private EditText firstnumber;
    private Button btnplaindrome;
    int first, result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plaindrome);
        firstnumber=findViewById(R.id.firstnumber);
        btnplaindrome=findViewById(R.id.btnplaindrome);

        btnplaindrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first =  Integer.parseInt(firstnumber.getText().toString());
                int original_number = first;
                int rev=0, remainder;
                while(first!=0) {
                    remainder = first % 10;
                    rev = rev * 10 + remainder;
                    first = first / 10;
                }
                if(rev!=original_number){
                    Toast.makeText(Plaindrome.this, rev+" is not plaindrome number", Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(Plaindrome.this, rev+" is  plaindrome number", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}
