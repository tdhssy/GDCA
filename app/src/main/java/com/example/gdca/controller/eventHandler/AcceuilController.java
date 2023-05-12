package com.example.gdca.controller.eventHandler;

import android.app.Activity;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.Toast;
import com.example.gdca.R;
import com.example.gdca.controller.ChangeView;
import com.example.gdca.controller.PageName;

/**
 * Controller de MainView
 */
public class AcceuilController extends Controller implements View.OnClickListener {
    /**
     * Constructeur à utiliser pour le changement de page
     * @param activity
     * @param to_go_page      Page désirée
     * @param page_precedente Page actuelle
     */
    public AcceuilController(Activity activity, PageName to_go_page, PageName page_precedente)
    {
        super(activity, to_go_page, page_precedente);

    }

    /**
     * Constructeur à utiliser pour les actions des boutons lambda
     */
    public AcceuilController()
    {
        super(null,null,null);
    }

    @Override
    public void onClick(View view) {
        //Toast.makeText(currentActivity, "test",Toast.LENGTH_LONG).show();
        switch (view.getId())
        {
            case R.id.go_contact:
                System.out.println("b1 cliquer");
                new ChangeView(currentActivity, to_go_page, page_precedente);
                break;
            case R.id.b_menu:
                System.out.println("b2 cliquer");
                new ChangeView(currentActivity, to_go_page, page_precedente);
                break;
        }
    }
}
