/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author crist
 */
public abstract class CuentaBancaria {
    
    protected double saldo;
    protected boolean activa;

    public CuentaBancaria(double saldo, boolean activa) {
        this.saldo = saldo;
        this.activa = activa;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }
    
    public abstract boolean retiro(int monto);
    public abstract boolean pago(float monto);
    public abstract String toString();
    
    
}