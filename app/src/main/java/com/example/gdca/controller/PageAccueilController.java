package com.example.gdca.controller;

import android.view.View;
import com.example.gdca.R;

import com.example.gdca.view.MainActivity;
public class PageAccueilController implements View.OnClickListener {

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
