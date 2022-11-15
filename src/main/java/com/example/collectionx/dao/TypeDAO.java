package com.example.collectionx.dao;


import com.example.collectionx.metier.Type;

import java.sql.Connection;
import java.util.ArrayList;

public class TypeDAO extends DAO<Type,Type> {

    private static final Connection connexion = CollectionConnect.getInstance();

    protected TypeDAO(Connection connexion) {
        super(connexion);
    }


    @Override
    public Type getByID(int id) {
        return null;
    }

    @Override
    public ArrayList<Type> getAll() {
        return null;
    }

    @Override
    public ArrayList<Type> getLike(Type objet) {
        return null;
    }

    @Override
    public boolean insert(Type objet) {
        return false;
    }

    @Override
    public boolean update(Type object) {
        return false;
    }

    @Override
    public boolean delete(Type object) {
        return false;
    }
}
