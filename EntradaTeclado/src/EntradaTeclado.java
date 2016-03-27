import java.util.InputMismatchException;
import java.util.Scanner;


public class EntradaTeclado 
{
	/**INICIALIZAR LA PEDIDA POR TECLADO*/
	private static Scanner entrada;
	static
	{
		entrada=new Scanner(System.in);
	}

	/**METODO PARA PEDIR UNA CADENA POR TECLADO*/
	public static String pedirString(String mensaje)
	{
		String cadena;
		
		System.out.println(mensaje);
		
		cadena=entrada.nextLine();

		return cadena;
	}
	/**METODO PARA PEDIR UN NUMERO ENTERO POR TECLADO*/
	public static int pedirEntero(String mensaje)
	{
		int num=0;
		boolean salir;
		
		do
		{
			salir=true;
			
			System.out.println(mensaje);
			
			try
			{
				num=entrada.nextInt();
			}
			catch(InputMismatchException e)
			{
				salir=false;
				System.err.println("Ha habido un error en la entrada por teclado, inténtelo de nuevo.");;
			}
			finally
			{
				entrada.nextLine();
			}
		}
		while(salir==false);

		return num;
	}
	/**METODO PARA PEDIR UN NUMERO CON DECIMALES POR TECLADO*/
	public static float pedirFloat(String mensaje)
	{
		float num=0;
		boolean salir;
		
		do
		{
			salir=true;
			
			System.out.println(mensaje);
			
			try
			{
				num=entrada.nextFloat();
			}
			catch(InputMismatchException e)
			{
				salir=false;
				System.err.println("Ha habido un error en la entrada por teclado, inténtelo de nuevo.");
			}
			finally
			{
				entrada.nextLine();
			}
		}
		while(salir==false);

		return num;
	}

	public static double pedirDouble(String mensaje)
	{
		double num=0;
		boolean salir;
		
		do
		{
			salir=true;
			
			System.out.println(mensaje);
			
			try
			{
				num=entrada.nextDouble();
			}
			catch(InputMismatchException e)
			{
				salir=false;
				System.err.println("Ha habido un error en la entrada por teclado, inténtelo de nuevo.");
			}
			finally
			{
				entrada.nextLine();
			}
		}
		while(salir==false);

		return num;
	}

	public static char pedirChar(String mensaje)
	{
		char carac = 0;
		String cad;
		boolean salir;
		
		do
		{
			System.out.println(mensaje);
			
			cad=entrada.nextLine();
			if(cad.length()!=1)
			{
				salir=false;
				System.err.println("Ha habido un error en la entrada por teclado, inténtelo de nuevo.");
			}
			else
			{
				salir=true;
				carac=cad.charAt(0);
			}
		}
		while(salir==false);

		return carac;
	}

	public static long pedirLong(String mensaje)
	{
		long num=0;
		boolean salir;
		
		do
		{
			System.out.println(mensaje);
			
			salir=true;
			try
			{
				num=entrada.nextLong();
			}
			catch(InputMismatchException e)
			{
				salir=false;
				System.err.println("Ha habido un error en la entrada por teclado, inténtelo de nuevo.");
			}
			finally
			{
				entrada.nextLine();
			}
		}
		while(salir==false);

		return num;
	}
}
