/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Estudiante;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class MostrarDatos {

    
    public MostrarDatos() {
        
    }

    static Scanner leer = new Scanner(System.in);

    public int menuVista() {
        
        System.out.println("INSTITUTO LA FLORESTA");
        System.out.println("Seleccione tarea a realizar:");
        System.out.println("1. Ingresar estudiante");
        System.out.println("2. Buscar estudiante");
        System.out.println("3. Modificar estudiante");
        System.out.println("4. Eliminar Estudiante");
        System.out.println("5. Ver directorio de estudiantes");
        System.out.println("6. Salir");
        System.out.println("Opción:");
         System.out.println();
        int opcion = leer.nextInt();
        leer.nextLine();
        return opcion;
    }

    public String Nombre() {
       
        System.out.println("Ingresar estudiante");
        System.out.println("Ingresar nombres:");
        String x = leer.nextLine();
        System.out.println();

        return x;
    }

    public String Apellido() {
        System.out.println("Ingresar apellidos:");
        String x = leer.nextLine();
        System.out.println();
        return x;
    }

    public String FechaNacimiento() {
        System.out.println("Ingresar fecha de nacimiento (YYYY-MM-DD):");
        String x = leer.nextLine();
        System.out.println();
        return x;
    }

    public String CorreoInstitucional() {
        System.out.println("Ingresar correo institucional:");
        String x = leer.nextLine();
        System.out.println();
        return x;
    }

    public String CorreoPersonal() {
        System.out.println("Ingresar correo personal:");
        String x = leer.nextLine();
        System.out.println();
        return x;
    }

    public String telefonoCelular() {
        System.out.println("Ingresar número de celular:");
        String x = leer.nextLine();
        System.out.println();
        return x;
    }

    public String telefonoFijo() {
        System.out.println("Ingresar número fijo:");
        String x = leer.nextLine();
        System.out.println();
        return x;
    }

    public String ProgramaAcademico() {
        System.out.println("Ingresar programa:");
        String x = leer.nextLine();
        System.out.println();
        return x;
    }

    public String BuscarCorreoI() {
        System.out.println("Buscar estudiante");
        System.out.println("Ingresar correo institucional:");
        String x = leer.nextLine();
        System.out.println();
        return x;
    }
     public String BuscarCorreoIactualizar() {
        System.out.println("Modificar estudiante");
        System.out.println("Ingresar correo institucional:");
        String x = leer.nextLine();
        System.out.println();
        return x;
    }
      public String BuscarCorreoIeliminar() {
        System.out.println("Eliminar estudiante");
        System.out.println("Ingresar correo institucional:");
        String x = leer.nextLine();
        System.out.println();
        return x;
    }

    public void mostrarDatos(ArrayList<Estudiante> cadena) {
        
        System.out.println("El directorio de los estudiantes");
        System.out.println();

        for (int i = 0; i < cadena.size(); i++) {

            System.out.println("Nombres:"+" "+cadena.get(i).getNombre());
            System.out.println("Apellidos:"+" "+cadena.get(i).getApellido());
            System.out.println("Fecha nacimiento:"+" "+cadena.get(i).getNacimiento());
            System.out.println("Correo institucional:"+" "+cadena.get(i).getCorreoI());
            System.out.println("Correo personal:"+" "+cadena.get(i).getCorreoP());
            System.out.println("Número de teléfono celular:"+" "+cadena.get(i).getCelular());
            System.out.println("Número de teléfono fijo:"+" "+cadena.get(i).getTelfijo());
            System.out.println("Programa académico:"+" "+cadena.get(i).getProgramaAcademico());

        }
        System.out.println();

    }

    public void MostrarAlumno(ArrayList<Estudiante> cadena) {
        System.out.println("Información del estudiante");

           for (int i = 0; i < cadena.size(); i++) {

            System.out.println("Nombres:"+" "+cadena.get(i).getNombre());
            System.out.println("Apellidos:"+" "+cadena.get(i).getApellido());
            System.out.println("Fecha nacimiento:"+" "+cadena.get(i).getNacimiento());
            System.out.println("Correo institucional:"+" "+cadena.get(i).getCorreoI());
            System.out.println("Correo personal:"+" "+cadena.get(i).getCorreoP());
            System.out.println("Número de teléfono celular:"+" "+cadena.get(i).getCelular());
            System.out.println("Número de teléfono fijo:"+" "+cadena.get(i).getTelfijo());
            System.out.println("Programa académico:"+" "+cadena.get(i).getProgramaAcademico());

        }
        System.out.println();

    }


    public String cambiarCP() {
        System.out.println("Ingresar correo personal:");
        String x = leer.nextLine();
        System.out.println();
        return x;
    }

    public String cambiarCel() {
        System.out.println("Ingresar número de celular:");
        String x = leer.nextLine();
        System.out.println();
        return x;
    }

    public String cambiarFijo() {
        System.out.println("Ingresar número fijo:");
        String x = leer.nextLine();
        return x;
    }

    public String cambiarPrograma() {
        System.out.println("Ingresar programa:");
        String x = leer.nextLine();
        return x;
    }
     public String Buscar() {
        System.out.println("Ingresar correo institucional:");
        String x = leer.nextLine();
        return x;
    }
}

