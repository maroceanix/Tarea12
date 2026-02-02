package dao;

import java.util.List;

import model.Alumno;
import model.Grupo;

public interface AlumnoGrupoDAO {
	
	boolean alumno_add(Alumno al);
	
	Alumno getByNia (int nia); //mostrando primero todos lo alumnos (nia y nombre),  
	
	Grupo getById(int pk);
	
	List <Alumno> getAllAlumnos(); //datos del alumno y de su grupo
	
	List <Grupo> getAllGrupos();
	
	boolean grupo_add(Grupo gr);
	
	boolean delete_alumno(int nia);
	
	boolean delete_alumnos_curso(int nia); //borrar los alumnos de un curso entero
	
	boolean changeGroupFromAlumno();
	
	boolean changeNameFromAlum(int nia);
	
}
