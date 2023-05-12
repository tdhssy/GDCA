package com.example.gdca.view;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import com.example.gdca.R;
import com.example.gdca.controller.eventHandler.AcceuilController;

public class Acceuil extends View{

    private Button b1;
    private Button b2;


    public Acceuil(Activity activity) {
        super(activity);

        activity.setContentView(R.layout.accruil);

        b1 = (Button) activity.findViewById(R.id.b1);
        b1.setOnClickListener(new AcceuilController(activity));

        b2 = (Button) activity.findViewById(R.id.b2);
        b2.setOnClickListener(new AcceuilController(activity));
    }
}