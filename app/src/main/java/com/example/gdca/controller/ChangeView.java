package com.example.gdca.controller;

import android.app.Activity;
import android.view.View;
import com.example.gdca.model.Model;
import com.example.gdca.view.MainView;
import com.example.gdca.view.Parametre;

/**
 * Gère les changements de vue
 *
 * Singleton TODO à modifier pour enlever le memory leak
 */
public class ChangeView {
    private static ChangeView self = null;
    private Activity currentActivity;
    private Model cModel;
    private View cView;

    private ChangeView(){ cModel = new Model(); }

    public static ChangeView getChangeView()
    {
        if (self == null) self = new ChangeView();
        return self;
    }

    public void setCurrentActivity(Activity a){
        currentActivity = a;
    }

    public void setModel(Model m) { cModel = m; }

    public void switchPage(PageName page)
    {
        switch (page)
        {
            case ACCEUIL:
                cView = new MainView(currentActivity);
                break;
            case PARAMETRE:
                cView = new Parametre(currentActivity);
                break;
        }
    }
}
