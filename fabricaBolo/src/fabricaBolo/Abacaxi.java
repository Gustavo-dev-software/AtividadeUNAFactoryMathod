package fabricaBolo;

public class Abacaxi extends Bolo{

	@Override
	public void receita() {
		System.out.println("Receita abacaxi");
	}
	public Abacaxi() {
		setNome("Abacaxi");
		setPreco(3.89f);
	}
}
