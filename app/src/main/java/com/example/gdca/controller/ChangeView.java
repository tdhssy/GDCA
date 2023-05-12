package com.example.gdca.controller;

import android.app.Activity;
import android.view.View;
import com.example.gdca.model.Model;
import com.example.gdca.view.Contact;
import com.example.gdca.view.Acceuil;
import com.example.gdca.view.Parametre;

/**
 * Gère les changements de vue
 */
public class ChangeView {
    private Model cModel;
    private View cView;

    public ChangeView(Activity activity, PageName page){
        cModel = new Model();

        switch (page)
        {
            case ACCEUIL:
                cView = new Acceuil(activity);
                break;
            case PARAMETRE:
                cView = new Parametre(activity);
                break;
            case CONTACT:
                cView = new Contact(activity);
                break;
        }
    }
}
