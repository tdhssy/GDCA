package com.example.gdca;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.gdca.controller.MainController;
import com.example.gdca.model.Model;
import com.example.gdca.view.MainView;

public class Launch extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MainView mainView = new MainView(this);
        Model model = new Model();
        MainController controller = new MainController(mainView, model);

    }

}
