package by.bsuir.secondLab.dao;

import by.bsuir.secondLab.beans.Product;

import java.util.ArrayList;

public interface SearchDAO {
    ArrayList<Product> findType();
    ArrayList<Product> findMinPrice();
}
