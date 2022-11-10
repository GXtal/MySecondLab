package by.bsuir.secondLab.main;

import by.bsuir.secondLab.beans.Beans;
import by.bsuir.secondLab.beans.Product;
import by.bsuir.secondLab.controller.Controller;

public class Main {
    public  static  void showContent()
    {
        for(int i=0;i<Beans.content.size();i++)
        {
            String toShow=Beans.content.get(i).toString();
            System.out.println(toShow);
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Controller myC= new Controller();
        myC.executeTask("FIND_TYPE");
        showContent();
    }
}