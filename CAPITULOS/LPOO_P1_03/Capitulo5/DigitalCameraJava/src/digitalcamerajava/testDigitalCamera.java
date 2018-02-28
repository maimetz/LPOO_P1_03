/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitalcamerajava;
import java.util.Scanner;
/**
 *
 * @author metz_
 */
public class testDigitalCamera {
    public static void main(String[] args){
        String ca;
        int re;
        Scanner sc=new Scanner(System.in);
        DigitalCameraJava dc= new DigitalCameraJava();
        for(int i=0;i<4;i++){
        System.out.print("Escriba la marca de la camara ");
        ca=sc.next();
        dc.establecerMarca(ca);
        System.out.print("Inserte resolucion de la camara ");
        re=sc.nextInt();
        dc.establecerMP(re);
        dc.precio();
        }
    }
}
