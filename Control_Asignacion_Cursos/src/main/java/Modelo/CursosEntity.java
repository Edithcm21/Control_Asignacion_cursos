package Modelo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cursos", schema = "public", catalog = "Control_Cursos")
public class CursosEntity implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "nrc", nullable = false, length = 8)
    private String nrc;
    @Basic
    @Column(name = "cupo_minimo", nullable = true)
    private Integer cupoMinimo;
    @Basic
    @Column(name = "cupo_actual", nullable = true)
    private Integer cupoActual;
    @Basic
    @Column(name = "cupo_maximo", nullable = true)
    private Integer cupoMaximo;
    @Basic
    @Column(name = "semestre", nullable = true)
    private Integer semestre;
    @Basic
    @Column(name = "tutor", nullable = true, length = 18)
    private String tutor;
    @Basic
    @Column(name = "nombre", nullable = true, length = 20)
    private String nombre;

    public CursosEntity(String nrc, Integer cupoMinimo, Integer cupoActual, Integer cupoMaximo, Integer semestre, String tutor, String nombre) {
        this.nrc = nrc;
        this.cupoMinimo = cupoMinimo;
        this.cupoActual = cupoActual;
        this.cupoMaximo = cupoMaximo;
        this.semestre = semestre;
        this.tutor = tutor;
        this.nombre = nombre;
    }

    //Eliminar
    public CursosEntity(String nrc) {
        this.nrc = nrc;
    }

    public CursosEntity() {

    }

    public String getNrc() {
        return nrc;
    }

    public void setNrc(String nrc) {
        this.nrc = nrc;
    }

    public Integer getCupoMinimo() {
        return cupoMinimo;
    }

    public void setCupoMinimo(Integer cupoMinimo) {
        this.cupoMinimo = cupoMinimo;
    }

    public Integer getCupoActual() {
        return cupoActual;
    }

    public void setCupoActual(Integer cupoActual) {
        this.cupoActual = cupoActual;
    }

    public Integer getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(Integer cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
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
}
