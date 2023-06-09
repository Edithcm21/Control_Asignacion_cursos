package Controlador;

import Datos.AlumnosDao;
import Datos.MateriaAlumnoDao;
import Modelo.AlumnosEntity;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.swing.*;
import java.io.IOException;

@WebServlet(name = "ServletLogin", value = "/ServletLogin")
public class ServletLogin extends HttpServlet {
    AlumnosEntity alumnosEntity=new AlumnosEntity();
    AlumnosDao alumnosDao=new AlumnosDao();
    String matricula;
    String contrasena;
    MateriaAlumnoDao materiaAlumnoDao=new MateriaAlumnoDao();


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    System.out.println("Entro al get");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("Entro al post");
        String accion=request.getParameter("accion");
        switch (accion) {

            case "ingresar":
                //obtengo los parametros de matricula y contraseña desde el formulario
                matricula = request.getParameter("matricula");
                contrasena = request.getParameter("password");
                System.out.println(matricula+contrasena);

                //Busco si existe esa matricula y ese alumno en la bd
                alumnosEntity = alumnosDao.validar(matricula, contrasena);
                if (alumnosEntity != null) {
                    //Si esta mando a llamar la siguiente vista pasando los datos del alumno
                    request.setAttribute("alumno", alumnosEntity);
                    request.setAttribute("id_Alumno",alumnosEntity.getMatricula());
                    System.out.println("Mandando a lla,ar al servlet");
                    if(materiaAlumnoDao.getMateriaAlumnoById(alumnosEntity.getMatricula())==true){
                        System.out.println("intento llamar al notificacion");
                        request.getRequestDispatcher("views/Notificacion1.jsp").forward(request, response);
                    }

                    else{
                        request.getRequestDispatcher("ServletSeleccionCursos?menu=cursos&accion=listar").forward(request, response);
                    }
                }
                else {
                    //Sino esta registrado regreso al login
                    System.out.println("El alumno no esta ");
                    request.getRequestDispatcher("index.jsp").forward(request, response);

                }
                break;
        }

    }
}
