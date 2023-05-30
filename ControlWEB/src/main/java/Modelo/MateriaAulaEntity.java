package Modelo;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "materia_aula", schema = "public", catalog = "Control_Cursos")
public class MateriaAulaEntity {
    @Basic
    @Column(name = "id_materia", nullable = false)
    private int idMateria;
    @Basic
    @Column(name = "id_salon", nullable = true)
    private Integer idSalon;
    @Basic
    @Column(name = "dia", nullable = true, length = 10)
    private String dia;
    @Basic
    @Column(name = "mes", nullable = true, length = 15)
    private String mes;
    @Basic
    @Column(name = "hora_inicio", nullable = true)
    private Time horaInicio;
    @Basic
    @Column(name = "hora_final", nullable = true)
    private Time horaFinal;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_xx", nullable = false)
    private int idXx;

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public Integer getIdSalon() {
        return idSalon;
    }

    public void setIdSalon(Integer idSalon) {
        this.idSalon = idSalon;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Time getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(Time horaFinal) {
        this.horaFinal = horaFinal;
    }

    public int getIdXx() {
        return idXx;
    }

    public void setIdXx(int idXx) {
        this.idXx = idXx;
    }
}
