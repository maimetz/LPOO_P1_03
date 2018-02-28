/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inbetween;
import java.util.Scanner;
/**
 *
 * @author metz_
 */
public class InBetween {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c =a;
        int b=sc.nextInt();
        if(a>b){
            a=b;
            b=c;
            
        }
         System.out.print("\n\n");
        for(int i=b-1;i>a;i--){
             System.out.println(i);
        }
    }
}
