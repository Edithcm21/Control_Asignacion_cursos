package Modelo;

import java.io.Serializable;

public class TipoContratoBin implements Serializable {
    private int Id_TipoC;
    private String Descripcion;

    public TipoContratoBin(){

    }

    //Borrar registro
    public TipoContratoBin(int id_TipoC) {
        Id_TipoC = id_TipoC;
    }
    //insertar
    public TipoContratoBin(String descripcion) {
        Descripcion = descripcion;
    }

    //Seleccionar y modificar

    public TipoContratoBin(int id_TipoC, String descripcion) {
        Id_TipoC = id_TipoC;
        Descripcion = descripcion;
    }

    public int getId_TipoC() {
        return Id_TipoC;
    }

    public void setId_TipoC(int id_TipoC) {
        Id_TipoC = id_TipoC;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
