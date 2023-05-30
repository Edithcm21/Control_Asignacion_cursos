package Modelo;

import javax.persistence.*;

@Entity
@Table(name = "materias", schema = "public", catalog = "Control_Cursos")
public class MateriasEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "codigo", nullable = false)
    private int codigo;
    @Basic
    @Column(name = "nombre", nullable = true, length = 50)
    private String nombre;
    @Basic
    @Column(name = "creditos", nullable = true)
    private Integer creditos;
    @Basic
    @Column(name = "num_horas", nullable = true)
    private Integer numHoras;
    @Basic
    @Column(name = "tipo_materia", nullable = true)
    private Integer tipoMateria;
    @Basic
    @Column(name = "requisitos", nullable = true, length = 500)
    private String requisitos;
    @Basic
    @Column(name = "id_curso", nullable = true, length = -1)
    private String idCurso;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    public Integer getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(Integer numHoras) {
        this.numHoras = numHoras;
    }

    public Integer getTipoMateria() {
        return tipoMateria;
    }

    public void setTipoMateria(Integer tipoMateria) {
        this.tipoMateria = tipoMateria;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public String getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(String idCurso) {
        this.idCurso = idCurso;
    }
}
