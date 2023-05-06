package com.example.gdca.view;

import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.gdca.R;

import com.example.gdca.controller.PageAccueilController;

public class MainActivity extends AppCompatActivity {

    private Button b1;
    private Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //test Antoine 2
        // test Kian
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(new PageAccueilController());

        b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(new PageAccueilController());
    }
}