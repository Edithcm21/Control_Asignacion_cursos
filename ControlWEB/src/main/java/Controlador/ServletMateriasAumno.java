package Controlador;

import Datos.MateriaAlumnoDao;
import Modelo.MateriaAlumnoEntity;
import Modelo.TablaSeleccion;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServletMateriasAumno", value = "/ServletMateriasAumno")
public class ServletMateriasAumno extends HttpServlet {
    String id_alumno;
    List<MateriaAlumnoEntity> lista=new ArrayList<>();
    MateriaAlumnoDao materiaAlumnoDao=new MateriaAlumnoDao();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Entro al get");
        String accion = request.getParameter("accion");

        switch (accion) {
            case "Guardar":
                System.out.println("Ingreso a la opcion de Guardar las materias seleccionadas del alumno");
                id_alumno=request.getParameter("id_alumno");
                System.out.println(id_alumno+"Id del alumno ");
                for (MateriaAlumnoEntity materia:lista) {
                    MateriaAlumnoEntity nueva=new MateriaAlumnoEntity(id_alumno,materia.getIdMateria());
                    materiaAlumnoDao.insert(nueva);
                }
                }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
