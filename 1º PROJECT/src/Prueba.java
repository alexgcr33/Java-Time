
//PROGRAMA DE PRUEBA 28/03/2017

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ENTEROS
		int a = 3;
		int b = 4;
		int alm = 0;

		// CARACTER
		char m = 'a';

		// CADENAS
		String d = "hola";

		// DECIMALES
		double g = 5.5;

		System.out.println(a + b); // De esta manera podemos sumar las dos
									// directamente.
		System.out.println(b);
		System.out.println(a * g);

		// estructuras basicas.

		/*
		 * if (alm>0){ System.out.println("Hola");
		 * 
		 * 
		 * 
		 * }else{ System.out.println("vaya mierda de variable");
		 * 
		 * 
		 * }
		 */

		/*
		 * for(int i=0; i<11; i++){ System.out.println(i); }
		 */

		/*
		 * int [] numeros = {1,3,5,7,9,11,13,2,4,6,8,10,12,14,16,18,20};
		 * 
		 * for(int i=0; i<numeros.length;i++){ System.out.println(numeros[i]); }
		 */

		String[] palabra = { "patata ", "jamon ", "menguele ", "guille " };

		for (int i = 0; i < palabra.length; i++) {

			System.out.println(palabra[i]);
		}

		System.out.println();
	}

}
