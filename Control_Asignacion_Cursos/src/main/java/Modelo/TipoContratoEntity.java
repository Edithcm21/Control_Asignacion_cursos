package Modelo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tipo_contrato", schema = "public", catalog = "Control_Cursos")
public class TipoContratoEntity implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_tipoc", nullable = false)
    private int idTipoc;
    @Basic
    @Column(name = "descripcion", nullable = true, length = 30)
    private String descripcion;

    public int getIdTipoc() {
        return idTipoc;
    }

    public void setIdTipoc(int idTipoc) {
        this.idTipoc = idTipoc;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
