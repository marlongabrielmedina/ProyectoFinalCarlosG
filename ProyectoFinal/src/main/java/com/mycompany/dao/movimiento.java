package com.mycompany.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
/**
 *
 * @author Carlos_G
 */
public class movimiento {
    public static Connection        cn;
    public static PreparedStatement ps;
    public static ResultSet         rs; 
    public static double saldoActualOri;
    public static double saldoActualDest;
    
        public static boolean operaMovimiento(double monto, String cuenta_Origen, String cuenta_Destino){
            boolean result = false;
            result = validaMovimiento(monto, cuenta_Origen, cuenta_Destino);
            if(result = true){
                result = creaMovimiento(monto, cuenta_Origen, cuenta_Destino);
              if(result = true){
                actualizaSaldos(monto, cuenta_Origen, cuenta_Destino);
              }
            }
            return result;
        }
        
        private static boolean validaMovimiento(double monto, String cuenta_Origen, String cuenta_Destino) {
            System.out.println("validaMovimiento().Valida conexión");
            boolean result = false;
            String sql;
            try{
                cn=conexion.getAccesoBD();
                
                // valida que exista cuenta Destino
                System.out.println("validaMovimiento().valida que exista cuenta Destino");
                sql ="select Saldo from mydb.cuentas where NoCuenta = "+cuenta_Destino;
                ps=cn.prepareStatement(sql);
                rs = ps.executeQuery();
                if (rs.next()){
                    saldoActualDest= rs.getDouble(1); 
                    // valida que exista cuenta Origen
                   System.out.println("validaMovimiento().valida que exista cuenta Origen");
                   sql= "select Saldo from mydb.cuentas where NoCuenta = "+cuenta_Origen;
                   ps=cn.prepareStatement(sql);
                   rs = ps.executeQuery();
                   if (rs.next()){
                       System.out.println("validaMovimiento().SaldoActualOri:"+saldoActualOri);
                       saldoActualOri = rs.getDouble(1);    
                       if(saldoActualOri>=monto){
                           result = true;
                       }
                   }
                }
            }catch(
                    SQLException ex){System.out.println("validaMovimiento.Error en la conexión --- " + ex);
            }

            finally{
                try{
                    cn.close();
                } catch(SQLException ex1){
                System.out.println("validaMovimiento.No existio Conexion --- " + ex1);
                }
            }
                return result;
        } 
        
        public static synchronized boolean creaMovimiento(double monto, String cuenta_Origen, String cuenta_Destino){
            System.out.println("creaMovimiento().Valida conexión");
            cn = null;
            ps = null;
            int rs = 0;
            String fecha;
            fecha = LocalDate.now().toString();
            boolean result = false;
            try{
                cn=conexion.getAccesoBD();
                String insert = "INSERT INTO mydb.movimientos values (0,'"+fecha+"','"+monto+"','"+cuenta_Origen+"','"+cuenta_Destino+"')";
                ps = cn.prepareStatement(insert);
                rs = ps.executeUpdate();
                if(rs==1){
                    result = true;
                }
            }catch(SQLException ex){
                System.out.println("creaMovimiento().Error en la conexión --- " + ex);
            }
            finally{
                try{
                    cn.close();
                } catch(SQLException ex1){
                System.out.println("creaMovimiento().No existio Conexion --- " + ex1);
                }
            }
            return result;
        }
        
        public static synchronized int actualizaSaldos(double monto, String cuenta_Origen, String cuenta_Destino){
            System.out.println("actualizaSaldos().Valida conexión");
            cn = null;
            ps = null;
            int rs = 0;
            String sql;
            try{
                cn=conexion.getAccesoBD();
                    // Actualiza saldo origen
                    sql = "UPDATE mydb.cuentas set Saldo = "+(saldoActualOri-monto)+" where NoCuenta = '"+cuenta_Origen+"'";
                    ps = cn.prepareStatement(sql);
                    rs = ps.executeUpdate();

                    // Actualiza saldo destino
                    sql = "UPDATE mydb.cuentas set Saldo = "+(saldoActualDest+monto)+" where NoCuenta = '"+cuenta_Destino+"'";
                    ps = cn.prepareStatement(sql);
                    rs = ps.executeUpdate();
            }catch(SQLException ex){
                System.out.println("actualizaSaldos().Error en la conexión --- " + ex);
            }
            finally{
                try{
                    cn.close();
                } catch(SQLException ex1){
                System.out.println("actualizaSaldos().No existio Conexion --- " + ex1);
                }
            }
            return rs;
        }


}
