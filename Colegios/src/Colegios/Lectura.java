import java.io.*;
import java.io.IOException;
public class Lectura
{
	public static String Cadena()
	{
		String CadNum="";
		try
		{
			BufferedReader Teclado = new BufferedReader(new InputStreamReader(System.in));
			CadNum = Teclado.readLine();
		}
		catch(IOException e)
		{
			System.out.println("Error: "+e.getMessage());
		}
		return(CadNum);
	}
	public static short EnteroCorto()
	{
		try
		{
			return(Short.parseShort(Cadena()));
		}
		catch(NumberFormatException e)
		{
			return(Short.MIN_VALUE);
		}
	}
	public static int Entero()
	{
		try
		{
			return(Integer.parseInt(Cadena()));
		}
		catch(NumberFormatException e)
		{
			return(Integer.MIN_VALUE);
		}
	}
	public static long EnteroLargo()
	{
		try
		{
			return(Long.parseLong((Cadena())));
		}
		catch(NumberFormatException e)
		{
			return(Long.MIN_VALUE);
		}
	}
	public static float Real()
	{
		try
		{
			Float NumReal = new Float(Cadena());
			return(NumReal.floatValue());
		}
		catch(NumberFormatException e)
		{
			return(Float.NaN);
		}
	}
	public static double RealLargo()
	{
		try
		{
			Double NumReal = new Double(Cadena());
			return(NumReal.doubleValue());
		}
		catch(NumberFormatException e)
		{
			return(Double.NaN);
		}
	}
	public static char Caracter()
	{
		try
		{
			return(Cadena().charAt(0));
		}
		catch(Exception e)
		{
			return('\0');
		}
		
	}
	public static char CaracterMayuscula()
	{
		try
		{
			String Temp;
			Temp = Cadena().toUpperCase();
			return(Temp.charAt(0));
		}
		catch(Exception e)
		{
			return('\0');
		}
		
	}
}