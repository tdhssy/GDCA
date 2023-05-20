package com.example.gdca.controller.eventHandler;

import android.app.Activity;
import android.view.View;
import com.example.gdca.R;
import com.example.gdca.controller.ChangeView;
import com.example.gdca.model.Model;
import com.example.gdca.model.PageName;
import com.example.gdca.view.Acceuil;

/**
 * Controller de MainView
 */
public class AcceuilController extends Controller implements View.OnClickListener {

    Model model;
    public AcceuilController(ChangeView controller, Activity activity) {
        super(controller, activity);

    }
    @Override
    public void onClick(View view) {
        //Toast.makeText(currentActivity, "test",Toast.LENGTH_LONG).show();
        switch (view.getId())
        {
            case R.id.b_menu:
                controller_view.swap(currentActivity, PageName.PARAMETRE, PageName.ACCEUIL);
                break;
            case R.id.b_aide:
                controller_view.swap(currentActivity, PageName.AIDE, PageName.ACCEUIL);
                break;
            case R.id.b_principal:
                Acceuil.manip.setVisibility(View.INVISIBLE);

                Acceuil.menuPrincipal(model.getHierachie());
                break;
            case R.id.b_retour:
                if(Acceuil.listeElement.getFather().getFather() == null) {
                    Acceuil.manip.setVisibility(View.INVISIBLE);
                }
                Acceuil.nouvelleAffichage(Acceuil.listeElement.getFather());
                break;
        }
    }
}
