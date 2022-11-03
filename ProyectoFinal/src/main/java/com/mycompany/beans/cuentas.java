package com.mycompany.beans;


/**
 *
 * @author Carlos_G
 */
public class cuentas {
    private String noCuenta;
    private String moneda;
    private double saldo;
    private String tipo;
    private String apertura;
    private String DPI;
    
    public cuentas() {
    }

    public cuentas(String noCuenta, String moneda, double saldo, String tipo, String apertura, String DPI) {
        this.noCuenta = noCuenta;
        this.moneda = moneda;
        this.saldo = saldo;
        this.tipo = tipo;
        this.apertura = apertura;
        this.DPI = DPI;
    }

    public String getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(String noCuenta) {
        this.noCuenta = noCuenta;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getApertura() {
        return apertura;
    }

    public void setApertura(String apertura) {
        this.apertura = apertura;
    }

    public String getDPI() {
        return DPI;
    }

    public void setDPI(String DPI) {
        this.DPI = DPI;
    }

}
