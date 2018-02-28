/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evenentryloop;
import java.util.Scanner;
/**
 *
 * @author metz_
 */
public class EvenEntryLoop {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduzca numero ");
        do{
         do{
         a=sc.nextInt();
         if(a%2==0){
             System.out.print("Buen trabajo\n");
         }else
             if(a==999){
                 System.out.print("Saliendo...");
             }else
         if(a%2!=0){
             System.out.print("Error, ingrese otra vez la cifra \n");
         }
         }while(a==2);
        }while(a!=999);
    }
}