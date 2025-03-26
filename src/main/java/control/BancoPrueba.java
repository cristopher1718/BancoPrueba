/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package control;

import vista.vistaAdmin;
import vista.vistaBanco;
import modelo.Banco;
import modelo.CuentaBancaria;
import modelo.Usuario;
import modelo.administrador;
import java.util.ArrayList;

/**
 *
 * @author crist
 */
public class BancoPrueba {

    public static void main(String[] args) {
        
        // Se crean las vistas para usar los metodos de mostrar info
        vistaBanco vistaBanco = new vistaBanco();
        
        vistaAdmin vistaAdmin = new vistaAdmin();
        
        // Se ejecuta el metodo para ingresar los datos del banco
        vistaBanco.crea_banco();
        
        // Se crea el banco
        Banco banco1 = new Banco(vistaBanco.getNombre(), vistaBanco.getTelefono(), vistaBanco.getDireccion(), new ArrayList<CuentaBancaria>(), new ArrayList<Usuario>());
        
        // Mostrar la info del banco creado
        vistaBanco.mostrarBanco(banco1);
        
        // Se ejecuta el metodo para ingresar los datos del admin
        
        vistaAdmin.registrar_admin();
        
        administrador admin1 = new administrador(vistaAdmin.getUsuario(), vistaAdmin.getClave(), vistaAdmin.getNombre(), vistaAdmin.getApellido1(), vistaAdmin.getApellido2(), vistaAdmin.getNumeroCedula(), vistaAdmin.getCorreoElectronico());
        
        vistaAdmin.mostrarAdmin(admin1);
    }
}
