package Modelo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "aula", schema = "public", catalog = "Control_Cursos")
public class AulaEntity implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "codigo", nullable = false)
    private int codigo;
    @Basic
    @Column(name = "lugar", nullable = true, length = 60)
    private String lugar;
    @Basic
    @Column(name = "num_pupitres", nullable = true)
    private Integer numPupitres;

    //insertar
    public AulaEntity(String lugar, Integer numPupitres) {
        this.lugar = lugar;
        this.numPupitres = numPupitres;
    }

    //modificar y consultar
    public AulaEntity(int codigo, String lugar, Integer numPupitres) {
        this.codigo = codigo;
        this.lugar = lugar;
        this.numPupitres = numPupitres;
    }

    //eliminar

    public AulaEntity(int codigo) {
        this.codigo = codigo;
    }

    public AulaEntity() {

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Integer getNumPupitres() {
        return numPupitres;
    }

    public void setNumPupitres(Integer numPupitres) {
        this.numPupitres = numPupitres;
    }
}
