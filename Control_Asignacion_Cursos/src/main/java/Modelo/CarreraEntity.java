package Modelo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "carrera", schema = "public", catalog = "Control_Cursos")
public class CarreraEntity implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_car", nullable = false)
    private int idCar;
    @Basic
    @Column(name = "nombrec", nullable = true, length = 30)
    private String nombrec;
    //insertar

    public CarreraEntity(String nombrec) {
        this.nombrec = nombrec;
    }

    //Consultar y modificar
    public CarreraEntity(int idCar, String nombrec) {
        this.idCar = idCar;
        this.nombrec = nombrec;
    }

    //Eliminar
    public CarreraEntity(int idCar) {
        this.idCar = idCar;
    }

    public CarreraEntity() {

    }

    public int getIdCar() {
        return idCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }

    public String getNombrec() {
        return nombrec;
    }

    public void setNombrec(String nombrec) {
        this.nombrec = nombrec;
    }
}
