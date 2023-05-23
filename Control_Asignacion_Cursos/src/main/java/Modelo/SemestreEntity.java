package Modelo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "semestre", schema = "public", catalog = "Control_Cursos")
public class SemestreEntity implements Serializable {

    @Id
    @Column(name = "codigo", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int codigo;
    @Basic
    @Column(name = "num_semestre", length = 30)
    private String numSemestre;
    public SemestreEntity(){

    }

    public SemestreEntity(int codigo) {
        this.codigo = codigo;
    }


    public SemestreEntity(String numSemestre) {
        this.numSemestre = numSemestre;
    }

    public SemestreEntity(int codigo, String numSemestre) {
        this.codigo = codigo;
        this.numSemestre = numSemestre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNumSemestre() {
        return numSemestre;
    }

    public void setNumSemestre(String numSemestre) {
        this.numSemestre = numSemestre;
    }
}
