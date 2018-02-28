/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evenodd;
import java.util.Scanner;
/**
 *
 * @author metz_
 */
public class EvenOdd {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.println("Número: ");
        int a=sc.nextInt();
        if (a%2==0) {
            System.out.print("Es par\n");
        } else
        System.out.print("Es impar\n");
    }
}
