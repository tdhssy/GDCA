package com.example.gdca;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.gdca.controller.ChangeView;
import com.example.gdca.model.Model;
import com.example.gdca.model.PageName;


/**
 * Main class
 * test 2
 */
public class Launch extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        @SuppressWarnings("unused")
        Model model = new Model(this);
        ChangeView controller = new ChangeView(model);
        controller.swap(this, PageName.ACCEUIL,null);
    }

}
