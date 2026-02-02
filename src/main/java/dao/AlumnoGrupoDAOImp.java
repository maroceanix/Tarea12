package dao;

import java.util.List;

import model.Alumno;
import model.Grupo;

public class AlumnoGrupoDAOImp implements AlumnoGrupoDAO {

	@Override
	public boolean alumno_add(Alumno al) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Alumno getByNia(int nia) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Alumno> getAllAlumnos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean grupo_add(Grupo gr) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete_alumno(int nia) {
		return false;
		
	}

	@Override
	public boolean delete_alumnos_curso(int nia) {
		return false;
		
	}

	@Override
	public List<Grupo> getAllGrupos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean changeGroupFromAlumno() {
		return false;
		
	}

	@Override
	public boolean changeNameFromAlum(int nia) {
		return false;
		
	}

	@Override
	public Grupo getById(int pk) {
		// TODO Auto-generated method stub
		return null;
	}

}
