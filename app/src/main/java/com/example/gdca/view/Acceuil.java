package com.example.gdca.view;

import android.app.Activity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.example.gdca.R;
import com.example.gdca.controller.ChangeView;
import com.example.gdca.controller.eventHandler.AcceuilController;
import com.example.gdca.model.Element;
import com.example.gdca.model.GestionListe;
import com.example.gdca.model.ListeElement;
import com.example.gdca.model.Model;

import java.util.ArrayList;


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

    public Acceuil(ChangeView controller, Activity activity,ListeElement home, Model model) {
        super(activity);
        eventHandler = new AcceuilController(controller, activity, model);

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

        menuPrincipal(home);
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

    public static void menuPrincipal(ListeElement home){
        nouvelleAffichage(home);
    }
}