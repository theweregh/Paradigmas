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
        int otro=1,otro1,n=0;
        estudiantes.add(new Estudiante("1234","camilo","Fernandez","1/04/2010", "camilo@gmail.com"));
        asignaturas.add(new Asignatura(1, "0", "Paradigmas de programación", "Arquitectura de software", 0));
        cursosBienestar.add(new Bienestar(1, "1", "ingles", "centro de lenguas", 0));
        while(otro==1){
            n= Integer.parseInt(JOptionPane.showInputDialog("1.ingresar estudiante\n2.ingresar asignatura\n3.ingresar asignatura bienestar\n4.crear matricula\n5.crear descuento\n6.mostrar asignaturas con mayor y menor registrados\n7.salir"));
            switch(n){
                case 1:
                    otro1=1;
                    while(otro1==1){
                    estudiantes.add(new Estudiante(JOptionPane.showInputDialog("ingrese el id del estudiante"),JOptionPane.showInputDialog("ingrese el nombre del estudiante"), JOptionPane.showInputDialog("ingrese el apellido del estudiante"), JOptionPane.showInputDialog("ingrese la fecha de nacimiento del estudiante"),JOptionPane.showInputDialog("ingrese el email del estudiante")));
                    otro1= Integer.parseInt(JOptionPane.showInputDialog("ingrese 1 para continuar de lo contrario otro numero"));
                    }
                    break;
                case 2:
                    otro1=1;
                    while(otro1==1){
                    asignaturas.add(new Asignatura(Float.parseFloat(JOptionPane.showInputDialog("ingrese el numero de creditos de la asignatura")),JOptionPane.showInputDialog("ingrese el id de la asignatura"), JOptionPane.showInputDialog("ingrese el nombre de la asignatura"), JOptionPane.showInputDialog("ingrese la linea de la asignatura"), 0));
                    otro1= Integer.parseInt(JOptionPane.showInputDialog("ingrese 1 para continuar de lo contrario otro numero"));
                    }
                    break;
                case 3:
                otro1=1;
                    while(otro1==1){
                    cursosBienestar.add(new Bienestar(Float.parseFloat(JOptionPane.showInputDialog("ingrese la cantidad de horas del curso de bienestar")), JOptionPane.showInputDialog("ingrese el id de la asignatura"),  JOptionPane.showInputDialog("ingrese el nombre de la asignatura"), JOptionPane.showInputDialog("ingrese la linea de la asignatura"), 0));
                    otro1= Integer.parseInt(JOptionPane.showInputDialog("ingrese 1 para continuar de lo contrario otro numero"));
                    }
                    break;
                case 4:
                otro1=1;
                    while(otro1==1){
                    matriculas.add(new Matricula(JOptionPane.showInputDialog("ingrese el id del estudiante"),  JOptionPane.showInputDialog("ingrese el id de la asignatura"),  JOptionPane.showInputDialog("ingrese la fecha de la matricula")));
                    otro1= Integer.parseInt(JOptionPane.showInputDialog("ingrese 1 para continuar de lo contrario otro numero"));
                    }
                    break;
                case 5:
                    
                    break;
                case 6:
                    MatriculasEstudiantes.buscarMayorMenorRegistrado();
                    break;
                case 7:
                    otro=0;
                    break;
            }
        }
    }
    static public void buscarMayorMenorRegistrado(){
        int i=0,j=0;//String idMayorAsignaturas,idMayorBienestar;
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
        MatriculasEstudiantes.buscarMayorRegistrado();
        MatriculasEstudiantes.buscarMenorRegistrado();
    }
    static public void buscarMayorRegistrado(){
        int cAsignatura=0,cBienestar=0;//contadores
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
    static public void buscarMenorRegistrado(){
        int cAsignatura=0,cBienestar=0;//contadores
        for(int k=0;k<asignaturas.size();k++){
            if(k==0){
                //idMayorAsignaturas = asignaturas.get(k).getIdAsignatura();
                cAsignatura = k;
            }
            if(k>0){
                if(asignaturas.get(cAsignatura).getContador()>asignaturas.get(k).getContador()){
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
                if(cursosBienestar.get(cAsignatura).getContador()>cursosBienestar.get(k).getContador()){
                    //idMayorBienestar = cursosBienestar.get(k).getIdAsignatura();
                    cBienestar = k;
                }
            }
        }
        if(cAsignatura<cBienestar){
            JOptionPane.showMessageDialog(null,"la asignatura con menor numero de registros es: "+cAsignatura);
        }
        if(cAsignatura>cBienestar){
            JOptionPane.showMessageDialog(null,"la asignatura con menor numero de registros es: "+cBienestar);
        }
    }
    static public String BuscarEstudiante(){
        String id,idEncontrado="";int otro=1,i=0;
        id = JOptionPane.showInputDialog("ingrese el id del estudiante");
        while(otro==1){
            if(id.equalsIgnoreCase(estudiantes.get(i).getId())){
                idEncontrado =estudiantes.get(i).getId();
                otro=0;
            }
            if(i==estudiantes.size()){
                estudiantes.add(new Estudiante(JOptionPane.showInputDialog("ingrese el id del estudiante"),JOptionPane.showInputDialog("ingrese el nombre del estudiante"), JOptionPane.showInputDialog("ingrese el apellido del estudiante"), JOptionPane.showInputDialog("ingrese la fecha de nacimiento del estudiante"),JOptionPane.showInputDialog("ingrese el email del estudiante")));
                idEncontrado =estudiantes.get(i).getId();
                otro=0;
            }
        }
        return idEncontrado;
    }
}
