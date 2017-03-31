package Docente;

public class ListaDocente {
	private Docente[] Docentes;
	private int pLibre;
	//private Arraylist <Profesor> listaprofesor  = new listaprofesor<Profesor>;
	
	public ListaDocente()
	{
		Docentes=new Docente[20];
		
	}

	public Docente[] getDocentes() {
		return Docentes;
	}

	public void setDocentes(Docente[] docentes) {
		Docentes = docentes;
	}

	public int getpLibre() {
		return pLibre;
	}

	public void setpLibre(int pLibre) {
		this.pLibre = pLibre;
	}
}
