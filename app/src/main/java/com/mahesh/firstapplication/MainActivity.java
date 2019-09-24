package com.mahesh.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button btnsum,btnsub, btncelcius, farenheit, plaindrome, plaidrome_string, btnreverse, btneven;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Binding
        btnsum = findViewById(R.id.btnsum);
        btnsub = findViewById(R.id.btnsub);
        btncelcius = findViewById(R.id.btncelcius);
        farenheit = findViewById(R.id.farenheit);
        plaindrome = findViewById(R.id.plaindrome);
        plaidrome_string = findViewById(R.id.plaidrome_string);





//        button outpyt
        btnsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Sum.class);
                startActivity(intent);
            }
        });
//        for sub
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Sub.class);
                startActivity(intent);
            }
        });

//        for celcius
        btncelcius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Celcius.class);
                startActivity(intent);
            }
        });
//        farenheit
        farenheit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Farenheit.class);
                startActivity(intent);
            }
        });
        plaindrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Plaindrome.class);
                startActivity(intent);
            }
        });

//        for plaindrome string
        plaidrome_string.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, plaidrome_string.class);
                startActivity(intent);
            }
        });

    }
}
