package fabricaBolo;

public class Prestigio extends Bolo{

	@Override
	public void receita() {
		System.out.println("Receita Prestigio");
	}
	public Prestigio() {
		setNome("Prestigio");
		setPreco(44.89f);
	}
}
