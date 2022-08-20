package clases;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args)  {

        try{
            ClaseHija hija= new ClaseHija();
            ClasePadre padre = new ClasePadre();
            Scanner sc= new Scanner(System.in);
            System.out.println("Ingrese un texto: ");
            String nombre= sc.nextLine();
            hija.setMensaje(nombre);
            System.out.println("Sin Excepciones");
        }
        catch (InputMismatchException e){
            JOptionPane.showMessageDialog(null,"Se ha producido una excepcion!");
        }


    }
}
