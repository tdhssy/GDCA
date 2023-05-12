package com.example.gdca.controller.eventHandler;

import android.app.Activity;
import android.view.View;
import com.example.gdca.R;
import com.example.gdca.controller.ChangeView;
import com.example.gdca.controller.PageName;

/**
 * Controller de MainView
 */
public class AcceuilController extends Controller implements View.OnClickListener {
    public AcceuilController(Activity activity) {
        super(activity);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.b1:
                System.out.println("b1 cliquer");
                new ChangeView(currentActivity, PageName.CONTACT);
                break;
            case R.id.b2:
                System.out.println("b2 cliquer");
                new ChangeView(currentActivity, PageName.PARAMETRE);
                break;
        }
    }
}
