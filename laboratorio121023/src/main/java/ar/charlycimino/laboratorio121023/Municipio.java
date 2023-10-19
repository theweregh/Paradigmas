package ar.charlycimino.laboratorio121023;
public class Municipio {
    private String ciudad,departamento;
    private int idmnc,nAutos;

    public Municipio(String ciudad, String departamento, int idmnc, int nAutos) {
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.idmnc = idmnc;
        this.nAutos = nAutos;
    }

    

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String municipio) {
        this.departamento = municipio;
    }

    public int getIdmnc() {
        return idmnc;
    }

    public void setIdmnc(int idmnc) {
        this.idmnc = idmnc;
    }
    
     /*static public int buscarMunicipio(String x){
         int n;
         if(x == ciudad){
             n= idmnc;
         }
        return n;
    }*/

    public int getnAutos() {
        return nAutos;
    }

    public void setnAutos(int nAutos) {
        this.nAutos = nAutos;
    }
    public void sumarNautos(){
        nAutos++;
    }
}
   

