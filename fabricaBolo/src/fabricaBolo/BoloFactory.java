package fabricaBolo;

public class BoloFactory implements BoloInterface {
	public enum Tipo{
		FLORESTANEGRA, ABACAXI, CHOCONINHO, PRESTIGIO;
	}
	public Bolo getBolo(Tipo t) {
		Bolo b = null;
		switch(t) {
		case FLORESTANEGRA:
			b = new FlorestaNegra();
			break;
		case ABACAXI:
			b = new Abacaxi();
			break;
		case CHOCONINHO:
			b = new Choconinho();
			break;
		case PRESTIGIO:
			b = new Prestigio();
			break;
		}
		return b;
	}
}
