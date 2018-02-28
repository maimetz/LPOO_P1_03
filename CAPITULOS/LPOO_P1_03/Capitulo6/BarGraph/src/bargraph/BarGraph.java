/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bargraph;
import java.util.Scanner;
/**
 *
 * @author metz_
 */
public class BarGraph {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Carros vendidos por Pam: ");
        int pam=sc.nextInt();
        System.out.print("Carros vendidos por Leo: ");
        int leo=sc.nextInt();
        System.out.print("Carros vendidos por Kim: ");
        int kim=sc.nextInt();
        System.out.print("Carros vendidos por Bob: ");
        int bob=sc.nextInt();
        System.out.print("Pam\t");
        for(int i=0;i<pam;i++){
            System.out.print("X");
        }
        System.out.print("\nLeo\t");
        for(int i=0;i<leo;i++){
            System.out.print("X");
        }
        System.out.print("\nKim\t");
        for(int i=0;i<kim;i++){
            System.out.print("X");
        }
        System.out.print("\nBob\t");
        for(int i=0;i<bob;i++){
            System.out.print("X");
        }
        System.out.print("\n");
    }
}
