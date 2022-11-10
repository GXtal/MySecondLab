package by.bsuir.secondLab.main;

import by.bsuir.secondLab.beans.Beans;
import by.bsuir.secondLab.beans.Product;
import by.bsuir.secondLab.controller.Controller;
import by.bsuir.secondLab.dao.SearchDAO;
import by.bsuir.secondLab.dao.impl.SearchDAOFile;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;

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
        System.out.println("sjbuguhuethqgggggggggggggggggggggg");
        myC.executeTask("FIND_MIN_PRICE");
        showContent();

    }
}