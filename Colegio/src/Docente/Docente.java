package Docente;

public class Docente//Primer caso  Crear Docente
  {
	private String nombreDocente;
	private String rut;
	private int telefono;
	private String direccion;
	private String asignatura;
	private String codJefatura;
	private String id;
	public Docente(String nombreDocente, String rut, int telefono, String direccion, String asignatura,
			String codJefatura, String id) {
		
		this.nombreDocente = nombreDocente;
		this.rut = rut;
		this.telefono = telefono;
		this.direccion = direccion;
		this.asignatura = asignatura;
		this.codJefatura = codJefatura;
		this.id = id;
	}
	public String getNombreDocente() {
		return nombreDocente;
	}
	public void setNombreDocente(String nombreDocente) {
		this.nombreDocente = nombreDocente;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	public String getCodJefatura() {
		return codJefatura;
	}
	public void setCodJefatura(String codJefatura) {
		this.codJefatura = codJefatura;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	/*public void IngDeDocente()
  	   {
  	   	  System.out.println ("Ingrese Nombre Del Docente");
  	   	  super.setNombre(Lectura.Cadena());
  	   	  System.out.println ("Ingrese Apèllidos Del Docente");
  	   	  super.setApellidos(Lectura.Cadena());
  	   	  System.out.println ("Ingrese Codigo Del Docente");
  	   	  this.setCodigoDoc(Lectura.Cadena());
  	   	  System.out.println ("Ingrese La Facultad Del Docente");
  	   	  this.setFacultad(Lectura.Cadena());
  	   	  System.out.println ("Ingrese El Departamento Del Del Docente");
  	   	  this.setDepartamento(Lectura.Cadena());
  	   }  */
  }