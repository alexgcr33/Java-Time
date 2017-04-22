
public class prinmoto {

	public static void main(String[] args) {
		
		moto motodiego= new moto("7603HBJ","SUZUKI", "Civ95",225 , 2010, 52.8, 'U', true, true );
		moto motoalex= new moto("7603ZZZ","BMW", "Amr" ,250 , 2015, 60.8, 'A', true, true );
		moto motovaros= new moto("7603ABJ","Telepizza", "J&Q",125 , 2012, 32.8, 'U', true, true );
		
		System.out.println(motodiego.getAnio());
		
		//cuando son booleanos se pone is y no get
		System.out.println(motodiego.isItv());
		
		
	}
}
