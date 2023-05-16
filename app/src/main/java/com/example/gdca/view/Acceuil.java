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
    private ImageButton aide;

    private Button pedalier;
    private Button suspension;
    private Button cadre;
    private Button frein;
    private Button roue;
    private Button guidon;
    private Button selle;

    public Acceuil(ChangeView controller, Activity activity) {
        super(activity);
        eventHandler = new AcceuilController(controller, activity);

        activity.setContentView(R.layout.accruil);

        menu = (ImageButton) activity.findViewById(R.id.b_menu);
        menu.setOnClickListener(eventHandler);

        aide = (ImageButton) activity.findViewById(R.id.b_aide);
        aide.setOnClickListener(eventHandler);

        pedalier = (Button) activity.findViewById(R.id.b_pedalier);
        pedalier.setOnClickListener(eventHandler);

        suspension = (Button) activity.findViewById(R.id.b_suspension);
        suspension.setOnClickListener(eventHandler);

        cadre = (Button) activity.findViewById(R.id.b_cadre);
        cadre.setOnClickListener(eventHandler);

        frein = (Button) activity.findViewById(R.id.b_frein);
        frein.setOnClickListener(eventHandler);

        roue = (Button) activity.findViewById(R.id.b_roue);
        roue.setOnClickListener(eventHandler);

        guidon = (Button) activity.findViewById(R.id.b_guidon);
        guidon.setOnClickListener(eventHandler);

        selle = (Button) activity.findViewById(R.id.b_selle);
        selle.setOnClickListener(eventHandler);
    }

}