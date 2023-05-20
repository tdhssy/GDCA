package com.example.gdca.model;

import android.content.Context;
import com.example.gdca.R;


public class Model {

    ListeElement hierachie;
    private Context currentContext;
    public Model(Context context){

        this.currentContext = context;
        hierachie = InitHierachie();



    }

    private ListeElement InitHierachie(){
        //Haut de hierachie
        ListeElement home = new ListeElement("home");


        //Home Contenue
        ListeElement listPedalier = new ListeElement(currentContext.getString(R.string.Pedalier));
        ListeElement listSuspension = new ListeElement(currentContext.getString(R.string.Suspension));
        ListeElement listCadre = new ListeElement(currentContext.getString(R.string.Cadre));
        ListeElement listFrein = new ListeElement(currentContext.getString(R.string.Frein));
        ListeElement listRoue = new ListeElement(currentContext.getString(R.string.Roue));
        ListeElement listGuidon = new ListeElement(currentContext.getString(R.string.Guidon));
        ListeElement listSelle = new ListeElement(currentContext.getString(R.string.Selle));

            //Ajout
            home.ajout(listPedalier);
            home.ajout(listSuspension);
            home.ajout(listCadre);
            home.ajout(listFrein);
            home.ajout(listRoue);
            home.ajout(listGuidon);
            home.ajout(listSelle);


        //Liste contenue pedalier
        ListeElement listplateaux = new ListeElement(currentContext.getString(R.string.Plateaux));
        ListeElement listManivelle = new ListeElement(currentContext.getString(R.string.Manivelles));
        ListeElement listAxe = new ListeElement(currentContext.getString(R.string.Axe));
        ListeElement listPedale = new ListeElement(currentContext.getString(R.string.Pedales));

            //Ajout
            listPedalier.ajout(listplateaux);
            listPedalier.ajout(listManivelle);
            listPedalier.ajout(listAxe);
            listPedalier.ajout(listPedale);

        //Liste contenue Suspension
        ListeElement listFourche = new ListeElement(currentContext.getString(R.string.Fourche));
        ListeElement listAmortisseur = new ListeElement(currentContext.getString(R.string.Amortisseur));
        ListeElement listRssorts = new ListeElement(currentContext.getString(R.string.Ressorts));
        ListeElement listJointDetanchiete = new ListeElement(currentContext.getString(R.string.JointsDetancheite));

            //ajout
            listSuspension.ajout(listFourche);
            listSuspension.ajout(listAmortisseur);
            listSuspension.ajout(listRssorts);
            listSuspension.ajout(listJointDetanchiete);


        //Liste contenue Cadre
        ListeElement listTube = new ListeElement(currentContext.getString(R.string.Tubes));
        ListeElement listJonction = new ListeElement(currentContext.getString(R.string.Jonctions));
        ListeElement listPatte = new ListeElement(currentContext.getString(R.string.Pattes));
        ListeElement listDouilleDeDirection = new ListeElement(currentContext.getString(R.string.DouilleDeDirection));
        ListeElement listDouilleDeBoitierDePedalier = new ListeElement(currentContext.getString(R.string.DouilleDeBoitierDePedalier));
        ListeElement listTigeDeSelle = new ListeElement(currentContext.getString(R.string.TigeDeSelle));

            //Ajout
            listCadre.ajout(listTube);
            listCadre.ajout(listJonction);
            listCadre.ajout(listPatte);
            listCadre.ajout(listDouilleDeDirection);
            listCadre.ajout(listDouilleDeBoitierDePedalier);
            listCadre.ajout(listTigeDeSelle);


        //Liste contenue frein
        ListeElement listLevierDeFrein = new ListeElement(currentContext.getString(R.string.LevierDeFrein));
        ListeElement listCablesDeFrein = new ListeElement(currentContext.getString(R.string.CableDeFrein));
        ListeElement listEtriersDeFrein = new ListeElement(currentContext.getString(R.string.EtrierDeFrein));
        ListeElement listPatinsDeFrein = new ListeElement(currentContext.getString(R.string.PatinsDeFrein));
        ListeElement listDisqueDeFrein = new ListeElement(currentContext.getString(R.string.DisquesDeFrein));
        ListeElement listPlaquetteDeFrein = new ListeElement(currentContext.getString(R.string.PlaquettesDeFrein));

            //Ajout
            listFrein.ajout(listLevierDeFrein);
            listFrein.ajout(listCablesDeFrein);
            listFrein.ajout(listEtriersDeFrein);
            listFrein.ajout(listPatinsDeFrein);
            listFrein.ajout(listDisqueDeFrein);
            listFrein.ajout(listPlaquetteDeFrein);

        //Liste contenue Selle
        ListeElement listCoque = new ListeElement(currentContext.getString(R.string.Coque));
        ListeElement listRembourrage = new ListeElement(currentContext.getString(R.string.Rembourrage));
        ListeElement listRevetement = new ListeElement(currentContext.getString(R.string.Revetement));
        ListeElement listRails = new ListeElement(currentContext.getString(R.string.Rails));
        ListeElement listTige = new ListeElement(currentContext.getString(R.string.Tige));

            //ajout
            listSelle.ajout(listCoque);
            listSelle.ajout(listRembourrage);
            listSelle.ajout(listRevetement);
            listSelle.ajout(listRails);
            listSelle.ajout(listTige);

        //Liste contenue Guidon
        ListeElement listPotence = new ListeElement(currentContext.getString(R.string.Potence));
        ListeElement listCintre = new ListeElement(currentContext.getString(R.string.Cintre));
        ListeElement listLevierDeFreinGuidon = new ListeElement(currentContext.getString(R.string.LevierDeFrein));
        ListeElement listManetteDeVitesse = new ListeElement(currentContext.getString(R.string.ManetteDeVitesse));
        ListeElement listPoignee = new ListeElement(currentContext.getString(R.string.Poignees));
        ListeElement listBarends = new ListeElement(currentContext.getString(R.string.Barends));

            //ajout
            listGuidon.ajout(listPotence);
            listGuidon.ajout(listCintre);
            listGuidon.ajout(listLevierDeFreinGuidon);
            listGuidon.ajout(listManetteDeVitesse);
            listGuidon.ajout(listPoignee);
            listGuidon.ajout(listBarends);

        //Liste contenue Roue
        ListeElement listMoyeu = new ListeElement(currentContext.getString(R.string.Moyeu));
        ListeElement listRayon = new ListeElement(currentContext.getString(R.string.Rayon));
        ListeElement listJante = new ListeElement(currentContext.getString(R.string.Jante));
        ListeElement listPneu = new ListeElement(currentContext.getString(R.string.Pneu));
        ListeElement listChambreAAir = new ListeElement(currentContext.getString(R.string.ChambreAAire));
        ListeElement listBlocageRapide = new ListeElement(currentContext.getString(R.string.BlocageRapide));
        ListeElement listFondDeJante = new ListeElement(currentContext.getString(R.string.FondDeJante));
        ListeElement listValve = new ListeElement(currentContext.getString(R.string.Valve));

            //ajout
            listRoue.ajout(listMoyeu);
            listRoue.ajout(listRayon);
            listRoue.ajout(listJante);
            listRoue.ajout(listPneu);
            listRoue.ajout(listChambreAAir);
            listRoue.ajout(listBlocageRapide);
            listRoue.ajout(listFondDeJante);
            listRoue.ajout(listValve);


        //Liste Description

        //Liste contenue Rayon
        DescriptionElement  Rayon1 = new DescriptionElement(currentContext.getString(R.string.Rayon_Cassure_Ou_Rupture));
        DescriptionElement Rayon2 = new DescriptionElement(currentContext.getString(R.string.Rayon_Detension));
        DescriptionElement Rayon3 = new DescriptionElement(currentContext.getString(R.string.Rayon_Desserrage));
        DescriptionElement Rayon4 = new DescriptionElement(currentContext.getString(R.string.Rayon_Mauvais_Alignement));

            //ajout
            listRayon.ajout(Rayon1);
            listRayon.ajout(Rayon2);
            listRayon.ajout(Rayon3);
            listRayon.ajout(Rayon4);



        //Liste Contenue Moyeu
        DescriptionElement Moyeu1 = new DescriptionElement(currentContext.getString(R.string.Moyeu_Jeu_excessif_dans_le_moyeu));
        DescriptionElement Moyeu2 = new DescriptionElement(currentContext.getString(R.string.Moyeu_Bruit_anormal_provenant_du_moyeu));
        DescriptionElement Moyeu3 = new DescriptionElement(currentContext.getString(R.string.Moyeu_Moyeu_qui_ne_tourne_pas_en_douceur));
        DescriptionElement Moyeu4 = new DescriptionElement(currentContext.getString(R.string.Moyeu_casse_ou_endommage));
        DescriptionElement Moyeu5 = new DescriptionElement(currentContext.getString(R.string.Moyeu_Mauvaise_retention_des_roulements));
        DescriptionElement Moyeu6 = new DescriptionElement(currentContext.getString(R.string.Moyeu_Incompatibilite_du_moyeu_avec_dautres_composants));

            //ajout
            listMoyeu.ajout(Moyeu1);
            listMoyeu.ajout(Moyeu2);
            listMoyeu.ajout(Moyeu3);
            listMoyeu.ajout(Moyeu4);
            listMoyeu.ajout(Moyeu5);
            listMoyeu.ajout(Moyeu6);

        //Liste Contenue Valve
        DescriptionElement valve1 = new DescriptionElement(currentContext.getString(R.string.Valve_defectueuse));
        DescriptionElement valve2 = new DescriptionElement(currentContext.getString(R.string.Valve_Obstruction));
        DescriptionElement valve3 = new DescriptionElement(currentContext.getString(R.string.Valve_Fuite_dair));
        DescriptionElement valve4 = new DescriptionElement(currentContext.getString(R.string.Valve_mal_positionnee));


            //ajout
            listValve.ajout(valve1);
            listValve.ajout(valve2);
            listValve.ajout(valve3);
            listValve.ajout(valve4);

        //Liste Contenue FondDeJante
        DescriptionElement FondDeJante1 = new DescriptionElement(currentContext.getString(R.string.Fond_De_Jante_Deformation));
        DescriptionElement FondDeJante2 = new DescriptionElement(currentContext.getString(R.string.Fond_De_Jante_Mauvaise_installation));
        DescriptionElement FondDeJante3 = new DescriptionElement(currentContext.getString(R.string.Fond_De_Jante_Usure_ou_deterioration));


            //ajout
            listFondDeJante.ajout(FondDeJante1);
            listFondDeJante.ajout(FondDeJante2);
            listFondDeJante.ajout(FondDeJante3);

        //Liste Contenue BlocageRapide
        DescriptionElement BlocageRapide1 = new DescriptionElement(currentContext.getString(R.string.Blocage_Rapide_Blocage_insuffisant));
        DescriptionElement BlocageRapide2 = new DescriptionElement(currentContext.getString(R.string.Blocage_Rapide_Mauvaise_installation));
        DescriptionElement BlocageRapide3 = new DescriptionElement(currentContext.getString(R.string.Blocage_Rapide_Usure_ou_endommagement));


            //ajout
            listBlocageRapide.ajout(BlocageRapide1);
            listBlocageRapide.ajout(BlocageRapide2);
            listBlocageRapide.ajout(BlocageRapide3);

        //Liste Contenue ChambreAAir
        DescriptionElement ChambreAAir1 = new DescriptionElement(currentContext.getString(R.string.Chambre_a_air_Crevaison));
        DescriptionElement ChambreAAir2 = new DescriptionElement(currentContext.getString(R.string.Chambre_a_air_Pincement));
        DescriptionElement ChambreAAir3 = new DescriptionElement(currentContext.getString(R.string.Chambre_a_air_Sousgonflage));
        DescriptionElement ChambreAAir4 = new DescriptionElement(currentContext.getString(R.string.Chambre_a_air_Dechirure_ou_perforation));
        DescriptionElement ChambreAAir5 = new DescriptionElement(currentContext.getString(R.string.Chambre_a_air_Valve_defectueuse));

            //ajout
            listChambreAAir.ajout(ChambreAAir1);
            listChambreAAir.ajout(ChambreAAir2);
            listChambreAAir.ajout(ChambreAAir3);
            listChambreAAir.ajout(ChambreAAir4);
            listChambreAAir.ajout(ChambreAAir5);


        //Liste Contenue Pneu
        DescriptionElement Pneu1 = new DescriptionElement(currentContext.getString(R.string.Pneu_Crevaison));
        DescriptionElement Pneu2 = new DescriptionElement(currentContext.getString(R.string.Pneu_Sousgonflage));
        DescriptionElement Pneu3 = new DescriptionElement(currentContext.getString(R.string.Pneu_Surgonflage));
        DescriptionElement Pneu4 = new DescriptionElement(currentContext.getString(R.string.Pneu_Dechirure_ou_fissure_sur_le_flanc_du_pneu));


            //ajout
            listPneu.ajout(Pneu1);
            listPneu.ajout(Pneu2);
            listPneu.ajout(Pneu3);
            listPneu.ajout(Pneu4);

        //Liste Contenue Jante
        DescriptionElement Jante1 = new DescriptionElement(currentContext.getString(R.string.Jante_Deformation_jante));
        DescriptionElement Jante2 = new DescriptionElement(currentContext.getString(R.string.Jante_Mauvais_alignement_jante));
        DescriptionElement Jante3 = new DescriptionElement(currentContext.getString(R.string.Jante_Probleme_vibration_jante));
        DescriptionElement Jante4 = new DescriptionElement(currentContext.getString(R.string.Jante_Usure_surface_freinage));


        //ajout
        listJante.ajout(Jante1);
        listJante.ajout(Jante2);
        listJante.ajout(Jante3);
        listJante.ajout(Jante4);


        return home;
    }

    public ListeElement getHierachie(){
        return hierachie;
    }


}
