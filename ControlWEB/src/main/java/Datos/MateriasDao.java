package Datos;

import Modelo.MateriasEntity;
import Utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;

public class MateriasDao {

    public boolean UpdateCupo(MateriasEntity materia){
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            Transaction tx=session.beginTransaction();

            session.update(materia); // Realiza la operación de actualización
            tx.commit(); // Confirma la transacción
            session.close();
            return true;
        } catch (Exception e) {
            // Manejo de excepciones
            System.out.println("no se pudo completar la modificacion");
        }
        return false;
    }

    public MateriasEntity getMateriaById(int id) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            String hql = "FROM MateriasEntity WHERE id = :id";
            Query query = session.createQuery(hql);
            query.setParameter("id", id);
            MateriasEntity materia = (MateriasEntity) ((org.hibernate.query.Query<?>) query).uniqueResult();
            session.close();
            return materia;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
