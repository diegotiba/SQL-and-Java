/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.ArrayList;
import java.util.List;
import Vista.MostrarDatos;
import Modelo.EstudianteDAOImp;
import Modelo.IestudianteDAO;
import Modelo.Estudiante;
import ModeloARChivo.EstudianteImplementacionDAO;
import ModeloARChivo.BaseDatos;
public class Controlador {
    ArrayList<Estudiante> cadena;
    ArrayList<Estudiante> almacenamiento;
    private MostrarDatos mostrarmenu;
    private MostrarDatos MostrarDatos;
    private IestudianteDAO estudianteDAO;
    private BaseDatos datosSQL;
    public Controlador() {
        mostrarmenu = new MostrarDatos();
        MostrarDatos = new MostrarDatos();
        estudianteDAO = new EstudianteImplementacionDAO();
        datosSQL=new BaseDatos();
        cadena= new ArrayList<Estudiante>();
        almacenamiento=new ArrayList<Estudiante>();
    }

    public void Menu() {
        int opcion = 0;
        while (opcion != 6) {
            opcion = mostrarmenu.menuVista();
            switch (opcion) {
                case 1:

                    String n = MostrarDatos.Nombre();
                    String a = MostrarDatos.Apellido();
                    String na =MostrarDatos.FechaNacimiento();
                    String ci=MostrarDatos.CorreoInstitucional();
                    String cp =MostrarDatos.CorreoPersonal();
                    String cel=MostrarDatos.telefonoCelular();
                    String tel=MostrarDatos.telefonoFijo();
                    String pro=MostrarDatos.ProgramaAcademico();
                    Estudiante Datoscadena = new Estudiante(n, a,na,ci,cp,cel,tel,pro);
                            

                    estudianteDAO.crear(Datoscadena);

                    break;
                case 2:
                    
                     // almacenamiento=estudianteDAO.obtenerEstudiante();
                    almacenamiento=datosSQL.obtenerEstudiante(); // tener en cuanta que se crea la lista como un objeto
                    MostrarDatos.MostrarAlumno(almacenamiento);
                     //MostrarDatos.mostrarDatos(almacenamiento);
                                       
                    break;
                case 3:
                    String buscar=MostrarDatos.BuscarCorreoIactualizar();
                    String cope=MostrarDatos.cambiarCP();
                    String celu=MostrarDatos.cambiarCel();
                    String fijo=MostrarDatos.cambiarFijo();
                    String programa=MostrarDatos.cambiarPrograma();                   
                    //estudianteDAO.actualizarEstudiante(cope,celu,fijo,programa, buscar);
                    datosSQL.actualizarEstudiante(cope,celu,fijo,programa, buscar);
                    
                    break;
                case 4:
                    //estudianteDAO.eliminarEstudiante();
                    datosSQL.eliminarEstudiante();
                    break;
                case 5:
                    
                    //cadena=estudianteDAO.obtenerEstudiantes();
                    cadena=datosSQL.obtenerEstudiantes();
                    MostrarDatos.mostrarDatos(cadena);
                    break;
                case 6:
                    System.out.println("Hasta pronto");
                    break;

            }

        }

    }

}
