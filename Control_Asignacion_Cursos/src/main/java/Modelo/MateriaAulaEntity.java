package Modelo;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;

@Entity
@Table(name = "materia_aula", schema = "public", catalog = "Control_Cursos")
public class MateriaAulaEntity implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_xx", nullable = false, length = 9)
    private int id_xx;
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


    public MateriaAulaEntity(int idMateria, Integer idSalon, String dia, String mes, Time horaInicio, Time horaFinal) {
        this.idMateria = idMateria;
        this.idSalon = idSalon;
        this.dia = dia;
        this.mes = mes;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
    }

    public MateriaAulaEntity(int id_xx, int idMateria, Integer idSalon, String dia, String mes, Time horaInicio, Time horaFinal) {
        this.id_xx = id_xx;
        this.idMateria = idMateria;
        this.idSalon = idSalon;
        this.dia = dia;
        this.mes = mes;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
    }

    public MateriaAulaEntity(int idMateria, Integer idSalon) {
        this.idMateria = idMateria;
        this.idSalon = idSalon;
    }

    public MateriaAulaEntity() {

    }

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

    public int getId_xx() {
        return id_xx;
    }

    public void setId_xx(int id_xx) {
        this.id_xx = id_xx;
    }

    public void setHoraFinal(Time horaFinal) {
        this.horaFinal = horaFinal;
    }
}
