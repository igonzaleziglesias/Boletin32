/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin32;

import java.util.ArrayList;

/**
 *
 * @author cromerofajar
 */
public class Boletin32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Alumno>alumnos=new ArrayList<>();
        Alumno obx=new Alumno();
        obx.setNota(4);
        obx.setNombre("Pepe");
        Alumno.Enderezo direccion=obx.new Enderezo("calle",4);
        obx.setEnderezo(direccion);
        System.out.println(obx.toString());
        alumnos.add(obx);
        obx.cambiarNota("Pepe", alumnos);
        System.out.println(obx.toString());
    }
    
}
