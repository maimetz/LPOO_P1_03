/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retirementgoal;
import java.util.Scanner;
/**
 * @author metz_
 */
public class RetirementGoal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a,b,t;
    System.out.print("Ingrese cuantos años falta para su jubilación ");
    do{
    a=sc.nextInt();
    }while(a<=0);
    System.out.print("Ingrese el dinero que puede ahorrar al año ");
    b=sc.nextInt();
    t=a*b;
    System.out.printf("Usted tendrá un total de %d pesos ahorrados ",t);
// TODO code application logic here
    }
}