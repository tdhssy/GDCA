package com.example.gdca.view;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import com.example.gdca.R;
import com.example.gdca.controller.ChangeView;
import com.example.gdca.controller.eventHandler.DescriptionController;

public class Description extends View{
    private final View.OnClickListener eventHandler;
    private Button retour;
    public Description(ChangeView controller, Activity activity) {
        super(activity);
        eventHandler = new DescriptionController(controller, activity);

        activity.setContentView(R.layout.description);

        retour = (Button) activity.findViewById(R.id.b_retour);
        retour.setOnClickListener(eventHandler);
    }
}
