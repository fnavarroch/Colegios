package Curso;
import Docente.ListaDocente;
public class Hora {
	private String rutProfesor;
	private String idProfesor;
	private int[][] horaios;
	private ListaDocente Docentes;
	private ListaCurso Cursos;
	public Hora(String rutProfesor, String idProfesor, int[][] horaios, ListaDocente docentes, ListaCurso cursos) {
		this.rutProfesor = rutProfesor;
		this.idProfesor = idProfesor;
		this.horaios = horaios;
		Docentes = docentes;
		Cursos = cursos;
	}
	public String getRutProfesor() {
		return rutProfesor;
	}
	public void setRutProfesor(String rutProfesor) {
		this.rutProfesor = rutProfesor;
	}
	public String getIdProfesor() {
		return idProfesor;
	}
	public void setIdProfesor(String idProfesor) {
		this.idProfesor = idProfesor;
	}
	public int[][] getHoraios() {
		return horaios;
	}
	public void setHoraios(int[][] horaios) {
		this.horaios = horaios;
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
	
	

}
