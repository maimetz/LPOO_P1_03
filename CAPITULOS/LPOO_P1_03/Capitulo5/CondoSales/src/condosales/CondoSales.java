/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condosales;
import java.util.Scanner;
/**
 *
 * @author metz_
 */
public class CondoSales {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc=new Scanner(System.in);
    int opc;
    System.out.print("Escoja una opcion: ");
    System.out.print("Opcion: ");
    opc=sc.nextInt();
    switch(opc){
        case 1:
            System.out.print("Condominio con vista al parque:  $150,000\n");
            break;
        case 2:
            System.out.print("Condominio con vista al campo de golf: $170,000\n");
            break;
        case 3:
            System.out.print("Condominio con vista al lago: $210,000\n");
            break;
        default:
            System.out.print("Precio: 0\n");
            break;
        }
    }
}
