/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.ArrayList;
/**
 *
 * @author crist
 */
public class cliente extends Usuario {
    
    private char sexo;
    private String profesion;
    private String direccion;
    private ArrayList<CuentaBancaria> cuentas;
    private ArrayList<Tarjeta> tarjetas;

    public cliente(char sexo, String profesion, String direccion, String nombre, String apellido1, String apellido2, String numeroCedula, String correoElectronico) {
        super(nombre, apellido1, apellido2, numeroCedula, correoElectronico);
        this.sexo = sexo;
        this.profesion = profesion;
        this.direccion = direccion;
        this.cuentas = new ArrayList<CuentaBancaria>();
        this.tarjetas = new ArrayList<Tarjeta>();
    }
    
    public cliente() {
        super("", "", "", "", "");
        this.sexo =  '\0';
        this.profesion = "";
        this.direccion = "";
        this.cuentas = new ArrayList<CuentaBancaria>();
        this.tarjetas = new ArrayList<Tarjeta>();
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

    public ArrayList<CuentaBancaria> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<CuentaBancaria> cuentas) {
        this.cuentas = cuentas;
    }

    public ArrayList<Tarjeta> getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(ArrayList<Tarjeta> tarjetas) {
        this.tarjetas = tarjetas;
    }

    @Override
    public String toString() {
        return "cliente{" + "sexo=" + sexo + ", profesion=" + profesion + ", direccion=" + direccion + ", cuentas=" + cuentas + ", tarjetas=" + tarjetas + "\n" + super.toString();
    }
    
    
    
}