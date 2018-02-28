/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scholarship;
import java.util.Scanner;
/**
 *
 * @author metz_
 */
public class ScholarShip {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      double prom;
      int actex,actser;
      System.out.print("Ingrese promedio ");
      prom=sc.nextDouble();
      System.out.print("Ingrese numero se actividades extracurriculares ");
      actex=sc.nextInt();
      System.out.print("Ingrese numero se actividades de servicios del alumno ");
      actser=sc.nextInt();
      if(prom>=3.8 && actex>=1 && actser==1){
          System.out.print("Becario candidato\n");
      }else
          if(prom<3.8 && prom>=3.4 && actex>=3 && actser>=3){
              System.out.print("Becario candidato\n");
        } else
              if(prom<3.4 && prom>=3.0 && actex>=2 && actser==3){
                 System.out.print("Becario candidato\n"); 
         } else
         System.out.print("No es candidato\n");
    }
}