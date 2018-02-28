/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffe;
import java.util.Scanner;
/**
 *
 * @author metz_
 */
public class Coffe {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double cont=0;
        System.out.print ("Bienvenidos a a la Cafeteria..\n");
        System.out.print ("Menú:\n(1)Cafe Americano\t1.99\n(2)Cafe Espresso\t2.50\n(3)Cafe Latte\t2.15\n\n");
        int cafe;
        do {
        System.out.print ("Indique la opcion que desee: ");
        cafe=sc.nextInt();
        switch (cafe) {
            
            case 1:
                cont+=1.99;
                break;
            case 2:
                cont+=2.50;
                break;
            case 3:
                cont+=2.15;
                break; 
                
            }
        } while(cafe!=0);
        System.out.printf ( "\nTotal a pagar: %.2f " , cont);
        // TODO code application logic here
    }
}