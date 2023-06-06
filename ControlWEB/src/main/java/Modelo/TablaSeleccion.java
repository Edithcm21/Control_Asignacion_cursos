package Modelo;

import java.sql.Time;

public class TablaSeleccion {
    private String nrc;
    private int id_materia;
    private String nombreMateria;
    private String profesor;
    private String apaterno;
    private String amaterno;
    private int cupo_actual;
    private Time Hora_inicio;
    private Time Hora_Final;
    private String dia;
    public TablaSeleccion(){

    }

    public TablaSeleccion(String nrc, int idMateria, String nombreMateria, String profesor, String apaterno, String amaterno, int cupo_actual, Time hora_inicio, Time hora_Final, String dia) {
        this.nrc = nrc;
        id_materia = idMateria;
        this.nombreMateria = nombreMateria;
        this.profesor = profesor;
        this.apaterno = apaterno;
        this.amaterno = amaterno;
        this.cupo_actual = cupo_actual;
        Hora_inicio = hora_inicio;
        Hora_Final = hora_Final;
        this.dia = dia;
    }

    public String getNrc() {
        return nrc;
    }

    public void setNrc(String nrc) {
        this.nrc = nrc;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getApaterno() {
        return apaterno;
    }

    public void setApaterno(String apaterno) {
        this.apaterno = apaterno;
    }

    public String getAmaterno() {
        return amaterno;
    }

    public void setAmaterno(String amaterno) {
        this.amaterno = amaterno;
    }

    public int getCupo_actual() {
        return cupo_actual;
    }

    public void setCupo_actual(int cupo_actual) {
        this.cupo_actual = cupo_actual;
    }

    public Time getHora_inicio() {
        return Hora_inicio;
    }

    public void setHora_inicio(Time hora_inicio) {
        Hora_inicio = hora_inicio;
    }

    public Time getHora_Final() {
        return Hora_Final;
    }

    public void setHora_Final(Time hora_Final) {
        Hora_Final = hora_Final;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        return "TablaSeleccion{" +
                "nrc='" + nrc + '\'' +
                ", id_materia=" + id_materia +
                ", nombreMateria='" + nombreMateria + '\'' +
                ", profesor='" + profesor + '\'' +
                ", apaterno='" + apaterno + '\'' +
                ", amaterno='" + amaterno + '\'' +
                ", cupo_actual=" + cupo_actual +
                ", Hora_inicio=" + Hora_inicio +
                ", Hora_Final=" + Hora_Final +
                ", dia='" + dia + '\'' +
                '}';
    }
}
