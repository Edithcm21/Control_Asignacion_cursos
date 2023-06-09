<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<body>
<section class="h-100 gradient-form" style="background-color: #eee;">
    <div class="container py-1 h-100">
        <div class="row d-flex justify-content-center align-items-center h-100">
            <div class="col-xl-10">
                <div class="card rounded-3 text-black">
                    <div class="row g-0">
                        <div class="col-lg-6">
                            <div class="card-body p-md-4 mx-md-4 ">
                                <div class="text-center">
                                    <img src="Images/Flor_con_uv_sin_fondo.png"
                                         style="width: 185px;" alt="logo">
                                    <h3 class="mt-1 mb-3 pb-1">Iniciar Sesion</h3>
                                </div>
                                <form action="ServletLogin" method="post">
                                    <div class="form-outline mb-2">
                                        <label class="form-label" for="email">Correo UV</label>
                                        <input type="text" name="matricula" id="email" class="form-control" minlength="9"/>
                                    </div>

                                    <div class="form-outline mb-2">
                                        <label class="form-label" for="password">Contraseña</label>
                                        <input type="password" name="password" id="password" class="form-control" />
                                    </div>

                                    <div class="text-center pt-1 mb-3 pb-1">
                                        <input type="submit" class="btn btn-primary btn-block fa-lg gradient-custom-2 mb-3" name="accion" value="ingresar">
                                         <a class="text-muted" href="">Forgot password?</a>
                                    </div>

                                </form>
                            </div>
                            </div>
                                <div class="col-lg-6 d-flex justify-content-start " >
                                    <div class="p-0">
                                    <img src="./Images/Captura%20de%20pantalla%202023-05-31%20121109.png" class="img-fluid" >
                                </div>
                            </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
</body>
</html>