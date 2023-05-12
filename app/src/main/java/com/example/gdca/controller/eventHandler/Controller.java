package com.example.gdca.controller.eventHandler;

import android.app.Activity;
import com.example.gdca.controller.PageName;

public class Controller {
    protected final Activity currentActivity;
    protected final PageName page_precedente;
    protected final PageName to_go_page;
    public Controller(Activity activity, PageName to_go_page, PageName page_precedente)
    {
        currentActivity = activity;
        this.to_go_page = to_go_page;
        this.page_precedente = page_precedente;
    }

}
