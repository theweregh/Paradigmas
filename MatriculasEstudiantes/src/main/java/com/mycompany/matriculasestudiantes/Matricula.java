package com.mycompany.matriculasestudiantes;
public class Matricula {
    private String idEstudiante,idAsignatura,fecha;

    public Matricula(String idEstudiante, String idAsignatura, String fecha) {
        this.idEstudiante = idEstudiante;
        this.idAsignatura = idAsignatura;
        this.fecha = fecha;
    }

    public String getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(String idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
 
}
