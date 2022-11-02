package com.mycompany.dao;

import com.mycompany.beans.cuentas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Carlos_G
 */
public class cuenta {
        public static Connection        cn;
        public static PreparedStatement ps;
        
        public static synchronized int creaCuenta( String moneda, String tipo, String DPI){
System.out.println("creaCuenta().Valida conexión");
        cn = null;
        ps = null;
        int rs = 0;
        String apertura;
        String cuenta;

        // ini random numeros
        int numero;
        ArrayList numeros = new ArrayList();
        StringBuilder cta = new StringBuilder("");

        // Genera 10 numeros entre 1 y 9
        System.out.println("Genera 10 numeros entre 1 y 9");
        for (int i = 1; i <= 10; i++) {
        numero = (int) (Math.random() * 9 + 1);
        System.out.println("numero"+numero);
        numeros.add(numero);
        }
        cta.append(numeros);
        System.out.println("Cuenta!"+cta);
        // fin random numeros
        cuenta = cta.toString();
        apertura = LocalDate.now().toString();
        
        try{
            cn=conexion.getAccesoBD();
            
            String insert = "INSERT INTO mydb.cuentas values ('"+cuenta+"','"+moneda+"',"+0+",'"+tipo+"','"+apertura+"',"+DPI+"')";
            
            ps = cn.prepareStatement(insert);
            
            rs = ps.executeUpdate();

        }catch(SQLException ex){
System.out.println("creaCuenta().Error en la conexión --- " + ex);
        }
        
        finally{
            try{
                cn.close();
            } catch(SQLException ex1){
System.out.println("creaCuenta().No existio Conexion --- " + ex1);
            }
        }
        return rs;
    }

   public static synchronized  cuentas ObtieneCuentas(String num_cuenta){
    boolean resultado=false;
    Connection cn=null;
    PreparedStatement  ps=null;
    cuentas ct=new cuentas();
    try{
        cn=conexion.getAccesoBD();
        //Statement st=cn.createStatement();
        String mostrar="select * from cuentas';";
        ps=cn.prepareStatement(mostrar);
        ResultSet rs=ps.executeQuery();
        while(rs.next())
          {
             ct = new cuentas(rs.getString(1),rs.getString(2),rs.getDouble(3),rs.getString(4),rs.getString(5),rs.getString(6));
          }
    }catch(
            SQLException ex){System.out.println("Error al mostrar monto --- " + ex);
    }
    finally{
        try{
            cn.close();
        }
        catch(SQLException ex1){System.out.println("No existio Conexion --- " + ex1);
        }
        }
      return ct;
    }
   
}
