package Curso;

public class ListaCurso {
	private Curso[] Cursos;
	private int ultCurso;
	
	 public ListaCurso(){
		 Cursos=new Curso[24];
	 }

	public Curso[] getCursos() {
		return Cursos;
	}

	public void setCursos(Curso[] cursos) {
		Cursos = cursos;
	}

	public int getUltCurso() {
		return ultCurso;
	}

	public void setUltCurso(int ultCurso) {
		this.ultCurso = ultCurso;
	}
	

}