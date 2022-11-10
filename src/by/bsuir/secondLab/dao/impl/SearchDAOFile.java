package by.bsuir.secondLab.dao.impl;

import by.bsuir.secondLab.beans.Fridge;
import by.bsuir.secondLab.beans.Kettle;
import by.bsuir.secondLab.beans.Oven;
import by.bsuir.secondLab.dao.SearchDAO;
import by.bsuir.secondLab.beans.Product;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;

public class SearchDAOFile implements SearchDAO {
    @Override
    public ArrayList<Product> findType() {
        try {
            ArrayList<Product> res= new ArrayList<Product>();
            // Создается построитель документа
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            // Создается дерево DOM документа из файла
            Document document = documentBuilder.parse("database.xml");

            // Получаем корневой элемент
            Node root = document.getDocumentElement();

            // Просматриваем все подэлементы корневого - т.е. продукты
            NodeList products = root.getChildNodes();
            for (int i = 0; i < products.getLength(); i++) {
                Node product = products.item(i);
                // Если нода не текст, то это товар - заходим внутрь
                if (product.getNodeType() != Node.TEXT_NODE) {
                    if(product.getNodeName()=="Kettle") {
                        res.add(parseElem(product));
                    }

                }
            }
            return res;
        } catch (ParserConfigurationException ex) {
            ex.printStackTrace(System.out);
        } catch (SAXException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }

        return null;
    }
    private Product parseElem(Node product) {
        Product res= null;
        switch (product.getNodeName())
        {
            case "Kettle":
                res = new Kettle();
                break;
            case "Oven":
                res = new Oven();
            case "Fridge":
                res = new Fridge();
        }
        if(res!=null)
        {
            NodeList prodProps = product.getChildNodes();
            for(int j = 0; j < prodProps.getLength(); j++) {
                Node prodProp = prodProps.item(j);
                // Если нода не текст, то это один из параметров
                if (prodProp.getNodeType() != Node.TEXT_NODE) {
                    switch (prodProp.getNodeName())
                    {
                        case "title":
                            res.title=prodProp.getChildNodes().item(0).getTextContent();
                            break;
                        case "price":
                            res.price=Integer.parseInt(prodProp.getChildNodes().item(0).getTextContent());
                            break;
                    }
                }
            }
            return res;
        }

        return null;
    }
    @Override
    public ArrayList<Product> findMinPrice() {
        try {
            ArrayList<Product> res= new ArrayList<Product>();
            // Создается построитель документа
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            // Создается дерево DOM документа из файла
            Document document = documentBuilder.parse("database.xml");

            // Получаем корневой элемент
            Node root = document.getDocumentElement();

            // Просматриваем все подэлементы корневого - т.е. продукты
            NodeList products = root.getChildNodes();
            for (int i = 0; i < products.getLength(); i++) {
                Node product = products.item(i);
                // Если нода не текст, то это товар - заходим внутрь
                if (product.getNodeType() != Node.TEXT_NODE) {
                    Product temp = parseElem(product);
                    if(res.size()==0)
                    {
                        res.add(temp);
                    }else if(res.get(0).price>temp.price)
                    {
                        res = new ArrayList<Product>();
                        res.add(temp);
                    } else if(res.get(0).price==temp.price)
                    {
                        res.add(temp);
                    }

                }
            }
            return res;
        } catch (ParserConfigurationException ex) {
            ex.printStackTrace(System.out);
        } catch (SAXException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }

        return null;
    }
}
