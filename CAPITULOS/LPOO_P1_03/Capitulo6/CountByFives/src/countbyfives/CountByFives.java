/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countbyfives;

/**
 *
 * @author metz_
 */
public class CountByFives {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=5;i<=200;){
            System.out.printf("%d  ",i);
            if(i%50==0 || i%100==0 || i%150==0  || i%200==0){
             System.out.print("\n\n");
            }
            i+=5;
        }
    }
}
