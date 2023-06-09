package Datos;

import Modelo.MateriaAlumnoEntity;
import Modelo.SemestreEntity;
import Utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;

public class MateriaAlumnoDao {

    public boolean insert(MateriaAlumnoEntity materia){
        try (Session session= HibernateUtils.getSessionFactory().openSession()){
            Transaction tx=session.beginTransaction();
            session.save(materia);
            tx.commit();
            session.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Insercion realizada con exito");
        return true;

    }

    public boolean getMateriaAlumnoById(String idAlumno) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            String hql = "FROM MateriaAlumnoEntity WHERE idAlumno = :idAlumno ";
            Query query = session.createQuery(hql);
            query.setParameter("idAlumno", idAlumno);
            query.setMaxResults(1);
            MateriaAlumnoEntity materiaAlumnoEntity= (MateriaAlumnoEntity) ((org.hibernate.query.Query<?>) query).uniqueResult();
            session.close();
            if (materiaAlumnoEntity!=null){
                return true;
            }
            return false;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


}
