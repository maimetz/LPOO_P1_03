/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inspections;
/**
 *
 * @author metz_
 */
public class Inspections {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b = 0,c = 0,d = 0,e = 0;
        int cont=0,cont1=0,cont2=0,cont3=0;
        float e1 = 0,e2=0,e3=0,e4=0;
        for(int i=0;i<52;i++){
           a=1+(int)(Math.random()*4) ;
           System.out.printf("%d\t%d\n",i,a);
            switch (a) {
                case 1:
                    b=a;
                    cont+=1;
                    e1=((float)cont*100)/52;
                    break;
                case 2:
                    c=a;
                    cont1+=1;
                    e2=((float)cont1*100)/52;
                    break;
                case 3:
                    d=a;
                    cont2+=1;
                    e3=((float)cont2*100)/52;
                    break;
                case 4:
                    e=a;
                    cont3+=1;   
                    e4=((float)cont3*100)/52;
                    break;
            }
        }
        System.out.printf("\n\n%d\t%d\t%.2f\n", b,cont,e1);
        System.out.printf("%d\t%d\t%.2f\n", c,cont1,e2);
        System.out.printf("%d\t%d\t%.2f\n", d,cont2,e3);
        System.out.printf("%d\t%d\t%.2f\n", e,cont3,e4);
    }
}
