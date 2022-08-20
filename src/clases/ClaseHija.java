package clases;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ClaseHija extends  ClasePadre{
    private String nombre;
    ClasePadre padre;

    public ClaseHija() {
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
        if(validarLetras(nombre)==false){
            padre=new ClasePadre(nombre);
        }
    }

    public ClaseHija(String mensaje, String nombre) throws InputMismatchException {
        super(mensaje);
        this.nombre = nombre;
    }

    public static boolean validarLetras(String nombre){
        return nombre.matches("[a-z]");
    }
}
