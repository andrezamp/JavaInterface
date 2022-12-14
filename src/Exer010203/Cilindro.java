package Exer010203;

public class Cilindro extends Figura3D {
	
	private double altura;
	private double raio;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calcularVolume() {
		
		return 3.14*(raio*raio)*altura;
	}

	@Override
	public double calcularArea() {
		
		double areaBase = 3.14*(raio*raio);
		double areaLateral = 2* 3.14 * raio*altura;
		double areaTotal = (2*areaBase) + areaLateral;
		return areaTotal;
	}
	
}
