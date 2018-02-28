/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perfect;
/**
 *
 * @author metz_
 */
public class Perfect {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float cont1;
        int cont;
        for (int i=1;i<1000;i++){
            cont=0;
            for (int j=i-1;j>=1;j--){
                 cont1=((float)i/(float)j);
                  //System.out.printf("%d\t%d\n",i,j);
                 if(cont1%1==0){
                     cont=cont+j;
                 }
            }
            if(cont==i){
            System.out.printf("%d\t%d\n",i,cont);
            }
        }
    }
}
