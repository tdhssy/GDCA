package com.example.gdca.view;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import com.example.gdca.R;
import com.example.gdca.controller.ParametreController;

public class Parametre extends View {

    Button retour;
    public Parametre(Activity activity) {
        super(activity);
        activity.setContentView(R.layout.parametre);

        retour = (Button) activity.findViewById(R.id.button);
        retour.setOnClickListener(new ParametreController());
    }
}
