
public class arrays {

	public static void main(String[] args) {

		// array bidimensional
		/*
		 * int [][] numeros = { {0,1,2,3}, {4,5,6,7}, {8,9,0,1}, {2,3,4,5} ,
		 * {6,7,8,9} };
		 * 
		 * int longfilas= numeros.length; int longcol= numeros[0].length;
		 * 
		 */

		char[][] palabras = { { 'p', 'a' }, { 't', 'a' }, { 't', 'a' } };

		int longfilas = palabras.length;
		int longcol = palabras[0].length;

		for (int i = 0; i < longfilas; i++) {
			for (int j = 0; j < longcol; j++) {

				System.out.print(palabras[i][j]);

			}
		}

	}

}
