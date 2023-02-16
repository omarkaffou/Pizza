package com.example.pizaaapp.service;

import java.util.ArrayList;
import java.util.List;


import com.example.pizaaapp.beans.Pizza;
import com.example.pizaaapp.dao.IDao;


public class ProduitService implements IDao<Pizza> {
    private List <Pizza> fruits;

    private static ProduitService instance;

    private ProduitService() {
        this.fruits = new ArrayList<>();
    }

    public static ProduitService getInstance() {
        if(instance == null)
            instance =  new ProduitService();
        return instance;
    }

    @Override
    public boolean create(Pizza o) {
        return fruits.add(o);
    }

    @Override
    public boolean update(Pizza o) {
        return false;
    }

    @Override
    public boolean delete(Pizza o) {
        return fruits.remove(o);
    }

    @Override
    public Pizza findById(int id) {
        for(Pizza f : fruits){
            if(f.getId() == id)
                return f;
        }
        return null;
    }

    @Override
    public List<Pizza> findAll() {
        return fruits;
    }
}
