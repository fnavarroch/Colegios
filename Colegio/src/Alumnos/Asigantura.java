package Alumnos;
//import Docente;
public class Asigantura {
 private String nombreAsignatra;
 private Nota notas[];
 private String profesor;
 
public Asigantura(String nombreAsignatra, Nota[] notas, String profesor) {
	this.nombreAsignatra = nombreAsignatra;
	this.notas = notas;
	this.profesor = profesor;
}
public String getNombreAsignatra() {
	return nombreAsignatra;
}
public void setNombreAsignatra(String nombreAsignatra) {
	this.nombreAsignatra = nombreAsignatra;
}
public Nota[] getNotas() {
	return notas;
}
public void setNotas(Nota[] notas) {
	this.notas = notas;
}
public String getProfesor() {
	return profesor;
}
public void setProfesor(String profesor) {
	this.profesor = profesor;
}
 

 
}