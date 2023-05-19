package com.example.gdca.model;
import android.content.Context;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import org.jetbrains.annotations.NotNull;

public class Element{

    private String name;

    public Element(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void affiche(){
        System.out.print(name);
    }
}

