package com.example.gdca.view;

import android.app.Activity;
import android.media.Image;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import com.example.gdca.R;
import com.example.gdca.controller.ChangeView;
import com.example.gdca.controller.eventHandler.AideController;

public class Aide extends View {
    private final OnClickListener eventHandler;
    private ImageButton retourImage;
    private ImageButton parametre;
    private Button retour;
    public Aide(ChangeView controller, Activity activity) {
        super(activity);
        eventHandler = new AideController(controller, activity);

        activity.setContentView(R.layout.aide);

        retourImage = (ImageButton) activity.findViewById(R.id.RetourButton);
        retourImage.setOnClickListener(eventHandler);

        parametre = (ImageButton) activity.findViewById(R.id.menuBar);
        parametre.setOnClickListener(eventHandler);

        retour = (Button) activity.findViewById(R.id.b_retour);
        retour.setOnClickListener(eventHandler);
    }


}
