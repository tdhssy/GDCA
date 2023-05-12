package com.example.gdca.view;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import com.example.gdca.R;
import com.example.gdca.controller.ChangeView;
import com.example.gdca.controller.eventHandler.AcceuilController;

public class Acceuil extends View{
    private final OnClickListener eventHandler;
    private ImageButton menu;
    private Button b1;

    public Acceuil(ChangeView controller, Activity activity) {
        super(activity);
        eventHandler = new AcceuilController(controller, activity);

        activity.setContentView(R.layout.accruil);

        b1 = (Button) activity.findViewById(R.id.go_contact);
        b1.setOnClickListener(eventHandler);

        menu = (ImageButton) activity.findViewById(R.id.b_menu);
        menu.setOnClickListener(eventHandler);
    }

}