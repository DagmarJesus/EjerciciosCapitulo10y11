package ejercicios03;
public  class Fiction extends Book {
    
    
    public Fiction(String title){
        super(title);
        setPrice();
    }
    
    public void setPrice(){
        super.setprice(24.99);
    }
}