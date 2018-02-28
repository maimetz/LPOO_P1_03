/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twelvedays;
import java.util.Scanner;
/**
 *
 * @author metz_
 */
public class TwelveDays {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.printf("En el dia %d de navidad\n Mi verdadero amor me dio\n",a);
        switch(a){
            case 12:
            System.out.print("Doce bateristas tocando\n");
            case 11:
            System.out.print("Once flautistas tocando\n");
            case 10:
                System.out.print("Diez señores saltando\n");
            case 9:
            System.out.print("Nueve bailarinas\n");
            case 8:
                System.out.print("Ocho criadas ordeñando\n");
            case 7:
              System.out.print("Siete cisnes nadando\n");
            case 6:
                System.out.print("Seis gansos tendidos\n");
            case 5:
                System.out.print("Cinco anillos de oro\n" );
            case 4:
                System.out.print("Cuatro aves cantoras\n" );
            case 3:
                System.out.print("Tres gallinas francesas\n" );
            case 2:
                System.out.print("Dos tórtolas\n");
            case 1:
                System.out.print("Una perdiz en un peral\n");
        }
    }
}