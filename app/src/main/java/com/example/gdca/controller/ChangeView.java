package com.example.gdca.controller;

import android.app.Activity;
import android.view.View;
import com.example.gdca.model.Model;
import com.example.gdca.model.PageName;
import com.example.gdca.view.*;

import java.util.Stack;

/**
 * Gère les changements de vue
 */
public class ChangeView {
    private Model cModel;
    private View cView;
    private Stack<PageName> pile_deplacement; //Pile utilisée pour les retours en arrière.

    public ChangeView(){
        cModel = new Model();
        pile_deplacement = new Stack<>();
    }

    /**
     * Change la page affichée
     * @param activity
     * @param to_go_page Page désirée
     * @param parent     Page actuel
     */
    public void swap(Activity activity, PageName to_go_page, PageName parent)
    {
        switch (to_go_page)
        {
            case ACCEUIL:
                cView = new Acceuil(this, activity);
                pile_deplacement.clear(); //On est de retour au point de départ
                break;
            case PARAMETRE:
                cView = new Parametre(this, activity);
                break;
            case CONTACT:
                cView = new Contact(this, activity);
                break;
            case AIDE:
                cView = new Aide(this, activity);
                break;
            case DESCRIPTION:
                cView = new Description(this, activity);
                break;
        }
        pile_deplacement.push(parent);
    }

    /**
     * Reviens à la page précédente
     * @param activity
     */
    public void retourArriere(Activity activity)
    {
        swap(activity, pile_deplacement.pop(), pile_deplacement.peek());
    }
}
