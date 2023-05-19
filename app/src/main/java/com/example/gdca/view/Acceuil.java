package com.example.gdca.view;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.example.gdca.R;
import com.example.gdca.controller.ChangeView;
import com.example.gdca.controller.eventHandler.AcceuilController;
import com.example.gdca.model.DescriptionElement;
import com.example.gdca.model.Element;
import com.example.gdca.model.GestionListe;
import com.example.gdca.model.ListeElement;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListSet;

public class Acceuil extends View{
    private final OnClickListener eventHandler;

    private ImageButton menu;
    private ImageButton aide;
    private ImageButton principal;
    private ImageButton retour;
    private ListView listeGauche;
    private ListView listeDroite;
    public static ListeElement listeElement;
    public static LinearLayout manip;
    private static GestionListe adapterGauche;
    private static GestionListe adapterDroite;

    public Acceuil(ChangeView controller, Activity activity) {
        super(activity);
        eventHandler = new AcceuilController(controller, activity);

        activity.setContentView(R.layout.accruil);

        menu = (ImageButton) activity.findViewById(R.id.b_menu);
        menu.setOnClickListener(eventHandler);

        aide = (ImageButton) activity.findViewById(R.id.b_aide);
        aide.setOnClickListener(eventHandler);

        principal = (ImageButton) activity.findViewById(R.id.b_principal);
        principal.setOnClickListener(eventHandler);

        retour = (ImageButton) activity.findViewById(R.id.b_retour);
        retour.setOnClickListener(eventHandler);

        listeGauche = activity.findViewById(R.id.listeGauche);
        listeDroite = activity.findViewById(R.id.listeDroite);

        adapterGauche = new GestionListe(this.getContext(), new ArrayList<Element>());
        listeGauche.setAdapter(adapterGauche);

        adapterDroite = new GestionListe(this.getContext(), new ArrayList<Element>());
        listeDroite.setAdapter(adapterDroite);

        manip = (LinearLayout) activity.findViewById(R.id.manip);
        manip.setVisibility(View.INVISIBLE);

        menuPrincipal();
    }

    public static void nouvelleAffichage(ListeElement listeE){

        adapterGauche.clear();
        adapterDroite.clear();
        ArrayList<Element> elements = listeE.getElements();

        if (elements.size() < 9) {
            for (Element e : elements) {
                if (adapterGauche.getCount() < 4) {
                    adapterGauche.add(e);
                } else if (adapterDroite.getCount() < 4) {
                    adapterDroite.add(e);
                }
            }
            listeElement = listeE;
        } else {
            System.out.println("Il a plus de 8 élement dans votre liste impossible de rajouter a la view");
        }
    }

    public static void menuPrincipal(){

        ListeElement home = new ListeElement("home");
        ListeElement listTest1 = new ListeElement("listTest1");
        ListeElement listTest2 = new ListeElement("listTest2");
        listTest2.ajout(new DescriptionElement("descriptionTest"));
        listTest1.ajout(listTest2);
        home.ajout(listTest1);

        nouvelleAffichage(home);
    }
}