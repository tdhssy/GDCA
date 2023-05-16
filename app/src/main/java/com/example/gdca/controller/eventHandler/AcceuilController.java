package com.example.gdca.controller.eventHandler;

import android.app.Activity;
import android.view.View;
import android.widget.Toast;
import com.example.gdca.R;
import com.example.gdca.controller.ChangeView;
import com.example.gdca.model.PageName;

/**
 * Controller de MainView
 */
public class AcceuilController extends Controller implements View.OnClickListener {

    public AcceuilController(ChangeView controller, Activity activity) {
        super(controller, activity);
    }
    @Override
    public void onClick(View view) {
        //Toast.makeText(currentActivity, "test",Toast.LENGTH_LONG).show();
        switch (view.getId())
        {
            case R.id.b_menu:
                controller_view.swap(currentActivity, PageName.PARAMETRE, PageName.ACCEUIL);
                break;
            case R.id.b_aide:
                controller_view.swap(currentActivity, PageName.AIDE, PageName.ACCEUIL);
                break;
            case R.id.b_pedalier:
            case R.id.b_suspension:
            case R.id.b_cadre:
            case R.id.b_frein:
            case R.id.b_roue:
            case R.id.b_guidon:
            case R.id.b_selle:
                //TODO
                Toast.makeText(currentActivity, "a modif",Toast.LENGTH_LONG).show();
                controller_view.swap(currentActivity, PageName.DESCRIPTION, PageName.ACCEUIL);
                break;
        }
    }
}
