package boletin32;

import java.util.ArrayList;

public class Boletin32 {

    public static void main(String[] args) {
        ArrayList<Alumno> alum = new ArrayList<>();
        Alumno datos = new Alumno();
        datos.setNota(7);
        datos.setNombre("Iago");
        Alumno.Enderezo direccion = datos.new Enderezo("Reiseñor", 8);
        datos.setEnderezo(direccion);
        System.out.println(datos.toString());
        alum.add(datos);
        datos.cambiarNota("Iago", alum);
        System.out.println(datos.toString());
        datos.cambiarNota("Carlos", alum);
        System.out.println(datos.toString());
    }

}
