package app;

import java.util.List;

import model.Alumno;
import model.Grupo;

public interface Conversor {
	List<Alumno> documentAlumnoToList(String ruta);
	
	List<Grupo>	documentGrupoToList(String ruta);
	
	void listToDocumentAlumnos (List <Alumno> lista);
	
	void listToDocumentGrupos (List <Grupo> lista);
}
