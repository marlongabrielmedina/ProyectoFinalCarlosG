package com.mycompany.proyectofinal;

import com.mycompany.forms.main;

/**
 *
 * @author Carlos_G
 */
public class ProyectoFinal {

    public static String whereami;
    public static String whereibeen;
    public static String Opcpressed;

    public static void setOpcpressed(String Opcpressed) {
        ProyectoFinal.Opcpressed = Opcpressed;
    }

    public static String getOpcpressed() {
        return Opcpressed;
    }

    public static void setWhereibeen(String whereibeen) {
        ProyectoFinal.whereibeen = whereibeen;
    }

    public static String getWhereibeen() {
        return whereibeen;
    }

    public static void setWhereami(String whereami) {
        ProyectoFinal.whereami = whereami;
    }

    public static String getWhereami() {
        return whereami;
    }

    public static void main(String[] args) {
        System.out.println("Inicio de Proyecto Final");
        main.main(args);
    }
    

}
