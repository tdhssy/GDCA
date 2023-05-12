package com.example.gdca.controller.eventHandler;

import android.app.Activity;
import android.view.View;
import com.example.gdca.R;
import com.example.gdca.controller.ChangeView;
import com.example.gdca.controller.PageName;

public class ContactController extends Controller implements View.OnClickListener {
    public ContactController(Activity activity) {
        super(activity);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.button2:
                new ChangeView(currentActivity, PageName.ACCEUIL);
                break;
        }
    }
}
