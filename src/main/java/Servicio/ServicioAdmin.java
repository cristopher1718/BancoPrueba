/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.CallableStatement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Collection;
import modelo.administrador;
//import oracle.jdbc.driver.OracleTypes;

/**
 *
 * @author crist
 */
public class ServicioAdmin extends Servicio {

    private static final String MOSTRAR = "{?=call mostrarAdmin()}";
    private static final String BUSCARID = "{?=call buscarAdmin(?)}";

    private static final String insertarAdmin = "{call insertarAdmin (?,?,?,?,?,?,?,?,?)}";
    private static final String modificarAdmin = "{call modificarAdmin (?,?,?,?,?,?,?,?,?)}";
    private static final String eliminarAdmin = "{call eliminarAdmin(?)}";

    public administrador mostrarAdmin() {

        try {
            conectar();
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        ResultSet rs = null;
        administrador admin = null;
        CallableStatement pstmt = null;

        try {
            pstmt = conexion.prepareCall(MOSTRAR);
            //pstmt.registerOutParameter(1, OracleTypes.CURSOR);
            pstmt.execute();
            rs = (ResultSet) pstmt.getObject(1);
        } catch (Exception e) {
        } finally {
        }

        return null;
    }

}
