/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloARChivo;

import Modelo.Estudiante;
import Modelo.IestudianteDAO;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Vista.MostrarDatos;

/**
 *
 * @author User
 */
public class BaseDatos implements IestudianteDAO {

    private Connection miConexion;
    String url;
    private MostrarDatos MostrarDatos;

    public BaseDatos() {
        url = "jdbc:sqlite:D:\\MICTIC\\Ciclo2_JAVA\\SQL\\ejemplo1\\Prueba.db";// importante agregar este comando antes del disco C o D= jdbc:sqlite:D:
        MostrarDatos = new MostrarDatos();
    }

    public boolean conexionBD() {

        try {
            Class.forName("org.sqlite.JDBC");
            miConexion = DriverManager.getConnection(url);
            if (miConexion != null) {
                System.out.println("Conectado");

                return true;
            }

        } catch (Exception e) {
            System.out.println("Problemas de conexión a la base de datos.");
        }
        return false;
    }

    @Override
    public void crear(Estudiante crear) {
        String insert;
        if (conexionBD()) {
            try {
                insert = "insert into Estudiante (Nombre,Apellido,Nacimiento,CorreoI,CorreoP,Celular,Telfijo,ProgramaAcademico) values('"
                        + crear.getNombre() + "','" + crear.getApellido() + "','" + crear.getNacimiento() + "','" + crear.getCorreoI() + "','" + crear.getCorreoP() + "','" + crear.getCelular() + "','"
                        + crear.getTelfijo() + "','" + crear.getProgramaAcademico() + "')";

                PreparedStatement consulta = miConexion.prepareStatement(insert);
                if (consulta.executeUpdate() > 0) {

                    //System.out.println("ESTUDIANTE INSERTADO EN SQL_  ");
                    System.out.println("Se agregó el estudiante");
                    System.out.println();

                }

            } catch (Exception e) {
                System.out.println("Problemas al insertar el estudiante!!!!");
            }
        }
    }

    @Override
    public ArrayList<Estudiante> obtenerEstudiantes() {
        //String n="Diego";
        ResultSet resultado = null;
        ArrayList<Estudiante> almacenamiento = new ArrayList<Estudiante>();

        if (conexionBD()) {
            try {

                String query = "select * from Estudiante";
                PreparedStatement Consulta = miConexion.prepareStatement(query);
                resultado = Consulta.executeQuery();

                while (resultado.next()) {
                    Estudiante estudiante;
                    estudiante = new Estudiante(resultado.getString("Nombre"), resultado.getString("Apellido"), resultado.getString("Nacimiento"), resultado.getString("CorreoI"), resultado.getString("CorreoP"),
                            resultado.getString("Celular"), resultado.getString("Telfijo"), resultado.getString("ProgramaAcademico"));
                    almacenamiento.add(estudiante);

                }

                miConexion.close();

            } catch (Exception e) {
                System.out.println("Problema al buscar el Correo");
            }
        }
        return almacenamiento;

    }

    @Override
    public ArrayList<Estudiante> obtenerEstudiante() {
        //String n="Diego";
        ResultSet resultado = null;
        ArrayList<Estudiante> almacenamiento = new ArrayList<Estudiante>();

        if (conexionBD()) {
            try {
                String CI = MostrarDatos.BuscarCorreoI();
                String query = "select Nombre,Apellido,Nacimiento,CorreoI,CorreoP,Celular,Telfijo,ProgramaAcademico from Estudiante" + " where CorreoI like '" + CI + "'";
                PreparedStatement Consulta = miConexion.prepareStatement(query);
                resultado = Consulta.executeQuery();

                while (resultado.next()) {
                    Estudiante estudiante;
                    estudiante = new Estudiante(resultado.getString("Nombre"), resultado.getString("Apellido"), resultado.getString("Nacimiento"), resultado.getString("CorreoI"), resultado.getString("CorreoP"),
                            resultado.getString("Celular"), resultado.getString("Telfijo"), resultado.getString("ProgramaAcademico"));
                    almacenamiento.add(estudiante);

                }

                miConexion.close();

            } catch (Exception e) {
                System.out.println("Problema al buscar el Correo");
            }
        }
        return almacenamiento;
    }

    @Override
    public void actualizarEstudiante(String cp, String cel, String fijo, String programa, String buscar) {

        if (conexionBD()) {
            try {
                String Actualizar = "update Estudiante set CorreoP= '" + cp + "',Celular='" + cel + "',Telfijo='" + fijo + "',ProgramaAcademico='" + programa + "'" + " where CorreoI like '" + buscar + "'";
                PreparedStatement actulizacion = miConexion.prepareStatement(Actualizar);
                if (actulizacion.executeUpdate() > 0) {
                    miConexion.close();
                    System.out.println("Se modificó el estudiante");
                    System.out.println();
                }

            } catch (Exception e) {
                System.out.println("Problemas al actulizar el estudiante en SQL" + e.getMessage());
            }
        }
    }

    @Override
    public ArrayList<Estudiante> eliminarEstudiante() {

        if (conexionBD()) {
            try {
                String buscar = MostrarDatos.BuscarCorreoI();
                String borrar = "delete from estudiante" + " where CorreoI like '" + buscar + "'";
                PreparedStatement delete = miConexion.prepareStatement(borrar);
                if (delete.executeUpdate() > 0) {
                    miConexion.close();
                    System.out.println("Se eliminó el estudiante");
                    System.out.println();
                }

            } catch (Exception e) {
                System.out.println("Problmeas con el borrado del estudiante desde la BD" + e.getMessage());
            }

        }
        return null;
    }

}
