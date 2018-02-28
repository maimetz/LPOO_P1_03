/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegecost;
import java.util.Scanner;
/**
 *
 * @author metz_
 */
public class CollegeCost {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float cont2=0;
        float cont=0;
        float anio,ani2;
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese la edad del niño ");
        int edad;
        do{
        edad=sc.nextInt();
        }while(edad>18);
        for (int i=0;i<edad;i++){
            cont+=0.05;
            anio=cont*20000;
            ani2=20000+anio;
            System.out.printf("%d\t%.2f\n",i+1,ani2);
            cont2=cont2+ani2;
        }
        System.out.printf("Gasto total: %.2f\n",cont2);
    }
}