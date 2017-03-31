package Alumnos;

public class Alumno {
 private String nombreAlumno;
 private String apellidoAlumno;
 private int edad;
 private String rut;
 private String direccion;
 private int telefono;
 private Asigantura asignaturas[];
public Alumno(String nombreAlumno, String apellidoAlumno, int edad, String rut, String direccion, int telefono,
		Asigantura[] asignaturas) {
	this.nombreAlumno = nombreAlumno;
	this.apellidoAlumno = apellidoAlumno;
	this.edad = edad;
	this.rut = rut;
	this.direccion = direccion;
	this.telefono = telefono;
	this.asignaturas = asignaturas;
}
public String getNombreAlumno() {
	return nombreAlumno;
}
public void setNombreAlumno(String nombreAlumno) {
	this.nombreAlumno = nombreAlumno;
}
public String getApellidoAlumno() {
	return apellidoAlumno;
}
public void setApellidoAlumno(String apellidoAlumno) {
	this.apellidoAlumno = apellidoAlumno;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public String getRut() {
	return rut;
}
public void setRut(String rut) {
	this.rut = rut;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
public int getTelefono() {
	return telefono;
}
public void setTelefono(int telefono) {
	this.telefono = telefono;
}
public Asigantura[] getAsignaturas() {
	return asignaturas;
}
public void setAsignaturas(Asigantura[] asignaturas) {
	this.asignaturas = asignaturas;
}
 
}
