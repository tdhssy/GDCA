package com.example.gdca.controller.eventHandler;

import android.app.Activity;
import com.example.gdca.controller.ChangeView;
import com.example.gdca.model.Model;

public class Controller {
    protected final ChangeView controller_view;
    protected final Activity currentActivity;
    protected final Model model;
    public Controller(ChangeView controller, Activity activity)
    {
        controller_view = controller;
        currentActivity = activity;
        model = controller_view.getcModel();
    }

}
