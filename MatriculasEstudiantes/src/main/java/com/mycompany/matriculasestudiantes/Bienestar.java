package com.mycompany.matriculasestudiantes;
public class Bienestar extends Cursos{
    private float cantidadHoras;

    public Bienestar(float cantidadHoras, String idAsignatura, String nombreAsignatura, String linea, int contador) {
        super(idAsignatura, nombreAsignatura, linea, contador);
        this.cantidadHoras = cantidadHoras;
    }

    public float getCantidadHoras() {
        return cantidadHoras;
    }

    public void setCantidadHoras(float cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }
    
}
