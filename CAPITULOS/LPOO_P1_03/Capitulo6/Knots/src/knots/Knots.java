/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knots;
/**
 *
 * @author metz_
 */
public class Knots {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double km,mxh;
        System.out.println("Kilometros por hora\n\n");
        for(int i=15;i<31;i++){
            km=(float)i*1.852;
            System.out.printf("%d\t%.2f\n",i,km);
        }
        System.out.print("\n\nMillas por hora\n\n");
        for(int i=15;i<31;i++){
            mxh=(float)i*1.151;
            System.out.printf("%d\t%.2f\n",i,mxh);
        }
        // TODO code application logic here
    }
}
