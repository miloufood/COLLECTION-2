package com.example.collectionx.dao;

import com.example.collectionx.metier.Caracteristique;

import java.sql.Connection;
import java.util.ArrayList;

public class CaracteristiqueDAO extends DAO<Caracteristique,Caracteristique> {

    private static final Connection connexion = CollectionConnect.getInstance();

    protected CaracteristiqueDAO(Connection connexion) {
        super(connexion);
    }

    @Override
    public Caracteristique getByID(int id) {
        return null;
    }

    @Override
    public ArrayList<Caracteristique> getAll() {
        return null;
    }

    @Override
    public ArrayList<Caracteristique> getLike(Caracteristique objet) {
        return null;
    }

    @Override
    public boolean insert(Caracteristique objet) {
        return false;
    }

    @Override
    public boolean update(Caracteristique object) {
        return false;
    }

    @Override
    public boolean delete(Caracteristique object) {
        return false;
    }
}
