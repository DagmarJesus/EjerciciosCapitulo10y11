package ejercicios03;
public  class NonFiction extends Book {
   
    public NonFiction(String title){
        super(title);
        setPrice();
    }
    
    public void setPrice(){
        super.setprice(37.99);
    }
    
}