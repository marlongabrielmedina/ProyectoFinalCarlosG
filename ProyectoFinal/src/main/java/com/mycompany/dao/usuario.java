package com.mycompany.dao;

import java.sql.*;

/**
 *
 * @author Carlos_G
 */
public class usuario {
    public static Connection        cn;
    public static PreparedStatement ps;
        
        public static synchronized int creaUsuario(String dpi, String nombres, String apellidos, String telefono, String direccion){
System.out.println("creaUsuario().Valida conexión");
        cn = null;
        ps = null;
        int rs = 0;
        
        try{
            cn=conexion.getAccesoBD();
            
            String insert = "INSERT INTO mydb.usuarios values ('"+dpi+"','"+nombres+"','"+apellidos+"','"+telefono+"','"+direccion+"')";
            
            ps = cn.prepareStatement(insert);
            
            rs = ps.executeUpdate();

        }catch(SQLException ex){
System.out.println("creaUsuario().Error en la conexión --- " + ex);
        }
        
        finally{
            try{
                cn.close();
            } catch(SQLException ex1){
System.out.println("creaUsuario().No existio Conexion --- " + ex1);
            }
        }
        return rs;
    }
}
