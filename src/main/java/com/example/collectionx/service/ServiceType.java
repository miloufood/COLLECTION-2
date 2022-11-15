package com.example.collectionx.service;

import com.example.collectionx.dao.DAOfactory;
import com.example.collectionx.metier.Type;

public class ServiceType {

    public boolean deleteType(Type type) {
        return DAOfactory.getTypeDAO().delete(type);
    }


    public boolean updateType(Type type) {
        return DAOfactory.getTypeDAO().update(type);
    }


    public boolean insertType(Type type) {
        return DAOfactory.getTypeDAO().insert(type);
    }


}
