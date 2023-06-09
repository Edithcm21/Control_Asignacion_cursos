package Controlador;

import Datos.AlumnosDao;
import Datos.MateriaAlumnoDao;
import Datos.MateriasDao;
import Datos.TablaSeleccionDao;
import Modelo.AlumnosEntity;
import Modelo.MateriaAlumnoEntity;
import Modelo.MateriasEntity;
import Modelo.TablaSeleccion;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

@WebServlet(name = "ServletSeleccionCursos", value = "/ServletSeleccionCursos")
public class ServletSeleccionCursos extends HttpServlet {
    AlumnosEntity alumnosEntity=new AlumnosEntity();
    AlumnosDao alumnosDao=new AlumnosDao();

    TablaSeleccionDao tablaSeleccionDao=new TablaSeleccionDao();
    int id_semestre;
    int id_carrera;
    String id_alumno;
    AlumnosEntity alumno=new AlumnosEntity();
    int id_materia;
    List<TablaSeleccion> cursosSeleccionados=new ArrayList<>();
    List<TablaSeleccion> lista=new ArrayList<>();
    TablaSeleccion materia_seleccionada=new TablaSeleccion();
    MateriaAlumnoDao materiaAlumnoDao=new MateriaAlumnoDao();
    MateriasEntity materiasEntity=new MateriasEntity();
    MateriasDao materiasDao=new MateriasDao();


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    System.out.println("Entro al get");
        String accion = request.getParameter("accion");

        switch (accion) {
            case "cerrar":
                cursosSeleccionados.clear();
                lista.clear();
                alumno=null;
                System.out.println("Cerro sesion ");
                request.getRequestDispatcher("index.jsp").forward(request,response);
                break;
            case "agregar":
                System.out.println("Ingreso a la opcion de agregar del get");
                //System.out.println(request.getParameter("id_materia"));
                id_materia= Integer.parseInt(request.getParameter("id_materia"));
                System.out.println(id_materia);
                lista.forEach(n->{
                    if(n.getId_materia()==id_materia){
                        materia_seleccionada=new TablaSeleccion(n.getNrc(),n.getId_materia(),n.getNombreMateria(),n.getProfesor(),n.getApaterno(),n.getAmaterno(),n.getCupo_actual(),n.getLunes(),n.getMartes(),n.getMiercoles(),n.getJueves(),n.getViernes());

                    }
                });
                boolean existe=false;
                for(int i=0;i<cursosSeleccionados.size();i++){
                    if(cursosSeleccionados.get(i).getId_materia()==materia_seleccionada.getId_materia()){
                        existe=true;
                    }
                }
                if(!existe){
                    System.out.println("La materia No existe");
                    cursosSeleccionados.add(materia_seleccionada);
                }

                //request.setAttribute("CursosSeleccionados", cursosSeleccionados);
                //request.setAttribute("alumno",alumno);
                //System.out.println(alumno.getNombre());
                request.getRequestDispatcher("ServletSeleccionCursos?menu=cursos&accion=listar").forward(request, response);
                break;
            case "listar":
                System.out.println("Entro a la accion listar del get ");
                //alumno=(AlumnosEntity) request.getAttribute("alumno");
                System.out.println(alumno.getMatricula()+" "+alumno.getClaveCarrera());
                id_carrera =alumno.getClaveCarrera();
                id_semestre =alumno.getSemestre();
                id_alumno=alumno.getMatricula();
                lista= tablaSeleccionDao.horario(id_carrera, id_semestre);
                lista.forEach(n->{
                    System.out.println(n.toString());
                });
                request.setAttribute("horario", lista);
                request.setAttribute("alumno",alumno);
                request.setAttribute("CursosSeleccionados", cursosSeleccionados);
                request.getRequestDispatcher("views/MuestreodeCursos.jsp").forward(request, response);
                break;
            case "quitar":
                System.out.println("Entro al quitar");
                int id_quitar= Integer.parseInt(request.getParameter("id_materia"));
                for (int i=0;i<cursosSeleccionados.size();i++){
                    if(cursosSeleccionados.get(i).getId_materia()==id_quitar){
                        cursosSeleccionados.remove(i);
                        i=cursosSeleccionados.size();
                    }
                }
                for (TablaSeleccion cursosSeleccionado : cursosSeleccionados) {
                    System.out.println(cursosSeleccionado.toString());

                }
                //request.setAttribute("alumno",alumno);
                request.getRequestDispatcher("ServletSeleccionCursos?menu=cursos&accion=listar").forward(request, response);
                break;
            case "Guardar":
                System.out.println("Ingreso a la opcion de Guardar las materias seleccionadas del alumno");
                id_alumno=request.getParameter("id_alumno");
                System.out.println(id_alumno+"Id del alumno ");
                AtomicBoolean exito= new AtomicBoolean(false);
                cursosSeleccionados.forEach(n->{
                    MateriaAlumnoEntity nueva=new MateriaAlumnoEntity(id_alumno,n.getId_materia());
                    exito.set(materiaAlumnoDao.insert(nueva));
                    materiasEntity=materiasDao.getMateriaById(nueva.getIdMateria());
                    int cupo=materiasEntity.getCupoAct();
                    materiasEntity.setCupoAct(cupo-1);
                    materiasDao.UpdateCupo(materiasEntity);
                });
                if(exito.get() ==true){
                    System.out.println("Listooo");
                    request.getRequestDispatcher("views/Notificacion..jsp").forward(request, response);

                }
                else
                    request.getRequestDispatcher("ServletSeleccionCursos?menu=cursos&accion=listar").forward(request, response);


                break;

        }

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
                alumno=(AlumnosEntity) request.getAttribute("alumno");
                System.out.println(alumno.getMatricula()+" "+alumno.getClaveCarrera());
                id_carrera =alumno.getClaveCarrera();
                id_semestre =alumno.getSemestre();
                id_alumno=alumno.getMatricula();
                lista= tablaSeleccionDao.horario(id_carrera, id_semestre);
                lista.forEach(n->{
                    System.out.println(n.toString());
                });
                request.setAttribute("horario", lista);
                request.getRequestDispatcher("views/MuestreodeCursos.jsp").forward(request, response);
                break;
            case "agregar":
                System.out.println("Ingreso a la opcion de agregar");
                System.out.println(request.getParameter("id_materia"));
                break;

        }

    }
}
