package com.example.gdca.model;

import com.example.gdca.view.Acceuil;

import java.util.ArrayList;


public class ListeElement extends Element{

    private ArrayList<Element> elements;
    public ListeElement(String name) {
        super(name);
        elements = new ArrayList<>();
    }

    public void ajout(Element e){
        if(elements.size() < 9) {
            e.setFather(this);
            elements.add(e);
        }else{
            System.out.println("Impossible de mettre plus de 9 elements dans la liste");
        }
    }

    public ArrayList<Element> getElements(){
        return elements;
    }
    @Override
    public void affiche() {
        Acceuil.nouvelleAffichage(this);
    }
}
