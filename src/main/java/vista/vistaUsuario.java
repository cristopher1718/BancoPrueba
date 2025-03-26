/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author crist
 */
public class vistaUsuario {

    // Atributos generales
    private String nombre;
    private String apellido1;
    private String apeillido2;
    private String numeroCedula;
    private String correoElectronico;
    //En caso de admin
    private String usuario;
    private String clave;
    //En caso de cliente
    private char sexo;
    private String profesion;
    private String direccion;

    //Constructor vista para admin
    public vistaUsuario(String nombre, String apellido1, String apeillido2, String numeroCedula, String correoElectronico, String usuario, String clave) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apeillido2 = apeillido2;
        this.numeroCedula = numeroCedula;
        this.correoElectronico = correoElectronico;
        this.usuario = usuario;
        this.clave = clave;
        this.sexo = '\0';
        this.profesion = "";
        this.direccion = "";
    }

    // Constructor vista para cliente
    public vistaUsuario(String nombre, String apellido1, String apeillido2, String numeroCedula, String correoElectronico, char sexo, String profesion, String direccion) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apeillido2 = apeillido2;
        this.numeroCedula = numeroCedula;
        this.correoElectronico = correoElectronico;
        this.usuario = "";
        this.clave = "";
        this.sexo = sexo;
        this.profesion = profesion;
        this.direccion = direccion;
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

    public String getApeillido2() {
        return apeillido2;
    }

    public void setApeillido2(String apeillido2) {
        this.apeillido2 = apeillido2;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void mostrarUsuario(Usuario user) {
        JOptionPane.showMessageDialog(null, user.toString());
    }
}
