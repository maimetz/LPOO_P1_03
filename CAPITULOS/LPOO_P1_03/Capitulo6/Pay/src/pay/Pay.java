/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pay;
import java.util.Scanner;
/**
 *
 * @author metz_
 */
public class Pay {
private static Integer hor;
private static double pag;
private static Integer opc;
private static Scanner sc=new Scanner(System.in);

public void setHor( Integer hor){
    Pay.hor=hor;
}
public Integer getHor(){
    return hor;
}
public static void IngresarHora(){ 
   System.out.println("Ingrese horas trabajadas ");
    hor=sc.nextInt();
}
public static void menuStatus(){
    System.out.print("Nivel de habilidad\tTasa de pago por hora\n1.-\t\t\t17\n2.-\t\t\t20\n3.-\t\t\t22\n");
    System.out.print("Ingrese Opción ");
    opc=sc.nextInt();
    switch(opc){
        case 1:
    System.out.println(pago1());
            break;
        case 2:
            break;
        case 3:
            break;
    }
}
public static Double pago1(){
    double pg;
    if(hor<=40){
            pag=17*hor;
        
            }else
        if(hor>40){
            pag=hor*(17+((float)17/2));           
        }
   /* case 1:
            if(hor<=40){
            pag=17*hor;
        
            }else
        if(hor>40){
            pag=hor*(17+((float)17/2));           
        }
            System.out.println(pag);
            break;
            
        case 2:
             if(hor<=40){
            pag=20*hor;
        
            }else
        if(hor>40){
            pag=hor*(20+(10));           
        }
             System.out.println(pag);
            break;
            
        case 3:
            if(hor<=40){
            pag=22*hor;
        
            }else
        if(hor>40){
            pag=hor*(22+(11));           
        }
             System.out.println(pag);
            break;
    }*/
            
        //System.out.println(pag);
        
    return pag;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        IngresarHora();
        menuStatus();
    }
}
