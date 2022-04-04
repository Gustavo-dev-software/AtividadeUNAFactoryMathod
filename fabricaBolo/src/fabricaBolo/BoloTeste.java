package fabricaBolo;

import fabricaBolo.BoloFactory.Tipo;

public class BoloTeste {

	public static void main(String[] args) {
		BoloFactory boloFactory = new BoloFactory();
		Bolo bolo1 = boloFactory.getBolo(Tipo.FLORESTANEGRA);
		bolo1.sobreBolo();
		bolo1.receita();
		Bolo bolo2 = boloFactory.getBolo(Tipo.ABACAXI);
		bolo2.sobreBolo();
		bolo2.receita();
	}
}
