package Modelo;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "alumnos", schema = "public", catalog = "Control_Cursos")
public class AlumnosEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "matricula", nullable = false, length = 9)
    private String matricula;
    @Basic
    @Column(name = "semestre", nullable = true)
    private Integer semestre;
    @Basic
    @Column(name = "curp", nullable = true, length = 18)
    private String curp;
    @Basic
    @Column(name = "clave_carrera", nullable = true)
    private Integer claveCarrera;
    @Basic
    @Column(name = "apellidop", nullable = true, length = 20)
    private String apellidop;
    @Basic
    @Column(name = "apellidom", nullable = true, length = 20)
    private String apellidom;
    @Basic
    @Column(name = "nombre", nullable = true, length = 20)
    private String nombre;
    @Basic
    @Column(name = "fechanac", nullable = true)
    private Date fechanac;
    @Basic
    @Column(name = "cel", nullable = true, length = 12)
    private String cel;
    @Basic
    @Column(name = "e_mail", nullable = true, length = 40)
    private String eMail;
    @Basic
    @Column(name = "direccion", nullable = true, length = 60)
    private String direccion;
    @Basic
    @Column(name = "telefono", nullable = true, length = 12)
    private String telefono;
    @Basic
    @Column(name = "contraseña", nullable = true, length = 15)
    private String contraseña;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public Integer getClaveCarrera() {
        return claveCarrera;
    }

    public void setClaveCarrera(Integer claveCarrera) {
        this.claveCarrera = claveCarrera;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechanac() {
        return fechanac;
    }

    public void setFechanac(Date fechanac) {
        this.fechanac = fechanac;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
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

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
