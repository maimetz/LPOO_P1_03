/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retirementgoal2;
import java.util.Scanner;
/**
 *
 * @author metz_
 */
public class RetirementGoal2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int a,b;
     float c,d,t;
    System.out.print("Ingrese cuantos años falta para su jubilación ");
    do{
    a=sc.nextInt();
    }while(a<=0);
    System.out.print("Ingrese el dinero que puede ahorrar al año ");
    b=sc.nextInt();
    
    c=  (float)(b*0.05);
     d=b+c;
    t=  (float) (d * a );
    System.out.printf("Usted tendrá un total de %.2f pesos ahorrados\n",t);
    }
}
