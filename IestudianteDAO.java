package Modelo;
import java.util.ArrayList;
//import java.util.List;
import Modelo.Estudiante;

public interface IestudianteDAO {

  public void crear(Estudiante crear);

    public ArrayList<Estudiante> obtenerEstudiantes();

    public ArrayList<Estudiante> obtenerEstudiante();

    public  void actualizarEstudiante(String cp,String cel,String fijo, String programa,String buscar);

    public ArrayList<Estudiante>  eliminarEstudiante();

}
