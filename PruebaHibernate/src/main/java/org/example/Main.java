package org.example;

import Modelo.PersonaEntity;
import Utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    private static Session session;
    public static void main(String[] args) {
        session= HibernateUtils.getSessionFactory().openSession();
        Transaction tx=session.beginTransaction();
        insert("Edith");
        tx.commit();

        session.close();
        System.exit(0);
        System.out.println("Listo");

    }

    public static void insert(String Nombre){
        PersonaEntity personaEntity=new PersonaEntity(Nombre);
        session.save(personaEntity);
        System.out.println("Registro Exitoso");
    }
}