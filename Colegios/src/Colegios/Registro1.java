package Colegios;

import Curso.Curso;
import Docente.Docente;

public class Registro1 extends Alumno
  {
  	 private Alumno []AlumNuev;
  	 private int NumAlum;
  	 private int NumCur;
  	 private Docente []MisDocentes;
  	 private int NumDoc;
  	 private Curso []MisCursos;
  	 
  	 Registro1()
  	   {
  	   	  super();
  	   	  this.AlumNuev=new Alumno[100];
  	   	  this.NumAlum=0;
  	   	  this.MisCursos=new Curso[12];
  	   	  this.NumCur=0;
  	   	  this.MisDocentes=new Docente[10];
  	   	  this.NumDoc=0;
  	   }
  	 Registro1(Alumno[] A, int N)
  	   {
  	   	  this.AlumNuev=A;
  	   	  this.NumAlum=N;
  	   }
  	 public void IngDeDocentes()
  	   {
  	   	  System.out.println ("Ingrese El Numero De Docentes");
  	   	  this.NumDoc=Lectura.Entero();
  	   	  for (int i = 0; i<this.NumDoc; i++)
  	   	    {
  	   	      System.out.println ("Ingreso De Datos Del Docente");
  	   	      System.out.println ("===========================");
  	   	      this.MisDocentes[i]=new Docente();
  	   	      this.MisDocentes[i].IngDeDocente();
  	   	      System.out.println ("Docente: "+this.MisDocentes[i].getNomDoc());
  	   	    }  
  	   }  
  	 public void IngCursos()
  	   {
  	      String Cod="sssss";
  	      System.out.println ("Ingreso De Cursos Con Sus Respectivos Docentes");
  	      System.out.println ("-------------------------------------------------");
  	      System.out.println ("Ingrese El Numero De Cursos");
  	      this.NumCur=Lectura.Entero();
  	      for (int i = 0; i<this.NumCur; i++)
  	        {
  	        	this.MisCursos[i]=new Curso();
  	        	this.MisCursos[i].IngDeCurso();
  	        	System.out.println ("Ingrese El Codigo Del Docente A Cargo");
  	            Cod=Lectura.Cadena();
  	        	for (int j = 0; j<this.NumDoc; j++)
  	        	  {
  	        	  	  if(this.MisDocentes[j].getCodigoDoc().equals(Cod))
  	        	  	    {
  	        	  	    	//System.out.println ("Nombre Docente: "+this.MisDocentes[j].getNomDoc());
  	        	  	    	this.MisCursos[i].setElDocente(this.MisDocentes[j]);
  	        	  	    	System.out.println ("Nombre Del Docente :"+this.MisCursos[i].getElDocente().getNomDoc());
  	        	  	    	System.out.println ("Apellidos :"+this.MisCursos[i].getElDocente().getApeDoc());
  	        	  	    	System.out.println ("Facultad :"+this.MisCursos[i].getElDocente().getFacultad());
  	        	  	    }
  	        	  }
  	        	
  	        }
  	   }   
  	    
  	 public void IngAlumnos()  ///Ingresa Datos Del Alumno, Se Relaciona Al Alumno Con loscursos Deseados.
  	   { //Y se Ingresa su respectiva Nota.
  	      char op;
  	      int ap=0;
  	      int Pro=0;
  	      String Cod="  ";
  	      System.out.println ("BIENVENIDOS--Registro De Nuevos Alumnos--");
  	      System.out.println ("==================================");
  	      do
  	        {
  	        	this.AlumNuev[this.NumAlum]=new Alumno();
  	        	this.AlumNuev[this.NumAlum].IngDeDatos();
  	            do
  	             {	
  	        	System.out.println ("Ingrese El Codido Del Curso A Registrar"); 
  	        	Cod=Lectura.Cadena();
  	            for (int i = 0; i<this.NumCur; i++)	  
  	            	 { 
  	            	  if(this.MisCursos[i].getCodigoCurso().equals(Cod))
  	              	    {
  	              	    	System.out.println ("Nombre Del Curso: "+this.MisCursos[i].getNombreCurso());
  	              	    	System.out.println ("Docente: "+this.MisCursos[i].getElDocente().getNomDoc());
  	              	    	System.out.println ("Ingrese Las Notas Obtenidas En El Curso");
  	              	    	Pro=Promedio1();
  	              	    	System.out.println ("Su Promedio Es:_ "+Pro);
  	              	    	///akis sta para un arreglo de notas
  	              	    	
  	              	    	this.MisCursos[i].setNota(/*Lectura.Entero()*/Pro);
  	              	    	this.AlumNuev[this.NumAlum].IngCursos(this.MisCursos[i]);
  	              	        System.out.println ("=============================");
  	              	        System.out.println ("Registrando Curso...");
  	              	    	System.out.println ("Desea Agregar mas cursos mas Cursos Al Alumno [1]Si y [2]No");
  	              	    	do
  	              	    	  {
  	              	    	  	ap=Lectura.Entero();
  	              	    	  }
  	              	    	while(ap!=1&&ap!=2);
  	              	    }
  	             	    
  	              	  } 
  	              }
  	            while(ap!=2); 
  	        	System.out.println ("Desea Agregar Mas Alumnos Al Registro S/N");
  	        	do
  	        	  {
  	        	  	 op=Lectura.CaracterMayuscula();
  	        	  } 
  	        	while(op!='S'&&op!='N'); 
  	        	this.NumAlum++; 
  	        }
  	      while(op!='N');  
  	   } 
  	 private int Buscador(String Cod)
  	   {
  	   	  String N;
  	   	  N=Cod;
  	   	  int Pos=-1;
  	   	  for (int i = 0; i<this.NumAlum; i++)
  	   	    {
  	   	    	if(this.AlumNuev[i].getCodigo().equals(Cod))
  	   	    	  {
  	   	    	  	  Pos=i;
  	   	    	  }
  	   	    }
  	   	  return Pos;  
  	   }
  	 public void Muestra()
  	   {
  	   	  int Ind;
  	   	  String Code;
  	   	  System.out.println ("Ingrese Codigo Del Alumno");
  	   	  Code=Lectura.Cadena();
  	   	  Ind=Buscador(Code);
          if(Ind!=-1)
            {
               System.out.println ("REGISTRO DEL ALUMNO");
               System.out.println ("*********************");
               System.out.println ("Nombre: "+this.AlumNuev[Ind].getNombre());
               System.out.println ("Apellidos: "+this.AlumNuev[Ind].getApellidos());
               System.out.println ("Codigo: "+this.AlumNuev[Ind].getCodigo());
               System.out.println ("Promedio General: "+Promedio(Ind)); 
               System.out.println ("CURSOS QUE LLEVA y DOCENTE ENCARGADO");
               for (int i = 0; i<this.AlumNuev[Ind].getNumCur1(); i++) 
                 {
                 	System.out.println ("["+(i+1)+"]"+this.AlumNuev[Ind].getMisCursos1()[i].getNombreCurso());
                 	System.out.println ("Docente:"+this.AlumNuev[Ind].getMisCursos1()[i].getElDocente().getNomDoc());
                 }  
               System.out.println ("===============================");	
               System.out.println ("\n");
            }
          else
            System.out.println ("El Codigo Del Alumno No Existe");    
  	   }  
  	      
  	 public double Promedio(int Ubi)
  	   { 
  	   	   int U=Ubi;
  	   	   double P=0.0;
  	   	   for (int i = 0; i<this.AlumNuev[Ubi].getNumCur1(); i++)
  	   	     {
  	   	     	//for (int j = 0; j<this.getNumCur1(); j++)
  	   	     	//{
  	   	     	  P=P+this.AlumNuev[Ubi].getMisCursos1()[i].getNota();
  	   	     	//}  
  	   	     } 
  	   	   return P/this.AlumNuev[Ubi].getNumCur1();  
  	   } 
  	 public void MuestraGeneral()
  	   {
  	   	  for (int i = 0; i<this.NumAlum; i++)
  	   	    {
  	   	       System.out.println ("REGISTRO DEL ALUMNO");
               System.out.println ("*********************");
               System.out.println ("Nombre: "+this.AlumNuev[i].getNombre());
               System.out.println ("Codigo: "+this.AlumNuev[i].getCodigo());
               System.out.println ("===============================");
               System.out.println ("\n");
  	   	    }
  	   }  
  	 //para calcular el promedio
  	 public int Promedio1()
  	   {
  	   	  int not=0;
  	   	  int []Nots;
  	   	  int P=0;
  	   	  Nots=new int [12];
  	   	  System.out.println ("Ingrese El Numero de Notas ");
  	   	  not=Lectura.Entero();
  	   	  for (int i = 0; i<not; i++)
  	   	    {
  	   	    	System.out.print ("Nota ["+(i+1)+"]: ");
  	   	    	Nots[i]=Lectura.Entero();
  	   	    }
  	   	  for (int j = 0; j<not; j++)
  	   	    {
  	   	    	P=P+Nots[j];
  	   	    }  
  	   	  return P/not;  
  	   }   
  	   
  }