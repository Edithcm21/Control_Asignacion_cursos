package Modelo;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "profesores", schema = "public", catalog = "Control_Cursos")
public class ProfesoresEntity implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "curp", nullable = false, length = 18)
    private String curp;
    @Basic
    @Column(name = "nombre", nullable = true, length = 15)
    private String nombre;
    @Basic
    @Column(name = "apellidop", nullable = true, length = 15)
    private String apellidop;
    @Basic
    @Column(name = "apellidom", nullable = true, length = 15)
    private String apellidom;
    @Basic
    @Column(name = "direccion", nullable = true, length = 60)
    private String direccion;
    @Basic
    @Column(name = "telefono", nullable = true, length = 12)
    private String telefono;
    @Basic
    @Column(name = "celular", nullable = true, length = 12)
    private String celular;
    @Basic
    @Column(name = "tipo_contrato", nullable = true)
    private Integer tipoContrato;
    @Basic
    @Column(name = "fecha_nac", nullable = true)
    private Date fechaNac;
    @Basic
    @Column(name = "universidad", nullable = true, length = 50)
    private String universidad;
    @Basic
    @Column(name = "titulo", nullable = true, length = 50)
    private String titulo;
    @Basic
    @Column(name = "ano_graduacion", nullable = true, length = 4)
    private String anoGraduacion;
    @Basic
    @Column(name = "tipo_estudios", nullable = true)
    private Integer tipoEstudios;
    @Basic
    @Column(name = "e_mail", nullable = true, length = 40)
    private String eMail;

    public ProfesoresEntity(String curp, String nombre, String apellidop, String apellidom, String direccion, String telefono, String celular, Integer tipoContrato, Date fechaNac, String universidad, String titulo, String anoGraduacion, Integer tipoEstudios, String eMail) {
        this.curp = curp;
        this.nombre = nombre;
        this.apellidop = apellidop;
        this.apellidom = apellidom;
        this.direccion = direccion;
        this.telefono = telefono;
        this.celular = celular;
        this.tipoContrato = tipoContrato;
        this.fechaNac = fechaNac;
        this.universidad = universidad;
        this.titulo = titulo;
        this.anoGraduacion = anoGraduacion;
        this.tipoEstudios = tipoEstudios;
        this.eMail = eMail;
    }

    public ProfesoresEntity(String curp, String direccion, String telefono, String celular, Integer tipoContrato, String eMail) {
        this.curp = curp;
        this.direccion = direccion;
        this.telefono = telefono;
        this.celular = celular;
        this.tipoContrato = tipoContrato;
        this.eMail = eMail;
    }

    public ProfesoresEntity(String curp) {
        this.curp = curp;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidop() {
        return apellidop;
    }

    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }

    public String getApellidom() {
        return apellidom;
    }

    public void setApellidom(String apellidom) {
        this.apellidom = apellidom;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Integer getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(Integer tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnoGraduacion() {
        return anoGraduacion;
    }

    public void setAnoGraduacion(String anoGraduacion) {
        this.anoGraduacion = anoGraduacion;
    }

    public Integer getTipoEstudios() {
        return tipoEstudios;
    }

    public void setTipoEstudios(Integer tipoEstudios) {
        this.tipoEstudios = tipoEstudios;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
}
