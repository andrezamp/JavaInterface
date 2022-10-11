package Exer010203;

public class Programa {
	public static void main(String[] args) {
		Quadrado q1 = new Quadrado();
		q1.setNome("Quadrado");
		q1.setLado(5);
		q1.setCor("laranja");

		Circulo c1 = new Circulo();
		c1.setNome("Circulo");
		c1.setRaio(4);
		c1.setCor("rosa");

		Triangulo t1 = new Triangulo();
		t1.setNome("Triangulo");
		t1.setAltura(10);
		t1.setBase(6);
		t1.setCor("azul");

		Cubo c2 = new Cubo();
		c2.setNome("Cubo");
		c2.setLado(8);
		c2.setCor("preto");

		Cilindro c3 = new Cilindro();
		c3.setNome("Cilindro");
		c3.setRaio(2);
		c3.setAltura(3);
		c3.setCor("branco");

		Piramide p1 = new Piramide();
		p1.setNome("Piramide");
		p1.setAltura(15);
		p1.setApotema(8);
		p1.setArestaBase(10);
		p1.setBase(q1);

		
		FiguraGeometrica[] figuras = new FiguraGeometrica[6];//upcasting
		figuras[0] = q1;
		figuras[1] = c1;
		figuras[2] = t1;
		figuras[3] = c2;
		figuras[4] = c3;
		figuras[5] = p1;

		for (FiguraGeometrica figura : figuras) {
			System.out.println("================");
			System.out.println(figura.getNome());

			
			//downcasting
			if (figura instanceof Figura2D) {
				Figura2D f2d = (Figura2D) figura;
				System.out.println(f2d.calcularArea());
			}
			if (figura instanceof Figura3D) {
				Figura3D f3d = (Figura3D) figura;
				System.out.println(f3d.calcularArea()); //polimorfismo
				System.out.println(f3d.calcularVolume());
			}
		}
	}
}
