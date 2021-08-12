/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.io.Serializable;
import java.util.List;

public class Estudiante implements Serializable {

    private String Nombre;
    private String Apellido;
    private String Nacimiento;
    private String CorreoI;
    private String CorreoP;
    private String Telfijo;
    private String Celular;
    private String ProgramaAcademico;

    public Estudiante(String Nombre, String Apellido, String Nacimiento, String CorreoI, String CorreoP,String Celular,String Telfijo,String ProgramaAcademico) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Nacimiento = Nacimiento;
        this.CorreoI = CorreoI;
        this.CorreoP = CorreoP;
        this.Telfijo = Telfijo;
        this.Celular = Celular;
        this.ProgramaAcademico = ProgramaAcademico;
    }

  

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNacimiento() {
        return Nacimiento;
    }

    public void setNacimiento(String Nacimiento) {
        this.Nacimiento = Nacimiento;
    }

    public String getCorreoI() {
        return CorreoI;
    }

    public void setCorreoI(String CorreoI) {
        this.CorreoI = CorreoI;
    }

    public String getCorreoP() {
        return CorreoP;
    }

    public void setCorreoP(String CorreoP) {
        this.CorreoP = CorreoP;
    }

    public String getTelfijo() {
        return Telfijo;
    }

    public void setTelfijo(String Telfijo) {
        this.Telfijo = Telfijo;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getProgramaAcademico() {
        return ProgramaAcademico;
    }

    public void setProgramaAcademico(String ProgramaAcademico) {
        this.ProgramaAcademico = ProgramaAcademico;
    }

   

}

