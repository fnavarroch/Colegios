package Colegios;
import Curso.ListaCurso;
import Docente.ListaDocente;
import java.io.*;

public class Colegios {
	private String nombreColegio;
	private String direccion;
	private int codigoColegio;
	private ListaDocente Docentes;
	private ListaCurso Cursos;
	//constructor
	public Colegios(String nomColegio,String direcc,int codColegio)
	{
		nombreColegio=nomColegio;
		direccion=direcc;
		codigoColegio=codColegio;
		Docentes=new ListaDocente();
		Cursos=new ListaCurso();
	
	}
	public String getNombreColegio() {
		return nombreColegio;
	}
	public void setNombreColegio(String nombreColegio) {
		this.nombreColegio = nombreColegio;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getCodigoColegio() {
		return codigoColegio;
	}
	public void setCodigoColegio(int codigoColegio) {
		this.codigoColegio = codigoColegio;
	}
	public ListaDocente getDocentes() {
		return Docentes;
	}
	public void setDocentes(ListaDocente docentes) {
		Docentes = docentes;
	}
	public ListaCurso getCursos() {
		return Cursos;
	}
	public void setCursos(ListaCurso cursos) {
		Cursos = cursos;
	}
	
	public void datosColegio(String nombre,String direccion, int codigo){
		
		setNombreColegio(nombre);
		setDireccion(direccion);
		setCodigoColegio (codigo);
		
		
	}
	public Colegios mostrarColegio(){
		Colegios nuevo= new Colegios(null,null,0);
		nuevo.nombreColegio =getNombreColegio();
		nuevo.direccion=getDireccion();
		nuevo.codigoColegio=getCodigoColegio();
		
		return nuevo;
		
	}
	public void personas(){
		BufferedReader lector = new BufferedReader (new InputStreamReader(System.in));
		int telefono;
		String nombre, rut, direccion;
	}
	
}