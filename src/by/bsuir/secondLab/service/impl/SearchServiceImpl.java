package by.bsuir.secondLab.service.impl;

import by.bsuir.secondLab.beans.Beans;
import by.bsuir.secondLab.dao.DAOFactory;
import by.bsuir.secondLab.dao.SearchDAO;
import by.bsuir.secondLab.service.SearchService;

public class SearchServiceImpl implements SearchService {
    @Override
    public void findType() {
        DAOFactory daoFactory = DAOFactory.getInstance();
        SearchDAO searchDAO = daoFactory.getSearchDAO();
        Beans.content=searchDAO.findType();
    }

    @Override
    public void findMinPrice() {
        DAOFactory daoFactory = DAOFactory.getInstance();
        SearchDAO searchDAO = daoFactory.getSearchDAO();
        Beans.content=searchDAO.findMinPrice();
    }
}
