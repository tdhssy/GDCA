package com.example.gdca.controller.eventHandler;

import android.app.Activity;
import android.view.View;
import com.example.gdca.R;
import com.example.gdca.controller.ChangeView;
import com.example.gdca.model.PageName;

public class AideController extends Controller implements View.OnClickListener {

    public AideController(ChangeView controller, Activity activity) {
        super(controller, activity);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.menuBar:
                controller_view.swap(currentActivity, PageName.PARAMETRE, PageName.AIDE);
                break;
            case R.id.b_retour:
            case R.id.RetourButton:
                controller_view.retourArriere(currentActivity);
                break;
        }
    }
}
