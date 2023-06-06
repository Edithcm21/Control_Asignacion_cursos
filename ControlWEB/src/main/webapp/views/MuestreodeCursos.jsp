<%--
  Created by IntelliJ IDEA.
  User: edith
  Date: 31/05/2023
  Time: 05:04 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cursos</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <style>
        .small-text {
            font-size: 13px;
        }

        .small-text10 {
            font-size: 7px;
        }
        .tabla-seleccion {
            background-color: #24AD19;
            color: #ffffff;
        }
    </style>



</head>
<body>
<section class="h-100 gradient-form px-0 py-0" style="background-color: #FFFFFF;">
    <div class="container-fluid px-0 py-0">
        <div class="row">
            <div class="col-lg-12 bg-primary d-flex justify-content-center " >
                <div class="p-0 ">
                    <img src="./Images/MiUV.png" alt="Regresar" >

                </div>
            </div>
        </div>
        <div class="row">

            <div class="col-lg-2 d-flex justify-content-start">
                <div class="p-0">
                    <br><br>
                    <a href="./index.jsp" > <img src="./Images/regresar.png " class="img-fluid"></a>

                </div>

            </div>
            <div class="col-lg-8">
                <div class="row g-0">
                    <h3>Materias seleccionadas:</h3>
                    <table class="table table-striped small-text10">
                        <thead>
                        <tr class="tabla-seleccion">

                            <th scope="col">NRC</th>
                            <th scope="col">ACADÉMICO</th>
                            <th scope="col">MODALIDAD</th>
                            <th scope="col">CUPO</th>
                            <th scope="col">LUN</th>
                            <th scope="col">MAR</th>
                            <th scope="col">MIE</th>
                            <th scope="col">JUE</th>
                            <th scope="col">VIE</th>
                            <th scope="col">Acciones</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <th scope="row">1</th>
                            <td>Mark</td>
                            <td>Otto</td>
                            <td>@mdo</td>
                            <th scope="row">1</th>
                            <td>Mark</td>
                            <td>Otto</td>
                            <td>@mdo</td>
                            <td>xx</td>
                            <td>Botones</td>
                        </tr>

                        </tbody>
                    </table>
                </div>

                <div class="row g-0 flex-content justify-content-center align-items-center">
                    <table class="w-100">
                        <tr>
                            <td></td>
                        </tr>
                        <tr >
                            <th scope="col" class="">
                            <td class="  small-text text-end" >Créditos máximos por periodoss</td>
                            <td class="  col-.4 bg-danger  small-text" >70</td>
                            <td class="  small-text text-end" >Créditos mínimos por periodo</td>
                            <td class=" col-.4 bg-danger small-text" > 30</td>
                            <td class="  small-text text-end" >Periodos estándar del programa</td>
                            <td class=" col-.4 bg-danger small-text" >09</td>
                            </th>
                        </tr>
                        <tr>
                            <td></td>
                        </tr>
                        <br><br>
                    </table>
                    <br><br><br><br>
                </div>

                <div class="row g-0 ">

                    <br><br>
                    <h3>Selecciona materias:</h3>
                    <table class="table table-striped small-text10">
                        <thead>
                        <tr class="tabla-seleccion">

                            <th scope="col">NRC</th>
                            <th scope="col">MATERIA</th>
                            <th scope="col">ACADÉMICO</th>
                            <th scope="col">CUPO</th>
                            <th scope="col">LUN</th>
                            <th scope="col">MAR</th>
                            <th scope="col">MIE</th>
                            <th scope="col">JUE</th>
                            <th scope="col">VIE</th>
                            <th scope="col">Acciones</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <th scope="row">1</th>
                            <td>Mark</td>
                            <td>Otto</td>
                            <td>@mdo</td>
                            <td>xx</td>
                            <td>xx</td>
                            <td>Mark</td>
                            <td>@mdo</td>
                            <td>xx</td>
                            <td><button type="submit" class="btn btn-outline-success"  style="font-size: 7px;">Agregar</button></td>
                        </tr>

                        </tbody>
                    </table>



                </div>

            </div>

            <div class="col-lg-2 d-flex justify-content-start">
                <div class="p-0">
                    <a href="./index.jsp" > <img src="./Images/cerrar.png " class="img-fluid" width="30%"></a>
                    <br><br>
                    <img src="./Images/perfil.png " class="img-fluid" width="30%">

                </div>

            </div>
        </div>


    </div>

</section>

</body>
</html>
