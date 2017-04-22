package proyecto;

import java.util.Scanner;

public class BuclesEasy {

	public static void main(String[] args) {
		
int min = 5;
int usu=0;

Scanner tec= new Scanner(System.in);
System.out.print("Dame un buen numero para comparar! \n Dame:");
 usu= tec.nextInt();



if (usu > min){
	System.out.println("El numero es mayor!");
	
}else
	System.out.println("Es mas pequeño!!!!");

	}

}
