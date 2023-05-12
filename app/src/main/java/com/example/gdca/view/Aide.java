package com.example.gdca.view;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import com.example.gdca.R;
import com.example.gdca.controller.PageName;
import com.example.gdca.controller.eventHandler.AideController;

public class Aide extends View {
    private final PageName self = PageName.AIDE;
    private final PageName parent;
    private Button retour;
    public Aide(Activity activity, PageName parent) {
        super(activity);
        this.parent = parent;

        activity.setContentView(R.layout.aide);

        retour = (Button) activity.findViewById(R.id.b_retour);
        retour.setOnClickListener(new AideController(activity, parent, self));
    }
}
