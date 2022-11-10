package by.bsuir.secondLab.beans;

public class Oven extends Product{
    @Override
    public String toString()
    {
        String result="Духовка '";
        result+=this.title;
        result+="' по цене ";
        result+=this.price;
        return result;
    }
}
