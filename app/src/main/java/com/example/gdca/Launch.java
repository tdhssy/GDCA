package com.example.gdca;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.gdca.controller.ChangeView;
import com.example.gdca.controller.PageName;


/**
 * Main class
 * test
 */
public class Launch extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        @SuppressWarnings("unused")
        ChangeView controller = new ChangeView(this, PageName.ACCEUIL);
    }

}
