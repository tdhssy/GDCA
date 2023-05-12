package com.example.gdca.controller;

import android.app.Activity;
import android.view.View;
import com.example.gdca.model.Model;
import com.example.gdca.view.*;

/**
 * Gère les changements de vue
 */
public class ChangeView {
    private Model cModel;
    private View cView;

    public ChangeView(Activity activity, PageName to_go_page, PageName parent){
        cModel = new Model();

        switch (to_go_page)
        {
            case ACCEUIL:
                cView = new Acceuil(activity);
                break;
            case PARAMETRE:
                cView = new Parametre(activity, parent);
                break;
            case CONTACT:
                cView = new Contact(activity, parent);
                break;
            case AIDE:
                cView = new Aide(activity, parent);
                break;
            case DESCRIPTION:
                cView = new Description(activity, parent);
        }
    }
}
