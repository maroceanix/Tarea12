package model;

public class Grupo {
	private int group_id;
	private String nombre_grupo;
	
	Grupo(){}
	Grupo(int id, String nombre_gr){
		this.group_id=id;
		this.nombre_grupo=nombre_gr;
	}
	public int getGroup_id() {
		return group_id;
	}
	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}
	public String getNombre_grupo() {
		return nombre_grupo;
	}
	public void setNombre_grupo(String nombre_grupo) {
		this.nombre_grupo = nombre_grupo;
	}
	@Override
	public String toString() {
		return "Grupo [group_id=" + group_id + ", nombre_grupo=" + nombre_grupo + "]";
	}
	
	
}
