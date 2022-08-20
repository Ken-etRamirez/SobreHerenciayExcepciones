package clases;

import javax.swing.*;
import java.util.InputMismatchException;

public class ClasePadre {
    private String mensaje;

    public ClasePadre(String mensaje) throws InputMismatchException {
        this.mensaje = mensaje;
        JOptionPane.showMessageDialog(null,"Hay una Excepcion!");
    }

    public ClasePadre() {
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
