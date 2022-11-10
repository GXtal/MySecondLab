package by.bsuir.secondLab.beans;

public class Fridge extends Product{
    @Override
    public String toString()
    {
        String result="Холодильник по цене ";
        result+=this.price;
        return "";
    }
}
