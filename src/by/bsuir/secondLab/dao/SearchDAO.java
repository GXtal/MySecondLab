package by.bsuir.secondLab.dao;

import by.bsuir.secondLab.goods.Product;

import java.util.ArrayList;

public interface SearchDAO {
    ArrayList<Product> searchType();
    ArrayList<Product> findMinPrice();
}
