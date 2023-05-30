package Modelo;

import javax.persistence.*;

@Entity
@Table(name = "persona", schema = "public", catalog = "HibernateP")
public class PersonaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "nombre", nullable = true, length = 20)
    private String nombre;

    public PersonaEntity(String nombre) {
        this.nombre=nombre;
    }

    public PersonaEntity() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
