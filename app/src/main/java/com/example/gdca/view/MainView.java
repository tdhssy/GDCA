package com.example.gdca.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.gdca.R;
import com.example.gdca.controller.MainController;

public class MainView extends View{

    private Button b1;
    private Button b2;


    public MainView(Activity activity) {
        super(activity);

        activity.setContentView(R.layout.activity_main);

        b1 = (Button) activity.findViewById(R.id.b1);
        //b1.setOnClickListener(null);

        b2 = (Button) activity.findViewById(R.id.b2);
        //b2.setOnClickListener(null);
    }
}