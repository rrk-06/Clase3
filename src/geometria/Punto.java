package geometria;
import geometria.Punto;

public class Punto {
	private double x;
	private double y;
	
	public Punto(double x , double y) {
		this.x = x;
		this.y = y;
	}
	
	
	
	private double getX() {
		return x;
	}



	private void setX(double x) {
		this.x = x;
	}



	private double getY() {
		return y;
	}



	private void setY(double y) {
		this.y = y;
	}

	public boolean estaSobreX() {
		return x == 0 ;
	}
	public boolean estaSobreY() {
		return y == 0 ;
	}
	
	public boolean origen() {
		return estaSobreX() && estaSobreY();
	}

	public double distanciaOrigen(){
		return Math.hypot(x, y);
	}	
	
	public void mover (double enX , double enY) {
		this.x += enX;
		this.y += enY;
	}
	
	@Override
	public String toString() {
		return "x=" + x + " y=" + y;
	}



	public static void main(String[] args) {
		Punto a = new Punto(4,3);
		System.out.println(a.getY());
		System.out.println(a);
		System.out.println(a.estaSobreY());
		System.out.println(a.distanciaOrigen());
		a.mover(5, 5);
		System.out.println(a);
	}
}