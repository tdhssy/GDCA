package com.example.gdca.view;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import com.example.gdca.R;
import com.example.gdca.controller.ChangeView;
import com.example.gdca.controller.eventHandler.ParametreController;

public class Parametre extends View {
    private final View.OnClickListener eventHandler;
    private Button retour;
    public Parametre(ChangeView controller, Activity activity) {
        super(activity);
        eventHandler = new ParametreController(controller, activity);

        activity.setContentView(R.layout.parametre);

        retour = (Button) activity.findViewById(R.id.b_retour);
        retour.setOnClickListener(eventHandler);
    }
}
