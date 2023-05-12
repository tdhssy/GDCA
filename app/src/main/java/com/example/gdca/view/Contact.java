package com.example.gdca.view;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import com.example.gdca.R;
import com.example.gdca.controller.ChangeView;
import com.example.gdca.model.PageName;
import com.example.gdca.controller.eventHandler.ContactController;

public class Contact extends View {
    private final OnClickListener eventHandler;
    private Button retour;
    private Button go_param;
    public Contact(ChangeView controller, Activity activity) {
        super(activity);
        eventHandler = new ContactController(controller, activity);

        activity.setContentView(R.layout.contact);

        retour = (Button) activity.findViewById(R.id.b_retour);
        retour.setOnClickListener(eventHandler);

        go_param = (Button) activity.findViewById(R.id.go_param);
        go_param.setOnClickListener(eventHandler);
    }
}
