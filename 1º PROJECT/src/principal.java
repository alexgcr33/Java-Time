import javax.management.modelmbean.ModelMBeanOperationInfo;

public class principal {

	public static void main(String[] args) {

		// creando objetos de la clase coche
		//nombreclase nombreobjeto= new  nombreclase(objeto);
		
		coche cochejose= new coche("7603HBJ", "Audi", "A3", "negro", 2533.75, 1900, 1.5, 'd', true, 5); 
		coche cochediego= new coche(" 7609KBB", " Audi", " A4", " blanco", 4033.75, 2500, 1.9, 'd', true, 5); 
		
		
		//crear metodos GET Y SET
		
		//GET nos devuelve el valor de un atributo
		//SET NOS CAMBIA EL VALOR DE UN ATRIBUTO
		
		
		System.out.println(cochejose.getColor());
		System.out.println(cochejose.getCilindrada());
		
		System.out.println("el diego tiene un coche con matricula de : "+cochediego.getMatricula());
		
		System.out.println(cochediego.toString());
		
		
		//
		
	}

}
