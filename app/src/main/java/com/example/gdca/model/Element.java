package com.example.gdca.model;

public abstract class Element{

    private String name;

    private ListeElement father;

    public Element(String name){
        this.name = name;
        father = null;
    }



    public String getName(){
        return this.name;
    }

    public void setFather(ListeElement elements){
        father = elements;
    }
    public ListeElement getFather(){
        return father;
    }
    public abstract void affiche();

    public String toString(){
        return "voici " + name;
    }
}

