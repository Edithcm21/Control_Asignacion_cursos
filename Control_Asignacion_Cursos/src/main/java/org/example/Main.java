package org.example;

import Datos.SemestreDao;
import Modelo.SemestreEntity;
import Modelo.TipoContratoEntity;
import Utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class Main {
    static SemestreEntity semestre2;
    private static Session session;
    public static void main(String[] args) {

        //Creamos el objeto para la pagina del login
        new LoginAlumnos();
        //Abrimos la sesion con hibernate
        session= HibernateUtils.getSessionFactory().openSession();
        Transaction tx=session.beginTransaction();



        //Creamos una instancia a utilizar
        semestre2=new SemestreEntity("PruebaSemestrexxx");
        SemestreDao semestreDao=new SemestreDao();
        //semestreDao.insert(semestre2);

        System.out.println(semestreDao.getSemestreById(1).getNumSemestre());
        semestreDao.listaSemestres();
        SemestreEntity semestrem=new SemestreEntity(4,"PruebaUdate");
        semestreDao.UpdateSemestre(semestrem);
        System.out.println("Listando semestre modificado");
        semestreDao.listaSemestres();
        semestreDao.deleteSemestre(semestrem);
        System.out.println("Listando semestre eliminando");




        // crearTipo_contrato("Hola");
        //tx.commit();
        //SemestreEntity semestre1 = new SemestreEntity(2,"febrero2022");
        // Eliminar un registro
        //session.delete(semestre1);

        // Modificar un registro existente
        //semestre1.setNumSemestre("Febrero2023");
        //session.update(semestre1);
        //System.out.println("Modificacion realizada");

        //
        // Consultar la base de datos
        /*String queryString = "FROM SemestreEntity order by codigo";
        List<SemestreEntity> semestreList = session.createQuery(queryString, SemestreEntity.class).getResultList();

        for (SemestreEntity u : semestreList) {
            System.out.println("Codigo " + u.getCodigo() + ", Semestre: " + u.getNumSemestre());
        }*/


        //session.close();
        //System.exit(0);



    }


}
