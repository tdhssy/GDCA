package com.example.gdca.view;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import com.example.gdca.R;
import com.example.gdca.controller.PageName;
import com.example.gdca.controller.eventHandler.DescriptionController;

public class Description extends View {
    private final PageName self = PageName.DESCRIPTION;
    private final PageName parent;
    private Button retour;
    public Description(Activity activity, PageName parent) {
        super(activity);
        this.parent = parent;

        activity.setContentView(R.layout.description);

        retour = (Button) activity.findViewById(R.id.b_retour);
        retour.setOnClickListener(new DescriptionController(activity, parent, self));
    }
}
