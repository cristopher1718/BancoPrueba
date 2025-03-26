/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Usuario;
import modelo.administrador;
import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class vistaAdmin {

    private String usuario;
    private String clave;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String numeroCedula;
    private String correoElectronico;

    public void registrar_admin() {
        usuario = JOptionPane.showInputDialog("Ingrese el usuario del admin");
        clave = JOptionPane.showInputDialog("Ingrese la clave del admin");
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del admin");
        apellido1 = JOptionPane.showInputDialog("Ingrese el primer apellido del admin");
        apellido2 = JOptionPane.showInputDialog("Ingrese el segundo apellido del admin");
        numeroCedula = JOptionPane.showInputDialog("Ingrese el numero de cedula del admin");
        correoElectronico = JOptionPane.showInputDialog("Ingrese el correo electronico del admin");
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

    public void mostrarAdmin(administrador admin) {
        JOptionPane.showMessageDialog(null, admin.toString());
    }
}
