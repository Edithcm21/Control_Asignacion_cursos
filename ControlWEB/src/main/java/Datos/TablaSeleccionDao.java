package Datos;

import Modelo.TablaSeleccion;
import Utils.HibernateUtils;
import org.hibernate.Session;

import javax.persistence.Query;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class TablaSeleccionDao {
    public void obtenerMateriasCurso(int id_carrera, int id_semestre) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            String sql = "select Cursos.nrc,materias.nombre,profesores.nombrep,profesores.apellidop,profesores.apellidom,materias.cupo_act, materia_aula.dia, materia_aula.hora_inicio, materia_aula.hora_final,materias.codigo  from mat_profesor\n" +
                    "join profesores\n" +
                    "on profesores.curp=mat_profesor.id_profesor\n" +
                    "join materias\n" +
                    "on mat_profesor.id_materia=materias.codigo\n" +
                    "join cursos\n" +
                    "on cursos.nrc=materias.id_curso\n" +
                    "join materia_aula\n" +
                    "on materia_aula.id_materia=materias.codigo\n" +
                    "where semestre="+id_semestre+" and clave_carrera="+id_carrera+" and cursos.nombre= 'Febrero-Julio2023'";

            Query query1 = session.createNativeQuery(sql);
            List<Object[]> results = query1.getResultList();

            for (Object[] row : results) {
                // Accede a los valores de cada columna en el resultado
                String nrc = (String) row[0];
                String nombreMateria = (String) row[1];
                String nombreProfesor = (String) row[2];
                // ... y así sucesivamente
            }
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
                System.out.println("Imprimiendo los datos");
                System.out.println(tablaSeleccion.getNombreMateria());
                System.out.printf(tablaSeleccion.toString());
            }
            results.forEach(n->{
                //System.out.println("Nombre"+n.getNombreMateria());
            });


            session.close();
            System.out.println("Mandando datos de alumno");
            return ;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
