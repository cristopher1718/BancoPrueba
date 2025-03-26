/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import javax.swing.JOptionPane;
import modelo.CuentaBancaria;

/**
 *
 * @author crist
 */
public class vistaCuenta {
    
    private double saldo;
    private boolean activa;
    private float interes_cashBack;

    public vistaCuenta(double saldo, boolean activa, float interes_cashBack) {
        this.saldo = saldo;
        this.activa = activa;
        this.interes_cashBack = interes_cashBack;
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

    public float getInteres_cashBack() {
        return interes_cashBack;
    }

    public void setInteres_cashBack(float interes_cashBack) {
        this.interes_cashBack = interes_cashBack;
    }
    
    public void mostrarCuenta(CuentaBancaria cuenta){
        
        JOptionPane.showMessageDialog(null, cuenta.toString());
        
    }
}
