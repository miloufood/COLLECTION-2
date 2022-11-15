package com.example.collectionx.dao;

import com.example.collectionx.metier.Referenciel;

import java.sql.Connection;
import java.util.ArrayList;

public class ReferencielDAO extends DAO<Referenciel,Referenciel> {

    private static final Connection connexion = CollectionConnect.getInstance();

    protected ReferencielDAO(Connection connexion) {
        super(connexion);
    }

    @Override
    public Referenciel getByID(int id) {
        return null;
    }

    @Override
    public ArrayList<Referenciel> getAll() {
        return null;
    }

    @Override
    public ArrayList<Referenciel> getLike(Referenciel objet) {
        return null;
    }

    @Override
    public boolean insert(Referenciel objet) {
        return false;
    }

    @Override
    public boolean update(Referenciel object) {
        return false;
    }

    @Override
    public boolean delete(Referenciel object) {
        return false;
    }
}
