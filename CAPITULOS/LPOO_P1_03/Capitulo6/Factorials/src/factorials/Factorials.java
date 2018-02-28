/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorials;
import java.util.Scanner;
/**
 *
 * @author metz_
 */
public class Factorials {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        cont=1;
        for(int i=1;i<a;i++){
           cont=cont*(i+1);
        }
        System.out.println(cont);
    }
}