/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package control;

import vista.vistaBanco;
import modelo.Banco;
import modelo.CuentaBancaria;
import modelo.Usuario;
import modelo.administrador;
import java.util.ArrayList;
import modelo.cliente;
import vista.vistaUsuario;

/**
 *
 * @author crist
 */
public class BancoPrueba {

    public static void main(String[] args) {

        // Se crean las vistas para usar los metodos de mostrar info
        vistaBanco vistaBanco = new vistaBanco();

        vistaUsuario vistaGeneralUsuario = new vistaUsuario();

        // Se ejecuta el metodo para ingresar los datos del banco
        vistaBanco.creaBanco();

        // Se crea el banco
        Banco banco1 = new Banco(vistaBanco.getNombre(), vistaBanco.getTelefono(), vistaBanco.getDireccion(), new ArrayList<CuentaBancaria>(), new ArrayList<Usuario>());

        // Mostrar la info del banco creado
        vistaBanco.mostrarBanco(banco1);

        // Se ejecuta el metodo para ingresar los datos del admin
        vistaGeneralUsuario.registrarAdmin();

        administrador admin1 = new administrador(vistaGeneralUsuario.getUsuario(), vistaGeneralUsuario.getClave(), vistaGeneralUsuario.getNombre(),
                vistaGeneralUsuario.getApellido1(), vistaGeneralUsuario.getApellido2(), vistaGeneralUsuario.getNumeroCedula(), vistaGeneralUsuario.getCorreoElectronico());

        vistaGeneralUsuario.mostrarUsuario(admin1);

        vistaGeneralUsuario.registrarCliente();

        cliente cliente1 = new cliente(vistaGeneralUsuario.getSexo(), vistaGeneralUsuario.getProfesion(), vistaGeneralUsuario.getDireccion(), vistaGeneralUsuario.getNombre(),
                vistaGeneralUsuario.getApellido1(), vistaGeneralUsuario.getApellido2(), vistaGeneralUsuario.getNumeroCedula(), vistaGeneralUsuario.getCorreoElectronico());

        vistaGeneralUsuario.mostrarUsuario(cliente1);

    }
}
