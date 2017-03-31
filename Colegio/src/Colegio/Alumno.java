
/**package Colegio;

public class Alumno extends Persona
  {
  	 private String Codigo;
  	 protected int NumCur1;
  	 private Curso []MisCursos1;
  	 protected Alumno()
  	   {
  	   	  super();
  	   	  this.Codigo="Sin Codigo";
  	   	  this.NumCur1=0;
  	   	  this.MisCursos1=new Curso[12];
  	   }
  	 protected Alumno(String C,int N,Curso[]No,String Nom,String A)
  	   {
  	   	  super(Nom,A);
  	   	  this.Codigo=C;
  	   	  this.NumCur1=N;
  	   	  this.MisCursos1=No;
  	   }  
  	 protected void setCodigo(String C)
  	   {
  	   	  this.Codigo=C;
  	   }  
  	 protected void setNumCur1(int N)
  	   {
  	   	  this.NumCur1=N;
  	   }  
  	 
  	 protected void setMisCursos1(Curso[]C)
  	   {
  	   	  this.MisCursos1=C;
  	   }  
  	 protected String getCodigo()
  	   {
  	   	  return this.Codigo;
  	   }  
  	 protected int getNumCur1()
  	   {
  	   	  return this.NumCur1;
  	   }  
  	 protected Curso[] getMisCursos1()
  	   {
  	   	  return this.MisCursos1;
  	   }
  	 protected void IngCursos(Curso A)
  	   {
  	   	     	 this.MisCursos1[this.NumCur1]=new Curso();
  	   	     	 this.MisCursos1[this.NumCur1]=A;
  	   	     	 this.NumCur1++;
  	   }   
  	 protected void IngDeDatos()
  	   {
  	   	  System.out.println ("Ingreso De Datos Del Alumno");
  	   	  System.out.println ("=============================");
  	   	  System.out.println ("Ingrese Nombre");
  	   	  super.setNombre(Lectura.Cadena());
  	   	  System.out.println ("Ingrese Apellidos");
  	   	  super.setApellidos(Lectura.Cadena());
  	   	  System.out.println ("Ingrese El Codigo De Alumno");
  	   	  this.setCodigo(Lectura.Cadena());
  	   }     
  }
  * */