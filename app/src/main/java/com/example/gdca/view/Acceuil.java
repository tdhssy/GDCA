package com.example.gdca.view;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import com.example.gdca.R;
import com.example.gdca.controller.ChangeView;
import com.example.gdca.controller.eventHandler.AcceuilController;
import com.example.gdca.model.Element;
import com.example.gdca.model.GestionListe;

import java.util.ArrayList;
import java.util.List;

public class Acceuil extends View{
    private final OnClickListener eventHandler;

    private ImageButton menu;
    private ImageButton aide;

    private ListView listeGauche;

    private GestionListe adapterGauche;

    private ListView listeDroite;

    private GestionListe adapterDroite;

    public Acceuil(ChangeView controller, Activity activity) {
        super(activity);
        eventHandler = new AcceuilController(controller, activity);

        activity.setContentView(R.layout.accruil);

        menu = (ImageButton) activity.findViewById(R.id.b_menu);
        menu.setOnClickListener(eventHandler);

        aide = (ImageButton) activity.findViewById(R.id.b_aide);
        aide.setOnClickListener(eventHandler);

        listeGauche = activity.findViewById(R.id.listeGauche);

        listeDroite = activity.findViewById(R.id.listeDroite);

        adapterGauche = new GestionListe(this.getContext(), new ArrayList<Element>());
        listeGauche.setAdapter(adapterGauche);

        adapterDroite = new GestionListe(this.getContext(), new ArrayList<Element>());
        listeDroite.setAdapter(adapterDroite);

        ArrayList <Element> tests = new ArrayList<Element>();
        tests.add(new Element("test1"));
        tests.add(new Element("test2"));
        tests.add(new Element("test3"));
        tests.add(new Element("test4"));
        tests.add(new Element("test5"));
        tests.add(new Element("test6"));
        tests.add(new Element("test7"));

        nouvelleListe(tests);

    }

    private void nouvelleListe(ArrayList<Element> elements){

        adapterGauche.clear();
        adapterDroite.clear();
        if(elements.size()<8) {
            for (Element element : elements) {
                if (adapterGauche.getCount() < 4) {
                    adapterGauche.add(element);
                } else if (adapterDroite.getCount() < 4) {
                    adapterDroite.add(element);
                }
            }
        }else{
            System.out.println("Il a plus de 8 élement dans votre liste impossible de rajouter a la view");
        }
    }
}