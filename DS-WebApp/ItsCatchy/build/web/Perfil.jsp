<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>document</title>
    <link rel="stylesheet" href="bootstrap-3.3.4-dist/bootstrap-3.3.4-dist/css/bootstrap.min.css">

    <link rel="stylesheet" href="css/style.css">

</head>
<body>
   <nav class="navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
	  <a class="navbar-brand" href="#">
	  <img src="img/logoNavbar.png" width="48" height="48" style="max-width:100px; margin-top: -14px;">
	  </a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li><a href="Main.jsp">Inicio <span class="sr-only">(current)</span></a></li>
        <li class="active"><a href="Perfil.jsp">Perfil</a></li>
        
      </ul>
   
      <ul class="nav navbar-nav navbar-right">
           <form class="navbar-form navbar-left" role="search">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Buscar...">
        </div>
        <button type="submit" class="btn btn-default">Buscar</button>
      </form>
	  <li><a href="Login.jsp">Salir</a></li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
<!----------------------------------------------fin del nav bar------------------------------------------->
<div class="row">
    <div class="section">
        <div class="col-md-3"> 
        <div class="container-fluid">
		<div class="perfil"><img src="http://placehold.it/150x100" alt="">
		</div><p>Nombre</p><p>correo@correo.com</p>
		</div>
		        <div class="container-fluid separacion">
		<div class="perfil">
		<p>Contactos</p>
		<img src="http://placehold.it/150x100" alt="">
		</div>
		</div>
		</div>       
        
        <div class="col-md-8">
        <div class="container-fluid" id="derecha">
        <div class="container-fluid" id="publicate"><div class="input-group">
      <input type="text" class="form-control" placeholder="Publicar...">
      <span class="input-group-btn">
        <button class="btn btn-foto" type="button"><span class="glyphicon glyphicon-camera"></span></button>
      </span>
    </div><!-- /input-group --></div>
     <div class="scroll">
      <div class="panel panel-warning">
  <div class="panel-heading">
    <h3 class="panel-title">Tus Publicaciones</h3>
  </div>
  <div class="panel-body">
      <p>Nombre Foto</p>
    <img src="http://placehold.it/800x300" alt=""><br><p>Hashtags/ comentarios</p>
     <img src="http://placehold.it/800x300" alt=""><br><p>nombre foto</p>
      <img src="http://placehold.it/800x300" alt=""><br>
  </div>
         </div> </div></div></div>
       
    </div>

</div>
</body>
</html>