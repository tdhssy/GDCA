package com.example.gdca.controller.eventHandler;

import android.app.Activity;
import android.view.View;
import com.example.gdca.R;
import com.example.gdca.controller.ChangeView;
import com.example.gdca.model.PageName;

/**
 * Controller de Parametre
 */
public class ParametreController extends Controller implements View.OnClickListener {

    public ParametreController(ChangeView controller, Activity activity) {
        super(controller, activity);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.b_retour:
                controller_view.retourArriere(currentActivity);
                break;
            case R.id.b_acceuil:
                controller_view.swap(currentActivity, PageName.ACCEUIL, PageName.PARAMETRE);
                break;
            case R.id.b_preference:
                //Je ne sais pas ce que ce bouton fait
                break;
            case R.id.b_a_propos:
                break;
            case R.id.b_quitter:
                //Quitte l'application
                currentActivity.finish();
                System.exit(0);
                break;
        }
    }
}