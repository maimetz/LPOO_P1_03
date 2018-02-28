/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitalcamerajava;

/**
 *
 * @author metz_
 */
public class DigitalCameraJava {
private String marca;
private Integer resolucion;
private Integer precio;

public void establecerMarca(String marca){
    this.marca=marca;
}
public String marca(){
    return marca;
}
public void establecerMP(Integer resolucion){
    if(resolucion>10){
        this.resolucion=10;
    }else
        this.resolucion=resolucion;
}

public Integer res() {
    return resolucion;
}

public void precio() {
    if(resolucion<=6){
        precio=99;
    }else{
        precio=129;
    }
    System.out.printf("El precio de la camara %s es de %d\n\n", marca,precio);
    }
}
