package org.example;

import Modelo.SemestreEntity;
import Utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    private static Session session;
    public static void main(String[] args) {
        //Abrimos la sesion con hibernate
        session= HibernateUtils.getSessionFactory().openSession();
        Transaction tx=session.beginTransaction();

        //Creamos una instancia a utilizar
        crearSemestre("2022-2023");
        tx.commit();
        session.close();
        System.exit(0);

    }

    public static void crearSemestre(String semestre){
        SemestreEntity semestre1=new SemestreEntity(semestre);
        session.save(semestre1);
    }
}