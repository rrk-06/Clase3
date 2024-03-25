package geometria;

public class Circulo {
	private double radio;
	private Punto centro;
	
	public Circulo (double radio, double xc , double yc) {
		if (radio <= 0) {
			throw new Error ("radio invalido");
		}
		this.radio = radio;
		this.centro = new Punto(xc,yc);
	}
	
	public void mover(double enX, double enY) {
		centro.mover(enX, enY);
	}
	
	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", centro=" + centro + "]";
	}
	
	public static void main(String[] args) {
		Circulo si = new Circulo(5,2,4);
		System.out.println(si);
	}
}
