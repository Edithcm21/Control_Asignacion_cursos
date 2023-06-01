package Controlador;

import Datos.AlumnosDao;
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
                matricula = request.getParameter("matricula");
                contrasena = request.getParameter("password");
                System.out.println(matricula+contrasena);


                alumnosEntity = alumnosDao.validar(matricula, contrasena);
                if (alumnosEntity != null) {
                    request.setAttribute("alumno", alumnosEntity);
                    request.getRequestDispatcher("views/MuestreodeCursos.jsp").forward(request, response);
                }
                else {
                    System.out.println("El alumno no esta ");
                    request.getRequestDispatcher("index.jsp").forward(request, response);

                }
                break;
        }

    }
}
