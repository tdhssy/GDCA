package com.example.gdca.controller;

import android.app.Activity;
import android.view.View;
import com.example.gdca.R;

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