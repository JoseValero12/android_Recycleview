package models;

public class Futbolista {
    private String nombre;
    private String posicion;
    private String nacionalidad;

    public Futbolista(String nombre, String posicion, String nacionalidad) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}