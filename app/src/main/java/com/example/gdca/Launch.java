package com.example.gdca;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.gdca.controller.ChangeView;
import com.example.gdca.controller.MainController;
import com.example.gdca.controller.PageName;
import com.example.gdca.model.Model;
import com.example.gdca.view.MainView;

/**
 * Main class
 */
public class Launch extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ChangeView controller = ChangeView.getChangeView();
        controller.setCurrentActivity(this);
        controller.switchPage(PageName.ACCEUIL);
    }

}
