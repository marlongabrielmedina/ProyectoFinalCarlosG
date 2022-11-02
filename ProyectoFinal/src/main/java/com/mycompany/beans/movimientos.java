package com.mycompany.beans;

/**
 *
 * @author Carlos_G
 */
public class movimientos {
        private String fecha;
        private double monto;
        private String cuenta_Origen;
        private String cuenta_Destino;
        
    public movimientos() {
    }

    public movimientos(String fecha, double monto,  String cuenta_Origen, String cuenta_Destino) {
        this.fecha = fecha;
        this.monto = monto;
        this.cuenta_Origen = cuenta_Origen;
        this.cuenta_Destino = cuenta_Destino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getCuenta_Origen() {
        return cuenta_Origen;
    }

    public void setCuenta_Origen(String cuenta_Origen) {
        this.cuenta_Origen = cuenta_Origen;
    }

    public String getCuenta_Destino() {
        return cuenta_Destino;
    }

    public void setCuenta_Destino(String cuenta_Destino) {
        this.cuenta_Destino = cuenta_Destino;
    }

           
}
