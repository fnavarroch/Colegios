package Colegios;
import Curso.ListaCurso;
import Docente.ListaDocente;
import java.io.*;

public class Colegio {

    public static void eliminarColegio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	private String nombreColegio;
	private String direccion;
	private int codigoColegio;
	private ListaDocente Docentes;
	private ListaCurso Cursos;
	//constructor
	public Colegio(String nomColegio,String direcc,int codColegio)
	{
		nombreColegio=nomColegio;
		direccion=direcc;
		codigoColegio=codColegio;
		Docentes=new ListaDocente();
		Cursos=new ListaCurso();
	
	}

    public Colegio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
	
	public static void agregarColegio(Colegio colegio) {
            colegio.setNombreColegio(colegio.nombreColegio);
            colegio.setDireccion(colegio.direccion);
            colegio.setCodigoColegio(colegio.codigoColegio);
        }
	public Colegio mostrarColegio(){
		Colegio nuevo= new Colegio(null,null,-1);
		nuevo.nombreColegio =getNombreColegio();
		nuevo.direccion=getDireccion();
		nuevo.codigoColegio=getCodigoColegio();
		
		return nuevo;
		
	}
        public boolean comprobarDatos(){
            if(this.codigoColegio == -1 && this.direccion == null && this.nombreColegio == null )
            {
                return false;
            }
            else
            {
                return true;
            }
        }
	public void personas(){
		BufferedReader lector = new BufferedReader (new InputStreamReader(System.in));
		int telefono;
		String nombre, rut, direccion;
	}
	
}
