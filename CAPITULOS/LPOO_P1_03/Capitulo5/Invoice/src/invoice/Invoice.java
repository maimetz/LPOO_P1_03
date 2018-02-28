/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoice;
import java.util.Scanner;
/**
 *
 * @author metz_
 */
public class Invoice {
private Integer numfa;
private Integer saldo;
private Integer dia;
private Integer mes;
private Integer anio;
private static Scanner sc=new Scanner(System.in);

public void setNumfa(Integer numfa){
    this.numfa=numfa;
}
public Integer getNumfa(){
    return numfa;
}

public void setSaldo(Integer saldo){
    this.saldo=saldo;
}
public Integer getSaldo(){
    return saldo;
}

public void setDia(Integer dia){
    this.dia=dia;
}
public Integer getDia(){
    return dia;
}

public void setMes(Integer mes){
    this.mes=mes;
}
public Integer getMes(){
    return mes;
}

public void setAnio(Integer anio){
    this.anio=anio;
}
public Integer getAnio(){
    return anio;
}

public void restric(){
    int numfa,saldo,dia,mes,anio;
    System.out.print("Introduzca numero de factura ");
    numfa=sc.nextInt();
    System.out.print("Introduzca saldo ");
    saldo=sc.nextInt();
    System.out.print("Introduzca dia ");
    dia=sc.nextInt();
    System.out.print("Introduzca mes ");
    mes=sc.nextInt();
    System.out.print("Introduzca anio ");
    anio=sc.nextInt();
    
    setSaldo(saldo);
    
    if(numfa<1000){
        setNumfa(0);}
        else{
                setNumfa(numfa);
                }
    if (mes<1 || mes>12){
        setMes(0);
    }else{
        setMes(mes);
    }
    
    if(dia<1 || dia>31){
        setDia(0);
    }else{
        setDia(dia);
    }
    
    if(anio<2011 || anio>2017){
        setAnio(0);
    }else{
        setAnio(anio);
    }
}
public void imprimir() {
    System.out.println("numero de factura: "+ getNumfa());
    System.out.println("Saldo: "+ getSaldo());
    System.out.println("Dia: "+ getDia());
    System.out.println("Mes: "+ getMes());
    System.out.println("Anio: "+ getAnio());
    }
}