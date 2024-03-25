package repaso;

public class Nota {
	private int ValorNota;
	
	public Nota (int Valor) {
		if (Valor <1 || Valor >10) {
			throw new Error ("Error");
		}else
		{
		ValorNota = Valor;
		}
	}
	
	private void setValorNota(int Valor) {
		if (!esValido(Valor)) {
			throw new Error("Error");
		}
		ValorNota = Valor;
		}
	
	
	
	private boolean esValido(int Valor) {
		return Valor >= 1 && Valor <= 10;
	}
	
	public boolean EstaAprobada() {
		return ValorNota >= 4 ;
	}
	
	public boolean EstaDesaprobada() {
		return !EstaAprobada();
	}

	
	public int ObtenerValor() {
		return ValorNota;
	}
	
	public void Recupera(int NuevaNota) {
		if (NuevaNota > ValorNota) {
			setValorNota(NuevaNota);
		}
	}	
	public static void main(String[] args) {
		Nota c = new Nota(2);
		System.out.println(c.ObtenerValor());
		c.Recupera(9);
		System.out.println(c.EstaAprobada());
		System.out.println(c.ObtenerValor());
		
	}
}
