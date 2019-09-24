package com.mahesh.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class plaidrome_string extends AppCompatActivity {
    private EditText firstnumber;
    private Button btnplaindrome;
    String first, result;
    String reverse="";
    String original_word;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plaidrome_string);

        firstnumber=findViewById(R.id.firstnumber);
        btnplaindrome=findViewById(R.id.btnplaindrome);
        Toast.makeText(plaidrome_string.this, firstnumber+" is  plaindrome number", Toast.LENGTH_SHORT).show();




        btnplaindrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                first = firstnumber.getText().toString();
                original_word  = first;
                int count_word = first.length();
                for(int i = count_word - 1; i>=0; i--){
                    reverse = reverse + first .charAt(i);
                }
                if(original_word!=reverse){
                    Toast.makeText(plaidrome_string.this, reverse+" is  plaindrome number", Toast.LENGTH_SHORT).show();

                    System.out.println( reverse+ "  is not plaindrome");
                }else{
                    Toast.makeText(plaidrome_string.this, reverse+" is  plaindrome number", Toast.LENGTH_SHORT).show();

                    System.out.println(  reverse+"  is  plaindrome");
                }



            }
        });
    }
}
