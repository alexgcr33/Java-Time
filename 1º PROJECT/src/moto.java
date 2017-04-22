
public class moto {

	String matricula;

	String marca;

	String modelo;

	int cilindrada;

	int anio;

	double capacidad;

	char tipo;
	
	boolean proteccion;

	boolean itv;

	public moto(String matricula, String marca, String modelo, int cilindrada, int anio, double capacidad, char tipo,
			boolean proteccion, boolean itv) {
		
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
		this.anio = anio;
		this.capacidad = capacidad;
		this.tipo = tipo;
		this.proteccion = proteccion;
		this.itv = itv;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public boolean isProteccion() {
		return proteccion;
	}

	public void setProteccion(boolean proteccion) {
		this.proteccion = proteccion;
	}

	public boolean isItv() {
		return itv;
	}

	public void setItv(boolean itv) {
		this.itv = itv;
	}
	
	
	//public static void main(String[] args) {
		
	

	

}
