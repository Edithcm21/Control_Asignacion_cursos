package Datos;

import Modelo.SemestreEntity;
import Utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

public class SemestreDao {

    public boolean insert(SemestreEntity semestre){
        try (Session session= HibernateUtils.getSessionFactory().openSession()){
            Transaction tx=session.beginTransaction();
            session.save(semestre);
            tx.commit();
            session.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Insercion realizada con exito");
        return true;

    }

    public SemestreEntity getSemestreById(int id) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            String hql = "FROM SemestreEntity WHERE id = :id";
            Query query = session.createQuery(hql);
            query.setParameter("id", id);
            SemestreEntity semestre = (SemestreEntity) ((org.hibernate.query.Query<?>) query).uniqueResult();
            session.close();
            return semestre;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    //consultar todo

    public List<SemestreEntity> listaSemestres(){

        String queryString = "FROM SemestreEntity order by codigo";
        List<SemestreEntity> semestreList=null;

        try (Session session= HibernateUtils.getSessionFactory().openSession()) {
             semestreList= session.createQuery(queryString, SemestreEntity.class).getResultList();

            for (SemestreEntity u : semestreList) {

                System.out.println("Codigo " + u.getCodigo() + ", Semestre: " + u.getNumSemestre());
            }

        }
        return semestreList;

    }

    // Modificar un registro existente

    public boolean UpdateSemestre(SemestreEntity semestre){
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            Transaction tx=session.beginTransaction();

            session.update(semestre); // Realiza la operación de actualización
            tx.commit(); // Confirma la transacción
            session.close();
            return true;
        } catch (Exception e) {
            // Manejo de excepciones
            System.out.println("no se pudo completar la modificacion");
        }
        return false;
    }

    // Eliminar un registro
    //session.delete(semestre1);

    public boolean deleteSemestre(SemestreEntity semestre){
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            Transaction tx=session.beginTransaction();

            session.delete(semestre); // Realiza la operación de actualización
            tx.commit(); // Confirma la transacción
            session.close();
            return true;
        } catch (Exception e) {
            // Manejo de excepciones
            System.out.println("no se pudo completar la eliminacion");
        }
        return false;
    }

}
