package com.example.gdca.controller;

import android.app.Activity;
import android.view.View;
import com.example.gdca.R;

/**
 * Controller de Parametre
 */
public class ParametreController implements View.OnClickListener {

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.button:
                System.out.println("button cliquer");
                ChangeView.getChangeView().switchPage(PageName.ACCEUIL);
                break;
        }
    }
}