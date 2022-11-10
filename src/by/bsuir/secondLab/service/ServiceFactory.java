package by.bsuir.secondLab.service;

import by.bsuir.secondLab.dao.SearchDAO;
import by.bsuir.secondLab.service.impl.SearchServiceImpl;

public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();
    private final SearchService searchService = new SearchServiceImpl();
    private ServiceFactory(){}
    public static ServiceFactory getInstance(){
        return instance;
    }
    public SearchService getCLientService() {
        return searchService;
    }
}
