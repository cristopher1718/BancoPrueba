/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author crist
 */
public class Usuario {
    protected String nombre;
    protected String apellido1;
    protected String apellido2;
    protected String numeroCedula;
    protected String correoElectronico;

    public Usuario(String nombre, String apellido1, String apellido2, String numeroCedula, String correoElectronico) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.numeroCedula = numeroCedula;
        this.correoElectronico = correoElectronico;
    }
    
    public Usuario() {
        this.nombre = "";
        this.apellido1 = "";
        this.apellido2 = "";
        this.numeroCedula = "";
        this.correoElectronico = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNumeroCedula() {
        return numeroCedula;
    }

    public void setNumeroCedula(String numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", numeroCedula=" + numeroCedula + ", correoElectronico=" + correoElectronico;
    }
    
}