package Datos;

import Modelo.SemestreEntity;
import Utils.HibernateUtils;
import org.hibernate.Session;
import Modelo.AlumnosEntity;

import javax.persistence.Query;
import java.util.List;

public class AlumnosDao {

    public AlumnosEntity validar(String matricula,String pass) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            String hql = "FROM AlumnosEntity WHERE matricula = :matricula and password1= :pass";
            Query query = session.createQuery(hql);
            query.setParameter("matricula",matricula);
            query.setParameter("pass",pass);
            AlumnosEntity Alumno = (AlumnosEntity) ((org.hibernate.query.Query<?>) query).uniqueResult();

            session.close();
            System.out.println("Mandando datos de alumno");
            return Alumno;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


    //consultar todo

    public List<AlumnosEntity> listar(){

        String queryString = "FROM AlumnosEntity order by matricula";
        List<AlumnosEntity> alumnoslist=null;

        try (Session session= HibernateUtils.getSessionFactory().openSession()) {
            alumnoslist= session.createQuery(queryString, AlumnosEntity.class).getResultList();

            for (AlumnosEntity u : alumnoslist) {

                System.out.println("Codigo " + u.getMatricula() + ", Contraseña: " + u.getPassword1());
            }

        }
        return alumnoslist;

    }
}
