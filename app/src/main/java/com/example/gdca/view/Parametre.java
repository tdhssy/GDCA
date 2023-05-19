package com.example.gdca.view;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import com.example.gdca.R;
import com.example.gdca.controller.ChangeView;
import com.example.gdca.controller.eventHandler.ParametreController;

public class Parametre extends View {
    private final View.OnClickListener eventHandler;
    private ImageButton retour;
    private ImageButton acceuil;
    private Button preference;
    private Button aPropos;
    private Button quitter;
    public Parametre(ChangeView controller, Activity activity) {
        super(activity);
        eventHandler = new ParametreController(controller, activity);

        activity.setContentView(R.layout.parametre);

        retour = (ImageButton) activity.findViewById(R.id.b_retour);
        retour.setOnClickListener(eventHandler);

        acceuil = (ImageButton) activity.findViewById(R.id.b_acceuil);
        acceuil.setOnClickListener(eventHandler);

        preference = (Button) activity.findViewById(R.id.b_preference);
        preference.setOnClickListener(eventHandler);

        aPropos = (Button) activity.findViewById(R.id.b_a_propos);
        aPropos.setOnClickListener(eventHandler);

        quitter = (Button) activity.findViewById(R.id.b_quitter);
        quitter.setOnClickListener(eventHandler);
    }
}
