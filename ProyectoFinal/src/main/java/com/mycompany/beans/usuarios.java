package com.mycompany.beans;

/**
 *
 * @author Carlos_G
 */
public class usuarios {
    private String DPI;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String direccion;
    
    public usuarios() {
    }

    public usuarios(String DPI, String nombres, String apellidos, String telefono) {
        this.DPI = DPI;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }

    public String getDPI() {
        return DPI;
    }

    public void setDPI(String DPI) {
        this.DPI = DPI;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
