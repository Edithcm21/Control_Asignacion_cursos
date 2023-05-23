package Modelo;

import java.io.Serializable;

public class SemestreBin implements Serializable {
    private int Codigo;
    private  String Semestre;
    public SemestreBin(){

    }
    //Modificar y seleccionar un solo registro
    public SemestreBin(int codigo, String semestre) {
        Codigo = codigo;
        Semestre = semestre;
    }

    //Insertar

    public SemestreBin(String semestre) {
        Semestre = semestre;
    }

    //borrar

    public SemestreBin(int codigo) {
        Codigo = codigo;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public String getSemestre() {
        return Semestre;
    }

    public void setSemestre(String semestre) {
        Semestre = semestre;
    }
}
