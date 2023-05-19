package com.example.gdca.model;

public class DescriptionElement extends Element{
    public DescriptionElement(String name) {
        super(name);
    }

    @Override
    public void affiche() {
        System.out.println("description de " + getName());
    }
}
