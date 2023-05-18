package Modelo;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "tipo_estudios", schema = "public", catalog = "Control_Cursos")
public class TipoEstudiosEntity implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_tipo", nullable = false)
    private int idTipo;
    @Basic
    @Column(name = "nombrete", nullable = true, length = 30)
    private String nombrete;

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getNombrete() {
        return nombrete;
    }

    public void setNombrete(String nombrete) {
        this.nombrete = nombrete;
    }
}
