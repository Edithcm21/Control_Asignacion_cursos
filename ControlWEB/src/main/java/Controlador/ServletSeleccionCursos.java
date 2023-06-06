package Controlador;

import Datos.AlumnosDao;
import Modelo.AlumnosEntity;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletSeleccionCursos", value = "/ServletSeleccionCursos")
public class ServletSeleccionCursos extends HttpServlet {
    AlumnosEntity alumnosEntity=new AlumnosEntity();
    AlumnosDao alumnosDao=new AlumnosDao();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
