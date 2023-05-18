package Modelo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "materia_alumno", schema = "public", catalog = "Control_Cursos")
public class MateriaAlumnoEntity implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_xx", nullable = false, length = 9)
    private int id_xx;
    @Basic

    @Column(name = "id_alumno", nullable = false, length = 10)
    private String idAlumno;
    @Basic
    @Column(name = "id_materia", nullable = true)
    private Integer idMateria;
    @Basic
    @Column(name = "calificacion", nullable = true)
    private Integer calificacion;
    @Basic
    @Column(name = "indicencias", nullable = true, length = 200)
    private String indicencias;




    public String getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(String idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Integer getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Integer idMateria) {
        this.idMateria = idMateria;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public String getIndicencias() {
        return indicencias;
    }

    public void setIndicencias(String indicencias) {
        this.indicencias = indicencias;
    }

    public void setId_xx(int id_xx) {
        this.id_xx = id_xx;
    }

    public int getId_xx() {
        return id_xx;
    }
}
