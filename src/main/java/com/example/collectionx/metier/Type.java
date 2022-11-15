package com.example.collectionx.metier;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.ArrayList;
import java.util.List;

public class Type {

    private int id_type;

    private String libelle_type;

    private List<TypeCaracteristique> caracteristiquesType = new ArrayList();



    public IntegerProperty idProperty()
    {
        return new SimpleIntegerProperty(id_type);
    }
    public Integer getId()
    {
        return id_type;
    }

    public void setId(int id_type) {
        this.id_type = id_type;
    }


    public StringProperty libelleProperty(){
        return new SimpleStringProperty(libelle_type);
    }

    public String getLibelle()
    {
        return libelle_type;
    }

    public void setLibelle_type(String libelle_type) {
        this.libelle_type = libelle_type;
    }


    public List<TypeCaracteristique> getCaracteristiquesType() {
        return caracteristiquesType;
    }

    public void setCaracteristiquesType(List<TypeCaracteristique> caracteristiquesType) {
        this.caracteristiquesType = caracteristiquesType;
    }

    @Override
    public String toString() {
        return libelle_type ;
    }



}
