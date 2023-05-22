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

        try (Session session= HibernateUtils.getSessionFactory().openSession()) {
            List<SemestreEntity> semestreList = session.createQuery(queryString, SemestreEntity.class).getResultList();

            for (SemestreEntity u : semestreList) {

                System.out.println("Codigo " + u.getCodigo() + ", Semestre: " + u.getNumSemestre());
            }
            return semestreList;
        }
    }

}
