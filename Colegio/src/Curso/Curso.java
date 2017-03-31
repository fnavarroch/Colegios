/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Curso;

public class Curso//Segung Ingreso De Cursos
  {
  	 private String codigoCurso;
  	 private String nombreCurso;
  	 private String rutProfJefe;
	 private Alumno Alumnos[];
	 private Hora Horas[];
  	 public Curso(String codigoCurso, String nombreCurso, String rutProfJefe, Alumno[] alumnos) {
		super();
		this.codigoCurso = codigoCurso;
		this.nombreCurso = nombreCurso;
		this.rutProfJefe = rutProfJefe;
		Alumnos = alumnos;
	}
  	   	 /*public void IngDeCurso()
  	   {
  	   	  System.out.println ("=============================");
  	   	  System.out.println ("Ingrese El Codigo Del Curso");
  	   	  this.setCodigoCurso(Lectura.Cadena());
  	   	  System.out.println ("Ingrese El Nombre Del Curso");
  	   	  this.setNombreCurso(Lectura.Cadena());
  	   	  //this.ElDocente=new Docente();
  	   	 /* System.out.println ("Ingrese Los Datos Del Docente Designado A Este Curso");
  	   	  this.ElDocente.IngDeDocente();
  	      System.out.println ("************************************");  */


	public String getCodigoCurso() {
		return codigoCurso;
	}

	public void setCodigoCurso(String codigoCurso) {
		this.codigoCurso = codigoCurso;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public String getRutProfJefe() {
		return rutProfJefe;
	}

	public void setRutProfJefe(String rutProfJefe) {
		this.rutProfJefe = rutProfJefe;
	}

	public Alumno[] getAlumnos() {
		return Alumnos;
	}

	public void setAlumnos(Alumno[] alumnos) {
		Alumnos = alumnos;
	}

	
  	   
  }