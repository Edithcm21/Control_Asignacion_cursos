package Modelo;

import java.io.Serializable;

public class TipoMateriaBin implements Serializable {
    private int ID_Tipo;
    private String Descripcion;

    private TipoMateriaBin(){

    }

    //Insertar
    public TipoMateriaBin(String descripcion) {
        Descripcion = descripcion;
    }
    //Select and delete

    public TipoMateriaBin(int ID_Tipo) {
        this.ID_Tipo = ID_Tipo;
    }
    //Modificar y consultar todos los datos
    public TipoMateriaBin(int ID_Tipo, String descripcion) {
        this.ID_Tipo = ID_Tipo;
        Descripcion = descripcion;
    }

    public int getID_Tipo() {
        return ID_Tipo;
    }

    public void setID_Tipo(int ID_Tipo) {
        this.ID_Tipo = ID_Tipo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
