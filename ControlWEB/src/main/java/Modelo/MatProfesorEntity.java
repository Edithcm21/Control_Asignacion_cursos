package Modelo;

import javax.persistence.*;

@Entity
@Table(name = "mat_profesor", schema = "public", catalog = "Control_Cursos")
public class MatProfesorEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idxx", nullable = false)
    private int idxx;
    @Basic
    @Column(name = "id_profesor", nullable = true, length = 18)
    private String idProfesor;
    @Basic
    @Column(name = "id_materia", nullable = true)
    private Integer idMateria;

    public int getIdxx() {
        return idxx;
    }

    public void setIdxx(int idxx) {
        this.idxx = idxx;
    }

    public String getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(String idProfesor) {
        this.idProfesor = idProfesor;
    }

    public Integer getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Integer idMateria) {
        this.idMateria = idMateria;
    }
}
