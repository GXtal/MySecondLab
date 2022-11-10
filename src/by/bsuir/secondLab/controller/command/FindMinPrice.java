package by.bsuir.secondLab.controller.command;

import by.bsuir.secondLab.service.SearchService;
import by.bsuir.secondLab.service.ServiceFactory;

public class FindMinPrice implements Command{
    @Override
    public String execute(String request) {

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        SearchService searchService = serviceFactory.getSearchServiceService();
        searchService.findMinPrice();


        return "Complete";
    }
}
