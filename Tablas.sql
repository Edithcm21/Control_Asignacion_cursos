

create table  if not exists Tipo_Mat(
	ID_Tipo serial primary key not null,
	Descripcion varchar(30)
 );
 
 create table  if not exists Semestre(
	Codigo serial primary key not null,
	Num_Semestre varchar(30)
 );


  create table  if not exists Tipo_Contrato(
	Id_TipoC serial primary key not null,
	Descripcion varchar(30)
 );
 
   create table  if not exists Tipo_Estudios(
	id_tipo serial primary key not null,
	NombreTE varchar(30)
 );
 
 create type Estudios_Realizados as(
	 Universidad varchar(50),
	 Titulo varchar(50),
	 ano_Graduacion varchar(4)
 
 );
 
  
  create table  if not exists Carrera(
	id_Car serial primary key not null,
	NombreC varchar(30)
 );

 create table  if not exists Profesores(
	Curp varchar(18) primary key not null,
	Nombre varchar(15),
	ApellidoP varchar(15),
	ApellidoM varchar(15),
	Direccion varchar(60),
	Telefono varchar(12),
	Celular varchar(12),
	Tipo_Contrato int,
	Fecha_Nac date,
	--Estudios Realizados
	 Universidad varchar(50),
	 Titulo varchar(50),
	 ano_Graduacion varchar(4),
	Tipo_Estudios int,
	E_mail varchar(40),
	foreign key (Tipo_Contrato) references Tipo_Contrato(Id_TipoC),
	foreign key (Tipo_Estudios) references Tipo_Estudios(Id_Tipo)	 
 );


 alter table profesores add column materias_puede varchar(200)
 alter table profesores add column nombrep varchar(20)
 alter table profesores drop column nombre


 
 
  create table  if not exists Cursos(
	NRC varchar(8) primary key not null,
	clave_carrera int
	Semestre int,
	Tutor varchar(18),
	nombre varchar(20),
	foreign key (Semestre) references Semestre(Codigo),
	foreign key (Tutor) references Profesores(curp),
	 foreign key (Clave_Carrera) references Carrera(id_Car)
	
	  
 );

  
 create table  if not exists Materias(
	Codigo serial primary key not null,
	Nombre varchar(50),
	Creditos int,
	Num_Horas int,
	Tipo_Materia int,
	Requisitos varchar(500),
	id_curso int, 
	cupo_min int,
	cupo_act int,
	cupo_max int,
	
	foreign key (id_curso) references Cursos(nrc),
	foreign key (Tipo_Materia) references Tipo_Mat(ID_Tipo) 
 );
 
  create table mat_profesor(
	idxx serial primary key not null,
	id_profesor varchar(18),
	id_materia int,
	foreign key (id_profesor) references Profesores(Curp),
	foreign key (id_materia) references Materias(Codigo)
	
 );
drop table mat_puede

create table  if not exists Alumnos(
	Matricula varchar(9) primary key not null,
	password1 varchar(15),
	Semestre int,
	curp varchar(18),
	Clave_Carrera int,
	ApellidoP varchar(20),
	ApellidoM varchar(20),
	Nombre varchar(20),
	FechaNac date,
	cel varchar(12),
	e_mail varchar(40),
	Direccion varchar(60),
	Telefono varchar(12),
	foreign key (Semestre) references Semestre(Codigo),
	foreign key (Clave_Carrera) references Carrera(id_Car)
 );
 
  create table  if not exists Materia_Alumno(
	id_xx serial primary key not null,
	id_Alumno varchar(10) not null,
	id_materia int,
	Calificacion int,
	indicencias varchar(200),
	foreign key (id_Alumno) references Alumnos(Matricula),
	foreign key (id_materia) references Materias(Codigo)
 );
 
 
  create table  if not exists Aula(
	Codigo serial primary key not null,
	Lugar varchar(60),
	Num_Pupitres int
 );
 
 
 
  create table  if not exists Materia_Aula(
	id_xx serial primary key no null,
	id_materia int not null,
	id_salon int,
	dia varchar(10),
	mes varchar(15),
	Hora_inicio time,
	Hora_final time,
	foreign key (id_materia) references materias(Codigo),
	foreign key (id_salon) references Aula(Codigo)
	  
 );
 
 
 
 
 