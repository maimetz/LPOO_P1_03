/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package population;
/**
 *
 * @author metz_
 */
public class Population {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a,b;
        int i=0;
        double contmex=114000000;
        double conteu=312000000;
        a=114000000*0.0101;
        b=312000000*0.0015;
        do{
           i++;
           contmex+=a;
           conteu-=b;
           System.out.printf("Año: %d\t%.2f\t%.2f\n",i,contmex,conteu);
        } while (contmex<conteu);
    }
}
