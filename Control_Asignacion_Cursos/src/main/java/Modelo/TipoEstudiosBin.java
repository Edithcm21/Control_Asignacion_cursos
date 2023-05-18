package Modelo;

public class TipoEstudiosBin {
    private int id_tipo;
    private String NombreTE;

    public TipoEstudiosBin(){

    }

    //Insertar
    public TipoEstudiosBin(String nombreTE) {
        NombreTE = nombreTE;
    }
    //Modificar y seleccionar todos


    public TipoEstudiosBin(int id_tipo, String nombreTE) {
        this.id_tipo = id_tipo;
        NombreTE = nombreTE;
    }

    //Eliminar

    public TipoEstudiosBin(int id_tipo) {
        this.id_tipo = id_tipo;
    }

    public int getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    }

    public String getNombreTE() {
        return NombreTE;
    }

    public void setNombreTE(String nombreTE) {
        NombreTE = nombreTE;
    }
}
