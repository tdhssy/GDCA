package com.example.gdca;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.gdca.controller.ChangeView;
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
        ChangeView controller = new ChangeView();
        controller.swap(this, PageName.ACCEUIL,null);
    }

}
