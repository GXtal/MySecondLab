package by.bsuir.secondLab.dao.impl;

import by.bsuir.secondLab.dao.SearchDAO;
import by.bsuir.secondLab.goods.Fridge;
import by.bsuir.secondLab.goods.Product;

import java.util.ArrayList;

public class SearchDAOFile implements SearchDAO {
    @Override
    public ArrayList<Product> findType() {
        ArrayList<Product> a= new ArrayList<Product>();
        a.add(new Fridge());
        return a;
    }

    @Override
    public ArrayList<Product> findMinPrice() {
        return  null;
    }
}
