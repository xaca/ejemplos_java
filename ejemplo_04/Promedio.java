public class Promedio{
	public static void main(String[] args) 
	{
		float resultado, dato1 = 2;
		int dato2 = 4;
		byte dato3 = 127;
		short dato4 = 456;
		char dato5 = 6;

		resultado = (dato1+dato2+dato3+dato4+dato5)/5;

		//System.out.println("El resultado es "+resultado);

		/* Como imprimir los valores de las variables en un nuevo reglon
		y por ultimo el resultado*/

		System.out.println();
		System.out.print("float "+dato1);		
		System.out.print(" int "+dato2);		
		System.out.print(" byte "+dato3);		
		System.out.print(" short "+dato4);		
		System.out.print(" char "+dato5);
		System.out.println();
		System.out.println("El resultado es "+resultado);
		System.out.println();
		System.out.println("float "+dato1);		
		System.out.println("int "+dato2);		
		System.out.println("byte "+dato3);		
		System.out.println("short "+dato4);		
		System.out.println("char "+dato5);
		System.out.println("El resultado es "+resultado);
		System.out.println();
		/* Como imprimir los valores de las variables en el mismo reglon
		y por ultimo el resultado */

	}
}