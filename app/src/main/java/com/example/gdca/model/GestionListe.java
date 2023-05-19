package com.example.gdca.model;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.example.gdca.R;

import java.util.ArrayList;
public class GestionListe extends ArrayAdapter<Element> implements AdapterView.OnItemClickListener {

    public GestionListe(@NonNull Context context, @NonNull ArrayList<Element> listeGauche) {
        super(context, R.layout.bouton_liste, listeGauche);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.bouton_liste, parent, false);
        }
        Button boutonListe = convertView.findViewById(R.id.boutonListe);
        boutonListe.setText(this.getItem(position).getName());

        return convertView;
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        System.out.println("hello");
        System.out.println(position);
        System.out.println(id);

    }
}
