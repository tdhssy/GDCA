package com.example.gdca.controller.eventHandler;

import android.app.Activity;
import android.view.View;
import com.example.gdca.R;
import com.example.gdca.controller.ChangeView;
import com.example.gdca.controller.PageName;
import com.example.gdca.controller.eventHandler.Controller;

/**
 * Controller de Parametre
 */
public class ParametreController extends Controller implements View.OnClickListener {

    public ParametreController(Activity activity)
    {
        super(activity);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.button:
                System.out.println("button cliquer");
                new ChangeView(currentActivity, PageName.ACCEUIL);
                break;
        }
    }
}