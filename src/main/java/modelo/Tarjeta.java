/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author crist
 */
public class Tarjeta {
    
    private String nombreBeneficiario;
    private String numeroTarjeta;
    private tipoTarjeta tipo;

    public Tarjeta(String nombreBeneficiario, String numeroTarjeta, tipoTarjeta tipo) {
        this.nombreBeneficiario = nombreBeneficiario;
        this.numeroTarjeta = numeroTarjeta;
        this.tipo = tipo;
    }
    
    public Tarjeta() {
        this.nombreBeneficiario = "";
        this.numeroTarjeta = "";
        this.tipo = null;
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

    @Override
    public String toString() {
        return "Tarjeta{" + "nombreBeneficiario=" + nombreBeneficiario + ", numeroTarjeta=" + numeroTarjeta + ", tipo=" + tipo + '}';
    }
    
    
    
}