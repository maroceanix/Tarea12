package dao;

import model.Alumno;

public interface AlumnoDAO {
	int alumno_add(Alumno al);
	
	Alumno getByNia (int nia);
}
