package org.example;

import Modelo.SemestreEntity;
import Utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class Main {
    static SemestreEntity semestre2;
    private static Session session;
    public static void main(String[] args) {
        //Abrimos la sesion con hibernate
        session= HibernateUtils.getSessionFactory().openSession();
        Transaction tx=session.beginTransaction();

        //Creamos una instancia a utilizar
        //crearSemestre("febrero2022");
        SemestreEntity semestre1 = new SemestreEntity(2,"febrero2022");
        // Eliminar un registro
        //session.delete(semestre1);

        // Modificar un registro existente
        semestre1.setNumSemestre("Febrero2023");
        session.update(semestre1);
        System.out.println("Modificacion realizada");

        //
        // Consultar la base de datos
        String queryString = "FROM SemestreEntity order by codigo";
        List<SemestreEntity> semestreList = session.createQuery(queryString, SemestreEntity.class).getResultList();

        for (SemestreEntity u : semestreList) {
            System.out.println("Codigo " + u.getCodigo() + ", Semestre: " + u.getNumSemestre());
        }
        tx.commit();

        session.close();
        System.exit(0);



    }

    public static void crearSemestre(String semestre){
        semestre2=new SemestreEntity( semestre);
        session.save(semestre2);
        System.out.println("Creo el semestre");
    }
}