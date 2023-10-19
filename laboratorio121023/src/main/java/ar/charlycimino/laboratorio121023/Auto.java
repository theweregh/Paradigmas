package ar.charlycimino.laboratorio121023;
public class Auto {
    private String id,nombre,modelo;
    private int idmnc; 

    public Auto(String id, String nombre, String modelo, int idmnc) {
        this.id = id;
        this.nombre = nombre;
        this.modelo = modelo;
        this.idmnc = idmnc;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getIdmnc() {
        return idmnc;
    }

    public void setIdmnc(int idmnc) {
        this.idmnc = idmnc;
    }
    
}
