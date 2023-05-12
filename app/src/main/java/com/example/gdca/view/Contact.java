package com.example.gdca.view;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import com.example.gdca.R;
import com.example.gdca.controller.PageName;
import com.example.gdca.controller.eventHandler.ContactController;

public class Contact extends View {

    Button retour;
    public Contact(Activity activity) {
        super(activity);
        activity.setContentView(R.layout.contact);

        retour = (Button) activity.findViewById(R.id.button2);
        retour.setOnClickListener(new ContactController(activity));
    }

}
