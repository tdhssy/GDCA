package com.example.gdca.controller;

import android.os.Bundle;
import android.view.View;
import com.example.gdca.R;
import com.example.gdca.model.Model;
import com.example.gdca.view.MainView;

/**
 * Controller de MainView
 */
public class MainController implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.b1:
                System.out.println("b1 cliquer");
                break;
            case R.id.b2:
                System.out.println("b2 cliquer");
                ChangeView.getChangeView().switchPage(PageName.PARAMETRE);
                break;
        }
    }
}
