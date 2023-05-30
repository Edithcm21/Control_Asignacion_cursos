package Modelo;

import javax.persistence.*;

@Entity
@Table(name = "aula", schema = "public", catalog = "Control_Cursos")
public class AulaEntity {
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
