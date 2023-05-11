package com.example.gdca.controller;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.example.gdca.R;
import com.example.gdca.model.Model;
import com.example.gdca.view.MainView;

/**
 * Controller de MainView
 */
public class MainController extends Controller implements View.OnClickListener {
    public MainController(Activity activity) {
        super(activity);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.b1:
                System.out.println("b1 cliquer");
                break;
            case R.id.b2:
                System.out.println("b2 cliquer");
                new ChangeView(currentActivity, PageName.PARAMETRE);
                break;
        }
    }
}
