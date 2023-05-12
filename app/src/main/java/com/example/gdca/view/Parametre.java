package com.example.gdca.view;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import com.example.gdca.R;
import com.example.gdca.controller.PageName;
import com.example.gdca.controller.eventHandler.ParametreController;

public class Parametre extends View {
    private final PageName self = PageName.PARAMETRE;
    private final PageName parent;
    private Button retour;
    public Parametre(Activity activity, PageName parent) {
        super(activity);
        this.parent = parent;

        activity.setContentView(R.layout.parametre);

        retour = (Button) activity.findViewById(R.id.b_retour);
        retour.setOnClickListener(new ParametreController(activity, parent, self));
    }
}
