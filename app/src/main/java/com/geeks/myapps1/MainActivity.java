package com.geeks.myapps1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button myButton;
        myButton = findViewById(R.id.myButton);
        myButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "PLAY NOW", Toast.LENGTH_SHORT).show();
            }
        });

    }
}