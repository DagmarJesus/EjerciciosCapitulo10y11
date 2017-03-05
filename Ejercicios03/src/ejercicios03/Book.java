
package ejercicios03;

public abstract class Book{
    private String title;
    private Double price;
    public String gettitle(){
        return title;
    }
    public void setprice(Double precio){
        price= precio;
    }
    public Double getprice(){
        return price;
    }
    public Book(String title){
        this.title=title;
    }
    
    public abstract void setPrice();
    }