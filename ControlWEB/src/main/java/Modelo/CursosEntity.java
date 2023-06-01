package Modelo;

import javax.persistence.*;

@Entity
@Table(name = "cursos", schema = "public", catalog = "Control_Cursos")
public class CursosEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "nrc", nullable = false, length = 8)
    private String nrc;

    @Basic
    @Column(name = "semestre", nullable = true)
    private Integer semestre;
    @Basic
    @Column(name = "tutor", nullable = true, length = 18)
    private String tutor;
    @Basic
    @Column(name = "nombre", nullable = true, length = 20)
    private String nombre;
    @Basic
    @Column(name = "clave_carrera", nullable = true)
    private Integer claveCarrera;

    public String getNrc() {
        return nrc;
    }

    public void setNrc(String nrc) {
        this.nrc = nrc;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getClaveCarrera() {
        return claveCarrera;
    }

    public void setClaveCarrera(Integer claveCarrera) {
        this.claveCarrera = claveCarrera;
    }
}
