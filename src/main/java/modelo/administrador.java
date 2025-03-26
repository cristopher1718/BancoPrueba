/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author crist
 */
public class administrador extends Usuario {

    private String usuario;
    private String clave;

    public administrador(String usuario, String clave, String nombre, String apellido1, String apellido2, String numeroCedula, String correoElectronico) {
        super(nombre, apellido1, apellido2, numeroCedula, correoElectronico);
        this.usuario = usuario;
        this.clave = clave;
    }
    
    public administrador(String usuario, String clave) {
        super("", "", "", "", "");
        this.usuario = "";
        this.clave = "";
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

    @Override
    public String toString() {
        return "administrador{" + "usuario=" + usuario + ", clave=" + clave + "\n" + super.toString();
    }
    
    
    
}
