/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author crist
 */
public class CuentaDebito extends CuentaBancaria {

    private float interes;

    public CuentaDebito(float interes, double saldo, boolean activa) {
        super(saldo, activa);
        this.interes = interes;
    }

    public float getInteres() {
        return interes;
    }

    public void setInteres(float interes) {
        this.interes = interes;
    }

    public boolean retiro(int monto) {
        return false;
    }

    public boolean pago(float monto) {
        return false;
    }

    @Override
    public String toString() {
        return "CuentaDebito{" + "interes=" + interes + '}';
    }

}
