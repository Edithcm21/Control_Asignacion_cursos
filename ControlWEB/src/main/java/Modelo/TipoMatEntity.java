package Modelo;

import javax.persistence.*;

@Entity
@Table(name = "tipo_mat", schema = "public", catalog = "Control_Cursos")
public class TipoMatEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_tipo", nullable = false)
    private int idTipo;
    @Basic
    @Column(name = "descripcion", nullable = true, length = 30)
    private String descripcion;

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
