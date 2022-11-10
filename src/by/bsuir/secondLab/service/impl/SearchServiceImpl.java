package by.bsuir.secondLab.service.impl;

import by.bsuir.secondLab.dao.DAOFactory;
import by.bsuir.secondLab.dao.SearchDAO;
import by.bsuir.secondLab.service.SearchService;

public class SearchServiceImpl implements SearchService {
    @Override
    public void searchType() {
        DAOFactory daoFactory = DAOFactory.getInstance();
        SearchDAO searchDAO = daoFactory.getSearchDAO();
        searchDAO.searchType();
    }

    @Override
    public void findMinPrice() {

    }
}
