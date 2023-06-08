package Controlador;

import Datos.AlumnosDao;
import Datos.TablaSeleccionDao;
import Modelo.AlumnosEntity;
import Modelo.TablaSeleccion;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "ServletSeleccionCursos", value = "/ServletSeleccionCursos")
public class ServletSeleccionCursos extends HttpServlet {
    AlumnosEntity alumnosEntity=new AlumnosEntity();
    AlumnosDao alumnosDao=new AlumnosDao();
    TablaSeleccion tablaSeleccionbin=new TablaSeleccion();
    TablaSeleccionDao tablaSeleccionDao=new TablaSeleccionDao();
    int id_semestre;
    int id_carrera;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        System.out.println("Entro al servlwt");

        String accion = request.getParameter("accion");

        switch (accion) {
            case "listar":
                System.out.println("Entro a la accion listar");
                id_carrera =1; //Integer.parseInt(request.getParameter("id_carrera"));
                id_semestre =8; //Integer.parseInt(request.getParameter("id_semestre"));
                List<TablaSeleccion> lista = tablaSeleccionDao.horario(id_carrera, id_semestre);
                request.setAttribute("horario", lista);
                request.getRequestDispatcher("views/MuestreodeCursos.jsp").forward(request, response);
                break;

        }

    }
}
