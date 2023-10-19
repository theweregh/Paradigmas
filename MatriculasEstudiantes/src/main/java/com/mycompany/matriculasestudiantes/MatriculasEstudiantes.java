package com.mycompany.matriculasestudiantes;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MatriculasEstudiantes {
    static List<Estudiante> estudiantes = new ArrayList<Estudiante>();
    static List<Asignatura> asignaturas = new ArrayList<Asignatura>();
    static List<Bienestar> cursosBienestar = new ArrayList<Bienestar>();
    static List<Matricula> matriculas = new ArrayList<Matricula>();
    public static void main(String[] args) {
        
    }
    static public void buscarMayorRegistrado(){
        int i=0,j=0,cAsignatura=0,cBienestar=0;//String idMayorAsignaturas,idMayorBienestar;
        while(j<asignaturas.size()){
            if(matriculas.get(i).getIdAsignatura().equals(asignaturas.get(j).getIdAsignatura())){
                asignaturas.get(j).setContador(asignaturas.get(j).getContador()+1);
            }
            i++;
            j++;
        }
        i=0;j=0;
        while(j<cursosBienestar.size()){
            if(matriculas.get(i).getIdAsignatura().equals(cursosBienestar.get(j).getIdAsignatura())){
                cursosBienestar.get(j).setContador(j);
            }
            i++;
            j++;
        }
        for(int k=0;k<asignaturas.size();k++){
            if(k==0){
                //idMayorAsignaturas = asignaturas.get(k).getIdAsignatura();
                cAsignatura = k;
            }
            if(k>0){
                if(asignaturas.get(cAsignatura).getContador()<asignaturas.get(k).getContador()){
                    //idMayorAsignaturas = asignaturas.get(k).getIdAsignatura();
                    cAsignatura = k;
                }
            }
        }
        for(int k=0;k<cursosBienestar.size();k++){
            if(k==0){
                //idMayorBienestar = cursosBienestar.get(k).getIdAsignatura();
                cBienestar = k;
            }
            if(k>0){
                if(cursosBienestar.get(cAsignatura).getContador()<cursosBienestar.get(k).getContador()){
                    //idMayorBienestar = cursosBienestar.get(k).getIdAsignatura();
                    cBienestar = k;
                }
            }
        }
        if(cAsignatura>cBienestar){
            JOptionPane.showMessageDialog(null,"la asignatura con mayor numero de registros es: "+cAsignatura);
        }
        if(cAsignatura<cBienestar){
            JOptionPane.showMessageDialog(null,"la asignatura con mayor numero de registros es: "+cBienestar);
        }
    }
}
