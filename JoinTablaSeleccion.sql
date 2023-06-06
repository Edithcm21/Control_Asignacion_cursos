select profesores.nombre,materias.nombre, cursos.nombre, cursos.semestre,cursos.clave_carrera, materia_aula.dia, materia_aula.hora_inicio, materia_aula.hora_final from public.mat_profesor
join profesores
on profesores.curp=mat_profesor.id_profesor
join materias
on mat_profesor.id_materia=materias.codigo
join cursos
on cursos.nrc=materias.id_curso
join materia_aula
on materia_aula.id_materia=materias.codigo