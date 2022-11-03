/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

//@author Carlos_G

public class conexion {
    //Driver la cual nos conectariamos a la base de datos
    private static String driver = "com.mysql.cj.jdbc.Driver";
    //La url con la cual nos conectariamos a la base de datos
    private static String url = "jdbc:mysql://localhost/mydb";
    //El usuario de la base de datos
    private static String user = "root";
    //La clave del usuario de la base de datos
    private static String password = "4F30EB421m!";
    //Metodo para obtener la conexion con la base de datos
    public static synchronized Connection getAccesoBD() {
        Connection cn = null;
        try {
System.out.println("Cargamos el driver y le decimos que vamos a usar");
System.out.println("Driver..:"+driver);
System.out.println("url.....:"+url);
System.out.println("user....:"+user);
System.out.println("password:"+password);

            //una conexion con mysql
            Class.forName(driver);
            //Obtenemos la conexion
            cn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            cn = null;
System.out.println("Error en cargar el drivers");
        } finally {
            return cn;
        }
    }
    //Metodo utilizado para cerrar el callablestatemente
    public static synchronized void cerrarCall(CallableStatement cl) {
        try{cl.close();}catch(Exception e){}
    }
    //Metodo utilizado para cerrar el resulset de datos
    public static synchronized void cerrarConexion(ResultSet rs) {
        try{rs.close();} catch (Exception e) {}
    }
    //Metodo utilizado para cerrar la conexion
    public static synchronized void cerrarConexion(Connection cn) {
        try{cn.close();} catch (Exception e) {}
    }
    //Metodo utilizado para deshacer los cambios en la base de datos
    public static synchronized void deshacerCambios(Connection cn) {
        try{cn.rollback();}catch (Exception e){}
    }
}
