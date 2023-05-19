package com.example.gdca.model;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.example.gdca.R;
import com.example.gdca.view.Acceuil;

import java.util.ArrayList;
public class GestionListe extends ArrayAdapter<Element> {

    public GestionListe(@NonNull Context context, @NonNull ArrayList<Element> listeGauche) {
        super(context, R.layout.bouton_liste, listeGauche);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.bouton_liste, parent, false);
        }
        Button boutonListe = convertView.findViewById(R.id.boutonListe);
        Element element = this.getItem(position);
        boutonListe.setText(element.getName());
        boutonListe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                element.affiche();
                Acceuil.manip.setVisibility(View.VISIBLE);
            }

        });
        return convertView;
    }
}
