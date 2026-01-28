package model;

import java.time.LocalDate;
import java.util.Objects;

public class Alumno {
	private int nia;
	private String nombre, apellidos, genero, ciclo, curso;
	private LocalDate fecha_nacimiento;
	private Grupo grupo_al;
	
	public Alumno() {
		
	}
	public Alumno(int nia, String nombre, String apellidos, String genero, String ciclo, String curso, Grupo gr, LocalDate fecha) {
		this.nia = nia;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.genero = genero;
		this.ciclo = ciclo;
		this.curso = curso;
		this.grupo_al = gr;
		this.fecha_nacimiento=fecha;
		
		
	}
	public int getNia() {
		return nia;
	}
	public void setNia(int nia) {
		this.nia = nia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCiclo() {
		return ciclo;
	}
	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	
	public Grupo getGrupo_al() {
		return grupo_al;
	}
	public void setGrupo_al(Grupo grupo_al) {
		this.grupo_al = grupo_al;
	}
	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
//	public String convertirFechaSQL() {
//		return this.getFecha_nacimiento().getYear()+"-"+this.getFecha_nacimiento().getMonthValue()+"-"+this.getFecha_nacimiento().getDayOfMonth();
//	}
	
	@Override
	public int hashCode() {
		return Objects.hash(apellidos, ciclo, curso, fecha_nacimiento, genero, grupo_al, nia, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(ciclo, other.ciclo)
				&& Objects.equals(curso, other.curso) && Objects.equals(fecha_nacimiento, other.fecha_nacimiento)
				&& Objects.equals(genero, other.genero) && Objects.equals(grupo_al, other.grupo_al) && nia == other.nia
				&& Objects.equals(nombre, other.nombre);
	}
	@Override
	public String toString() {
		return "Alumno [nia=" + nia + ", nombre=" + nombre + ", apellidos=" + apellidos + ", genero=" + genero
				+ ", ciclo=" + ciclo + ", curso=" + curso + ", grupo=" + grupo_al + ", fecha_nacimiento="
				+ fecha_nacimiento + "]";
	}
	
	
	
}
