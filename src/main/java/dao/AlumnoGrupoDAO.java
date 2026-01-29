package dao;

import model.Alumno;

public interface AlumnoGrupoDAO {
	int alumno_add(Alumno al);
	
	Alumno getByNia (int nia);
}
