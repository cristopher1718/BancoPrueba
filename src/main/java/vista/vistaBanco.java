/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Banco;
import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class vistaBanco {

    private String nombre;
    private String telefono;
    private String direccion;

    public void creaBanco() {
        this.nombre = JOptionPane.showInputDialog("Ingrese el nombre del banco");
        this.telefono = JOptionPane.showInputDialog("Ingrese el telefono del banco");
        this.direccion = JOptionPane.showInputDialog("Ingrese la direccion del banco");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "vistaBanco{" + "nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + '}';
    }
    
    public void mostrarBanco(Banco banco){
        JOptionPane.showMessageDialog(null, banco.toString());
    }
    
}
