/**package Colegios;

public class Principal
  {
  	 public static void main(String[]args)
  	   {
  	   	  int op=0;
  	   	  Registro1 Obj=new Registro1();
  	   	  System.out.println ("GESTION ESCOLAR");
  	   	  
  	   	  System.out.println ("=================================");
  	   	  do
  	   	    {
  	   	       System.out.println ("Elije una Opcion:...");
               System.out.println ("[1]Para Ingresar Docentes");
               System.out.println ("[2]Para Ingresar Los Cursos");
  	   	       System.out.println ("[3]Para Ingresar Alumnos");
  	   	       System.out.println ("[4]Para Mostrar Resgitro General");
  	   	       System.out.println ("[5]Para Mostrar Registro Detallado de Un Alumno");
  	   	       System.out.println ("[9]Para Finalizar");
  	   	       
  	   	       do
  	   	         {
  	   	         	op=Lectura.Entero(); 
  	   	         } 
  	   	       while(op!=1&&op!=2&&op!=3&&op!=9&&op!=4&&op!=5);  
  	   	       switch(op)
  	   	         {
  	   	         	case 3: Obj.IngAlumnos();
  	   	         	        break;
  	   	         	case 4: Obj.MuestraGeneral();
  	   	         	        break;
  	   	         	case 5: Obj.Muestra();
  	   	         	        break;
  	   	         	case 2: Obj.IngCursos();
  	   	         	        break;   
  	   	         	case 1: Obj.IngDeDocentes();
  	   	         	        break;             
  	   	         	case 9: System.out.println ("Fin Del Programa");
  	   	         	        break;                        
  	   	         }
  	   	    }
  	   	  while(op!=9);  
  	   }
  }**/