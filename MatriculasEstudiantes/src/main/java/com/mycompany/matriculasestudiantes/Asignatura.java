package com.mycompany.matriculasestudiantes;
public class Asignatura extends Cursos{
    private float creditos;

    public Asignatura(float creditos, String idAsignatura, String nombreAsignatura, String linea, int contador) {
        super(idAsignatura, nombreAsignatura, linea, contador);
        this.creditos = creditos;
    }

    public float getCreditos() {
        return creditos;
    }

    public void setCreditos(float creditos) {
        this.creditos = creditos;
    }
    
}
