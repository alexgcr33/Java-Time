
//clasecita buena del tito JC tt

public class coche {

	// AÑADIR LOS ATRIBUTOS DE LA CLASE

	String matricula;

	String marca;

	String modelo;

	String color;

	double precio;

	int cilindrada;

	double peso;

	char combustible;
	
	int plazas;

	boolean itv;
	
	//metodo constructor
	
	public coche(String matricula, String marca, String modelo, String color, double precio, int cilindrada,
			double peso, char combustible, boolean itv, int plazas) {
		//super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
		this.cilindrada = cilindrada;
		this.peso = peso;
		this.combustible = combustible;
		
		this.itv = itv;
		this.plazas=plazas;
	}
	
	//metodos get y set

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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public char getCombustible() {
		return combustible;
	}

	public void setCombustible(char combustible) {
		this.combustible = combustible;
	}

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	public boolean isItv() {
		return itv;
	}

	public void setItv(boolean itv) {
		this.itv = itv;
	}

	@Override
	public String toString() {
		return "coche [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color
				+ ", precio=" + precio + ", cilindrada=" + cilindrada + ", peso=" + peso + ", combustible="
				+ combustible + ", plazas=" + plazas + ", itv=" + itv + "]";
	}

	//crear metodo TOString
	
	//metodo de añadir 
	
	//como crear un metodo
	
	public double impues(){
		double preciofinal = 0;
		
		preciofinal= precio* 1.21;
		
		return preciofinal;
		}
	
	
	}
	
	
	
	
	
	

