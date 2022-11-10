package by.bsuir.secondLab.beans;

public class Kettle extends Product{
    @Override
    public String toString()
    {
        String result="Чайник'";
        result+=this.title;
        result+="' по цене ";
        result+=this.price;
        return result;
    }
}
