/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloARChivo;

import Modelo.IestudianteDAO;
import Modelo.Estudiante;
import Vista.MostrarDatos;
//import java.io.File;// es parte del archivo
import java.util.ArrayList;
import java.util.List;

public class EstudianteImplementacionDAO implements IestudianteDAO {

//    private ARCHIVO Archivo; // parte del archivo
//    private File Ruta;
    private BaseDatos mibasedeDatos;
    ArrayList<Estudiante> datos;
    private MostrarDatos MostrarDatos;

    public EstudianteImplementacionDAO() {
        mibasedeDatos=new BaseDatos();
        datos = new ArrayList<Estudiante>();
        MostrarDatos = new MostrarDatos();
        
      // Ruta = new File("D:/MICTIC/Ciclo2_JAVA/Reto3/RETO3/DATOS/datosEstudiantes3.dat");
       
       //Ruta = new File("RETO3/DATOS/datos_estudiantes.dat");
       // Archivo = new ARCHIVO(Ruta);
        //datos = Archivo.LeerEnArchivo(Ruta);
    }
//

    @Override
    public void crear(Estudiante crear) {
        datos.add(crear);
        //Archivo.EscribirEnArchivo(datos, Ruta);// parte de archivo
        mibasedeDatos.crear(crear);// SQL
//        System.out.println("Se agregó el estudiante");
//        System.out.println();
    }

    @Override
    public ArrayList obtenerEstudiantes() {
        return datos;
    }

    @Override
    public ArrayList obtenerEstudiante() {

        String x = MostrarDatos.BuscarCorreoI();
        ArrayList almacenamiento = new ArrayList();

        for (int i = 0; i < datos.size(); i++) {
            datos.get(i).getNombre();
            almacenamiento.add(datos.get(i).getNombre());
            datos.get(i).getApellido();
            almacenamiento.add(datos.get(i).getApellido());
            datos.get(i).getNacimiento();
            almacenamiento.add(datos.get(i).getNacimiento());
            datos.get(i).getCorreoI();
            almacenamiento.add(datos.get(i).getCorreoI());
            datos.get(i).getCorreoP();
            almacenamiento.add(datos.get(i).getCorreoP());
            datos.get(i).getCelular();
            almacenamiento.add(datos.get(i).getCelular());
            datos.get(i).getTelfijo();
            almacenamiento.add(datos.get(i).getTelfijo());
            datos.get(i).getProgramaAcademico();
            almacenamiento.add(datos.get(i).getProgramaAcademico());

            for (int j = 0; j < almacenamiento.size(); j++) {
                if (almacenamiento.contains(x)) {
                    return almacenamiento;

                } else {
                    almacenamiento.clear();
                }
            }

        }
        return null;
    }

    @Override
    public void actualizarEstudiante(String cp, String cel, String fijo, String programa, String buscar) {

        List almacenamiento = new ArrayList();
        for (int i = 0; i < datos.size(); i++) {
             
            datos.get(i).getNombre();
            almacenamiento.add(datos.get(i).getNombre());
            datos.get(i).getApellido();
            almacenamiento.add(datos.get(i).getApellido());
            datos.get(i).getNacimiento();
            almacenamiento.add(datos.get(i).getNacimiento());
            datos.get(i).getCorreoI();
            almacenamiento.add(datos.get(i).getCorreoI());
            datos.get(i).getCorreoP();
            almacenamiento.add(datos.get(i).getCorreoP());
            datos.get(i).getCelular();
            almacenamiento.add(datos.get(i).getCelular());
            datos.get(i).getTelfijo();
            almacenamiento.add(datos.get(i).getTelfijo());
            datos.get(i).getProgramaAcademico();
            almacenamiento.add(datos.get(i).getProgramaAcademico());

            for (int j = 0; j < almacenamiento.size(); j++) {
                if (almacenamiento.contains(buscar)) {
                    try {
                         Estudiante cambios = new Estudiante(datos.get(i).getNombre(), datos.get(i).getApellido(), datos.get(i).getNacimiento(), datos.get(i).getCorreoI(), cp, cel, fijo, programa);
                        datos.set(i, cambios);
                        almacenamiento.clear();
                       // Ruta.delete();
                        //Ruta.createNewFile();
                        //Archivo.EscribirEnArchivo(datos, Ruta);// oarte de archivo
                        System.out.println("Se modificó el estudiante");
                        System.out.println();

                    } catch (Exception e) {
                        System.out.println("No se pudo actualizar Estudiante");
                    }

                } else {
                    almacenamiento.clear();
                }
            }

        }

    }

    @Override
    public ArrayList<Estudiante> eliminarEstudiante() {

        String x = MostrarDatos.BuscarCorreoIeliminar();
        List almacenamiento = new ArrayList();

        for (int i = 0; i < datos.size(); i++) {
            datos.get(i).getNombre();
            almacenamiento.add(datos.get(i).getNombre());
            datos.get(i).getApellido();
            almacenamiento.add(datos.get(i).getApellido());
            datos.get(i).getNacimiento();
            almacenamiento.add(datos.get(i).getNacimiento());
            datos.get(i).getCorreoI();
            almacenamiento.add(datos.get(i).getCorreoI());
            datos.get(i).getCorreoP();
            almacenamiento.add(datos.get(i).getCorreoP());
            datos.get(i).getTelfijo();
            almacenamiento.add(datos.get(i).getTelfijo());
            datos.get(i).getCelular();
            almacenamiento.add(datos.get(i).getCelular());
            datos.get(i).getProgramaAcademico();
            almacenamiento.add(datos.get(i).getProgramaAcademico());

            for (int j = 0; j < almacenamiento.size(); j++) {
                if (almacenamiento.contains(x)) {
                    try {
                        datos.remove(i);
//                        Ruta.delete(); // parte de archivo
//                        Ruta.createNewFile();
//                        Archivo.EscribirEnArchivo(datos, Ruta);
                        System.out.println("Se eliminó el estudiante");
                        System.out.println();
                        break;

                    } catch (Exception e) {
                        System.out.println("Problemas al eliminar Estudiante");
                    }

                } else {
                    almacenamiento.clear();
                }
            }

        }
        return null;

    }

}
