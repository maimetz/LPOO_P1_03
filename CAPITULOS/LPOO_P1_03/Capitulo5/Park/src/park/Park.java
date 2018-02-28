/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package park;
import java.util.Scanner;
/**
 *
 * @author metz_
 */
public class Park {
    private String parque;
    private Integer acres;
    private Boolean picnic;
    private Boolean tenis;
    private Boolean pain;
    private Boolean pisc;
    private static Scanner sc=new Scanner(System.in);
    
    public void setParque(String parque){
        this.parque=parque;
    }
    
    public String getParque(){
        return parque;
    }
    
    public void setAcres(Integer acres){
        this.acres=acres;
    }
    public Integer getAcres(){
        return acres;
    }
    
    public void setPicnic(Boolean picnic){
        this.picnic=picnic;
    }
   public Boolean getPicnic(){
       return picnic;
   }
    
   public void setTenis(Boolean tenis){
        this.tenis=tenis;
    }
   public Boolean getTenis(){
       return tenis;
   }
    public void setPain(Boolean pain){
        this.pain=pain;
    }
   public Boolean getPain(){
       return pain;
   }
   public void setPisc(Boolean pisc){
        this.pisc=pisc;
    }
   public Boolean getPisc(){
       return pisc;
   }
   
   public Integer sacarAcres(){
       int num;
       System.out.print("Intoduzca numero de Acres ");
       do{
    num=sc.nextInt();
       }while(num>400 || num < 0);
       return num;
   }
   public void priMet(String parque){
       setParque(parque);
       System.out.print("Tiene para\n1.-pinic\n2.-parque infantil? ");
       int o;
       o= sc.nextInt();
       switch(o){
           case 1:
               setPicnic(true);
               setPain(false);
           break;
           case 2:
               setPicnic(false);
               setPain(true);       
       }
       if(getPicnic()==true){
           System.out.print("Tiene para picnic\n");
       }else
           if(getPain()==true){
               System.out.print("Tiene para parque infantil\n");
           }
   }
}
