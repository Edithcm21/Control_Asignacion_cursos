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
