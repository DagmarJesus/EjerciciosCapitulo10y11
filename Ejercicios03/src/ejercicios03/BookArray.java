/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios03;
import java.util.Scanner;
public class BookArray {
    public static void main(String[]args){
        Book[] libro=new Book[10];
        Scanner teclado=new Scanner(System.in);
        libro[0]=new Fiction("Pinocho");
        libro[1]=new NonFiction("La iliada");
        libro[2]=new Fiction("Paco el chato");
        libro[3]=new NonFiction("El proceso");
        libro[4]=new Fiction("Harry Potter");
        libro[5]=new NonFiction("Filosofia de Platon");
        libro[6]=new Fiction("Pepe Pecas");
        libro[7]=new NonFiction("La teoria del Todo");
        libro[8]=new Fiction("Sinsajo");
        libro[9]=new NonFiction("Karl max");
        for (int k = 0; k <libro.length ; k++) {
            System.out.println("Título: "+libro[k].gettitle()+" $"+libro[k].getprice());
        }
    }
}