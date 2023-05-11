package com.example.gdca.controller;

import android.os.Bundle;
import android.view.View;
import com.example.gdca.R;
import com.example.gdca.model.Model;
import com.example.gdca.view.MainView;

public class MainController implements View.OnClickListener {

    private  Model cModel;
    private View cView;

    public MainController(View view, Model model){
        cModel=model;
        cView=view;

    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.b1:
                System.out.println("b1 cliquer");
                break;
            case R.id.b2:
                System.out.println("b2 cliquer");
                break;
        }
    }
}
