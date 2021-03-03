public class Ecuacion{
	public static void main(String[] args) {
		//float a,b,c,d,x; //Declaración
		byte y = 2, z = 5;
		//int int; //int es una palabra reservada
		//x = 0.0F; //Inicialización, literal flotante, por eso la F
		/*
		a = 1;
		b = 3*y+(1/(2+(3*z)));
		c = 1/(1+(y*y));
		d = 1 + (1/((z*z*z)+z));
		x = (a/b) + (c/d);//Cuando se asigna un valor a un float, no se pone F, ya que la operación se espera que sea un flotante
		*/

		//Nan - Not a number, Infinity - infinito

		float resultado=0;
		float a = 1F/(3F*y);
		System.out.println("a "+a);
		float b = 1F/(2+(3*z));
		System.out.println("b "+b);
		float c = 1F/(1+(y*y));
		System.out.println("c "+c);
		float d = 1+(1F/((z*z*z)+z));
		System.out.println("d "+d);

		resultado = (a/b) + (c/d);

		System.out.println("Su Respuesta es: "+resultado);
		//System.out.println("x="+x);
	}
}