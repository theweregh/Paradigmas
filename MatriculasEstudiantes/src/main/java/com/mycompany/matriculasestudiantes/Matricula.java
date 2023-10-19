package com.mycompany.matriculasestudiantes;
public class Matricula {
    private String idEstudiante,idAsignatura,fecha,asigMenosRegistrados,asigMasRegistrados;

    public Matricula(String idEstudiante, String idAsignatura, String fecha, String asigMenosRegistrados, String asigMasRegistrados) {
        this.idEstudiante = idEstudiante;
        this.idAsignatura = idAsignatura;
        this.fecha = fecha;
        this.asigMenosRegistrados = asigMenosRegistrados;
        this.asigMasRegistrados = asigMasRegistrados;
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

    public String getAsigMenosRegistrados() {
        return asigMenosRegistrados;
    }

    public void setAsigMenosRegistrados(String asigMenosRegistrados) {
        this.asigMenosRegistrados = asigMenosRegistrados;
    }

    public String getAsigMasRegistrados() {
        return asigMasRegistrados;
    }

    public void setAsigMasRegistrados(String asigMasRegistrados) {
        this.asigMasRegistrados = asigMasRegistrados;
    }
    
    
}
