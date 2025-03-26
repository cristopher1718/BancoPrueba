/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import javax.swing.JOptionPane;
import modelo.Tarjeta;
import modelo.tipoTarjeta;

/**
 *
 * @author crist
 */
public class vistaTarjeta {
    
    private String nombreBeneficiario;
    private String numeroTarjeta;
    private tipoTarjeta tipo;

    public vistaTarjeta(String nombreBeneficiario, String numeroTarjeta, tipoTarjeta tipo) {
        this.nombreBeneficiario = nombreBeneficiario;
        this.numeroTarjeta = numeroTarjeta;
        this.tipo = tipo;
    }

    public String getNombreBeneficiario() {
        return nombreBeneficiario;
    }

    public void setNombreBeneficiario(String nombreBeneficiario) {
        this.nombreBeneficiario = nombreBeneficiario;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public tipoTarjeta getTipo() {
        return tipo;
    }

    public void setTipo(tipoTarjeta tipo) {
        this.tipo = tipo;
    }

    public vistaTarjeta() {
    }
    
    public void mostrarTarjeta(Tarjeta tarjeta){
        JOptionPane.showMessageDialog(null, tarjeta.toString());
    }
}
