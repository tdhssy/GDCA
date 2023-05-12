package com.example.gdca.view;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import com.example.gdca.R;
import com.example.gdca.controller.PageName;
import com.example.gdca.controller.eventHandler.AcceuilController;

public class Acceuil extends View{
    private final PageName self = PageName.ACCEUIL;
    private Button b1;
    private Button b2;

    public Acceuil(Activity activity) {
        super(activity);

        activity.setContentView(R.layout.accruil);

        b1 = (Button) activity.findViewById(R.id.go_contact);
        b1.setOnClickListener(new AcceuilController(activity, PageName.CONTACT, self));

        b2 = (Button) activity.findViewById(R.id.go_param);
        b2.setOnClickListener(new AcceuilController(activity, PageName.PARAMETRE, self));
    }
}