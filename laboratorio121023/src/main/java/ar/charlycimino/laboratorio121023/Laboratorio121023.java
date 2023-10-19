
package ar.charlycimino.laboratorio121023;
import java.io.File;
import java.util.*;
import javax.swing.JOptionPane;
public class Laboratorio121023 {
    static List<Auto> autos = new ArrayList<Auto>();
    static List<Municipio> municipios = new ArrayList<Municipio>();
    public static void main(String[] args) {
        int otro=1,otro1,n=0,j=2,contadorAutos=2,posicionDeseada;
        autos.add(new Auto("0","rx7","2023",0));
        autos.add(new Auto("1","miata","2020",1));
        municipios.add(new Municipio("bucaramanga","santander", 0,1));
        municipios.add(new Municipio("florida","santander", 1,1));
        municipios.add(new Municipio("s","santander", 2,0));
        if (ManejoArchivos.archivoVacio("Auto.txt")) {
            // El archivo está vacío, por lo que ejecutamos las líneas 14 y 15
            ManejoArchivos.escribirArchivo("Auto.txt", Laboratorio121023.buscarObjetosAutos(0));
            ManejoArchivos.escribirArchivo("Auto.txt", Laboratorio121023.buscarObjetosAutos(1));
        }
        while(otro==1){
            n = Integer.parseInt(JOptionPane.showInputDialog("1.ingrese auto\n2.crear municipio\n3.saber cuantos carros tiene matriculado un departamento\n4.numero de carros de todos los departamentos\n5.lista de municipios\n6.salir\n7.buscar en arraylist"));
            switch(n){
                case 1:
                    otro1=1;
                    while (otro1 == 1) {
                        Auto nuevoAuto = new Auto(JOptionPane.showInputDialog("ingrese el id del auto"),
                                JOptionPane.showInputDialog("ingrese el nombre"), JOptionPane.showInputDialog("ingrese el modelo"),
                                Laboratorio121023.buscarMunicipio());
                        autos.add(nuevoAuto); // Agregar el nuevo objeto Auto al ArrayList
                        ManejoArchivos.escribirArchivo("Auto.txt", Laboratorio121023.buscarObjetosAutos(contadorAutos));
                        contadorAutos++;
                        otro1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese 1 para continuar"));
                    }
                    break;
                case 2:
                    otro1=1;
                    while(otro1==1){
                        municipios.add(new Municipio(JOptionPane.showInputDialog("ingrese el nombre de municipio"),JOptionPane.showInputDialog("nombre de departamento"),j,0));
                        j++;
                        otro1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese 1 para continuar"));
                    }
                    break;
                case 3:
                    Laboratorio121023.sumarMcp(Laboratorio121023.buscarMunicipio());
                    break;
                case 4:
                    Laboratorio121023.listaNautos();
                    break;
                case 5:
                    Laboratorio121023.listaMunicipios();
                    break;
                case 6:
                    otro=0;
                    break;
                case 7:
                    posicionDeseada = Integer.parseInt(JOptionPane.showInputDialog("ingrese la posicion deseada que desea buscar en el archivo de texto"));
                    ManejoArchivos.buscarArchivo("Auto.txt", posicionDeseada);
                    break;
            }
        }
    }
    static public void sumarMcp(int x){
        for(int i=0;i<autos.size();i++){
            if(autos.get(i).getIdmnc() == x){
                municipios.get(i).sumarNautos();
            }
        }
        JOptionPane.showMessageDialog(null,"el municipio: "+municipios.get(x).getCiudad()+"\ntiene "+/*suma*/municipios.get(x).getnAutos()+" matriculados");
    }
    static public void listaMunicipios(){
        String cadena="";
        for(int i=0;i<municipios.size();i++){
            cadena+="id: "+municipios.get(i).getIdmnc()+"\nnombre de municipio: "+municipios.get(i).getCiudad()+"\nnombre de departamento: "+municipios.get(i).getDepartamento();
        }
        JOptionPane.showMessageDialog(null,cadena);
    }
    static public int buscarMunicipio(){
        int n=0,i=0,otro=1; 
        String buscarnombre = "";
        if(municipios.isEmpty()){
                JOptionPane.showMessageDialog(null,"no se encuentra el municipio");
                municipios.add(new Municipio(buscarnombre,JOptionPane.showInputDialog("nombre de departamento"), 2,0));
            }
        buscarnombre = JOptionPane.showInputDialog("ingrese nombre de municipio");
        //for(int i=0;i<municipios.size();i++){
        while(otro==1 && i<municipios.size()){
            if(buscarnombre.equals(municipios.get(i).getCiudad())){
                n = municipios.get(i).getIdmnc();
            }
            Laboratorio121023.cargarListaCarros();
            i++;
         }
        return n;
    }
    static public void cargarListaCarros(){
        String cadena="";
        Laboratorio121023.eliminarListaNautos();
        for(int i=0;i<autos.size();i++){
            cadena += "municipio: "+(i+1)+": "+municipios.get(i).getCiudad()+"\nnumero de vehiculos matriculados: "+municipios.get(i).getnAutos()+"\n";
        }
        ManejoArchivos.escribirArchivo("nAutos.txt",cadena);
        //JOptionPane.showMessageDialog(null,cadena);
    }
    static public void listaNautos(){
        ManejoArchivos.leerArchivo("nAutos.txt");
    }
    static public void eliminarListaNautos(){
        ManejoArchivos.eliminarArchivo("nAutos.txt");
    }
    static public String buscarObjetosAutos(int i){
        String cadena = "";
        cadena+="id de auto "+autos.get(i).getId()+"\n";
        cadena+="nombre de auto "+autos.get(i).getNombre()+"\n";
        cadena+="modelo de auto "+autos.get(i).getModelo()+"\n";
        cadena+="id de municipio "+autos.get(i).getIdmnc()+"\n";
        return cadena;
    }
    public static boolean archivoVacio(String nombreArchivo) {
    File archivo = new File(nombreArchivo);
        return archivo.length() == 0;
    }
}
