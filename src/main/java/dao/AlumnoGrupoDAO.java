package dao;

import java.util.List;

import model.Alumno;
import model.Grupo;

public interface AlumnoGrupoDAO {
	
	int alumno_add(Alumno al);
	
	Alumno getByNia (int nia);
	
	List <Alumno> getAllAlumnos(); //datos del alumno y de su grupo
	
	int grupo_add(Grupo gr);
	
	void delete_alumno(int nia);
	
	void delete_alumnos_curso(int nia); //borrar los alumnos de un curso entero
	
}
