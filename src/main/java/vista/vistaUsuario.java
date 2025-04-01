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
    private String apellido2;
    private String numeroCedula;
    private String correoElectronico;
    //En caso de admin
    private String usuario;
    private String clave;
    //En caso de cliente
    private char sexo;
    private String profesion;
    private String direccion;

    /*Constructor vista para admin
    Solciita valores para generar un administrado
    Atributos
    String nombre, String apellido1, String apeillido2, String numeroCedula, String correoElectronico, String usuario, String clave
     */
    public void registrarAdmin() {
        this.usuario = JOptionPane.showInputDialog("Ingrese el usuario del admin");
        this.clave = JOptionPane.showInputDialog("Ingrese la clave del admin");
        this.nombre = JOptionPane.showInputDialog("Ingrese el nombre del admin");
        this.apellido1 = JOptionPane.showInputDialog("Ingrese el primer apellido del admin");
        this.apellido2 = JOptionPane.showInputDialog("Ingrese el segundo apellido del admin");
        this.numeroCedula = JOptionPane.showInputDialog("Ingrese el numero de cedula del admin");
        this.correoElectronico = JOptionPane.showInputDialog("Ingrese el correo electronico del admin");
    }

    /*Constructor vista para cliente
    Solciita valores para generar un cliente
    Atributos
    String nombre, String apellido1, String apeillido2, String numeroCedula, String correoElectronico, char sexo, String profesion, String direccion
     */
    public void registrarCliente() {

        String[] options = {"F", "M", "N"};

        this.usuario = "";
        this.clave = "";
        this.nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente");
        this.apellido1 = JOptionPane.showInputDialog("Ingrese el primer apellido del cliente");
        this.apellido2 = JOptionPane.showInputDialog("Ingrese el segundo apellido del cliente");
        this.numeroCedula = JOptionPane.showInputDialog("Ingrese el numero de cedula del cliente");
        this.correoElectronico = JOptionPane.showInputDialog("Ingrese el correo electronico del cliente");
        int genero = JOptionPane.showOptionDialog(null, "Eliga su genero", "Generos", 0, 1, null, options, null);
        switch (genero) {
            case 0:
                this.sexo = 'F';
                break;
            case 1:
                this.sexo = 'M';
                break;
            case 2:
                this.sexo = 'N';
                break;
            default:
                this.sexo = 'N';
        }

        this.profesion = JOptionPane.showInputDialog("Ingrese la profesion del cliente");
        this.direccion = JOptionPane.showInputDialog("Ingrese la direccion del cliente");

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

    public void setApellido2(String apeillido2) {
        this.apellido2 = apeillido2;
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
