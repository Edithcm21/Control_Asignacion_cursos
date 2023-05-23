package Modelo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tipo_mat", schema = "public", catalog = "Control_Cursos")
public class TipoMatEntity implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_tipo", nullable = false)
    private int idTipo;
    @Basic
    @Column(name = "descripcion", nullable = true, length = 30)
    private String descripcion;

    public TipoMatEntity(int idTipo, String descripcion) {
        this.idTipo = idTipo;
        this.descripcion = descripcion;
    }

    public TipoMatEntity(int idTipo) {
        this.idTipo = idTipo;
    }

    public TipoMatEntity(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoMatEntity() {

    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
