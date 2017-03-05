package ejercicios03;
  public class UseBook {
    public static void main(String[]args){
        Fiction L1=new Fiction("Juegos del Hambre");
        NonFiction L2=new NonFiction("The Judge");
        
        System.out.println("Title: "+L1.gettitle()+"\n"+L1.getprice());
        System.out.println("Title: "+L2.gettitle()+"\n"+L2.getprice());
    }
}
