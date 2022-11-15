package com.example.collectionx.metier;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.ArrayList;

public class Produit {

    private Integer id_produit;

    private String description;

    private Type type;

    private ArrayList<ProduitCaracteristique> listproduitCaracteristiques;


    public IntegerProperty idProperty()
    {
        return new SimpleIntegerProperty(id_produit);
    }

    public Integer getId_produit() {
        return id_produit;
    }
    public void setId_produit(Integer id_produit) {
        this.id_produit = id_produit;
    }


    public StringProperty descriptionProperty()
    {
        return new SimpleStringProperty(description);
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }


    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public ArrayList<ProduitCaracteristique> getListproduitCaracteristiques() {
        return listproduitCaracteristiques;
    }

    public void setListproduitCaracteristiques(ArrayList<ProduitCaracteristique> listproduitCaracteristiques) {
        this.listproduitCaracteristiques = listproduitCaracteristiques;
    }


    @Override
    public String toString() {
        return "Produit{" +
                "id_produit=" + id_produit +
                ", description='" + description + '\'' +
                ", type=" + type +
                ", listproduitCaracteristiques=" + listproduitCaracteristiques +
                "}\n";
    }
}
