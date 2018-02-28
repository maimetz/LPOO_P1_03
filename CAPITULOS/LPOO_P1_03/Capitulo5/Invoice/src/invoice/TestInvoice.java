/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoice;
import java.util.Scanner;
/**
 *
 * @author metz_
 */
public class TestInvoice {
     public static void main(String[] args){
         int a;
         Scanner sc=new Scanner(System.in);
         Invoice i=new Invoice();
         a=sc.nextInt();
         for(int n=0;n<a;n++){
         i.restric();
         i.imprimir();
         }
     }
}