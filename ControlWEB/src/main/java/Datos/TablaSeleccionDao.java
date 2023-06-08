package Datos;

import Modelo.TablaSeleccion;
import Utils.HibernateUtils;
import org.hibernate.Session;

import javax.persistence.Query;
import java.sql.Time;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TablaSeleccionDao {


    public List<TablaSeleccion> obtenerMateriasCurso(int id_carrera, int id_semestre) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            String sql = "select Cursos.nrc,materias.nombre,profesores.nombrep,profesores.apellidop,profesores.apellidom,materias.cupo_act, materia_aula.dia, materia_aula.hora_inicio, materia_aula.hora_final,materias.codigo  from mat_profesor\n" +
                    "join profesores\n" +
                    "on profesores.curp=mat_profesor.id_profesor\n" +
                    "join materias\n" +
                    "on mat_profesor.id_materia=materias.codigo\n" +
                    "join cursos\n" +
                    "on cursos.nrc=materias.id_curso\n" +
                    "join materia_aula\n" +
                    "on materia_aula.id_materia=materias.codigo\n"+
                    "where semestre="+id_semestre+" and clave_carrera="+id_carrera+" and cursos.nombre= 'Febrero-Julio2023'";

            Query query1 = session.createNativeQuery(sql);
            List<Object[]> results = query1.getResultList();


            List<TablaSeleccion> lista=new ArrayList<>();


            for (Object[] materia: results){
                String nrc=(String) materia[0];
                String nombre_materia=(String) materia[1];
                String nombrep=(String) materia[2];
                String apellidop=(String) materia[3];
                String  apellidom=(String) materia[4];
                int cupo=(int) materia[5];
                String dia=(String) materia[6];
                Time hora=(Time) materia[7];
                Time horafinal=(Time) materia[8];
                int idMateria=(int) materia[9];
                TablaSeleccion tablaSeleccion=new TablaSeleccion(nrc, idMateria, nombre_materia,nombrep,apellidop,apellidom,cupo,hora,horafinal,dia);
                lista.add(tablaSeleccion);
            }


            session.close();
            return lista;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public List<TablaSeleccion> horario(int id_carrera, int id_semestre){
        List<TablaSeleccion> lista=obtenerMateriasCurso(id_carrera,id_semestre);
        List<Integer> indices=new ArrayList<>();
        lista.forEach(n->{
            indices.add(n.getId_materia());
        });

        Set<Integer> ids=new HashSet<>(indices);
        List<Integer> ids2=new ArrayList<>(ids);
        List<TablaSeleccion> listahorario=new ArrayList<>();

        int tamaño=ids2.size();
        int i=0;
        while (i<tamaño){
            TablaSeleccion nueva=new TablaSeleccion();
            int indice= ids2.get(i);

            for (TablaSeleccion materia:lista
            ) {
                if(materia.getId_materia()==indice){
                    nueva.setNrc(materia.getNrc());
                    nueva.setNombreMateria(materia.getNombreMateria());
                    nueva.setProfesor(materia.getProfesor());
                    nueva.setApaterno(materia.getApaterno());
                    nueva.setAmaterno(materia.getAmaterno());
                    nueva.setCupo_actual(materia.getCupo_actual());
                    nueva.setId_materia(materia.getId_materia());

                    switch (materia.getDia()) {
                        case "lunes" :
                            nueva.setLunes(String.valueOf(materia.getHora_inicio()) + "-"+String.valueOf(materia.getHora_Final()));
                            break;
                        case "martes" :
                            nueva.setMartes(String.valueOf(materia.getHora_inicio()) + "-"+String.valueOf(materia.getHora_Final()));
                            break;
                        case "miercoles" :
                            nueva.setMiercoles(String.valueOf(materia.getHora_inicio()) + "-"+String.valueOf(materia.getHora_Final()));
                            break;
                        case "jueves" :
                            nueva.setJueves(String.valueOf(materia.getHora_inicio()) + "-"+String.valueOf(materia.getHora_Final()));
                            break;
                        case "viernes" :
                            nueva.setViernes(String.valueOf(materia.getHora_inicio()) + "-"+String.valueOf(materia.getHora_Final()));
                            break;
                    }

                }

            }
            listahorario.add(nueva);
            i++;
        }
    return listahorario;
    }


}
