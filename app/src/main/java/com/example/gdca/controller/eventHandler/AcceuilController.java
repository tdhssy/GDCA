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
            case R.id.go_contact:
                controller_view.swap(currentActivity, PageName.CONTACT, PageName.ACCEUIL);
                break;
            case R.id.b_menu:
                System.out.println("b2 cliquer");
                controller_view.swap(currentActivity, PageName.PARAMETRE, PageName.ACCEUIL);
                break;
        }
    }
}
