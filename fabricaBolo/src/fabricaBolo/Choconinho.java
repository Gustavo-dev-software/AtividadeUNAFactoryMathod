package fabricaBolo;

public class Choconinho extends Bolo{

	@Override
	public void receita() {
		System.out.println("Receita Choconinho");
	}
	public Choconinho() {
		setNome("Choconinho");
		setPreco(4.78f);
	}
}
