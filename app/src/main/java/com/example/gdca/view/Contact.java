package com.example.gdca.view;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import com.example.gdca.R;
import com.example.gdca.controller.PageName;
import com.example.gdca.controller.eventHandler.ContactController;

public class Contact extends View {
    private final PageName self = PageName.CONTACT;
    private final PageName parent;
    private Button retour;
    private Button go_param;
    public Contact(Activity activity, PageName parent) {
        super(activity);
        this.parent = parent;

        activity.setContentView(R.layout.contact);

        retour = (Button) activity.findViewById(R.id.b_retour);
        retour.setOnClickListener(new ContactController(activity, parent, self));

        go_param = (Button) activity.findViewById(R.id.go_param);
        go_param.setOnClickListener(new ContactController(activity, PageName.PARAMETRE, self));
    }

}
