package by.bsuir.secondLab.dao;

import by.bsuir.secondLab.dao.impl.SearchDAOFile;

public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();
    private final SearchDAO fileSearchImpl = new SearchDAOFile();
    private DAOFactory(){}
    public static DAOFactory getInstance(){
        return instance;
    }
    public SearchDAO getSearchDAO(){
        return fileSearchImpl;
    }

}
