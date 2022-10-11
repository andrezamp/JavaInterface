package Exer010203;

public class Cubo extends Figura3D {
	
	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularVolume() {
	
		return (lado*lado*lado);
		//math.pow(lado,3)
	}

	@Override
	public double calcularArea() {
		return 6*(lado*lado);
	}

}
