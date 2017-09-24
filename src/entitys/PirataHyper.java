package entitys;

public class PirataHyper extends PirataEstado {
	public PirataHyper() {
		super();
		this.ataque = 10;
		this.defensa = -2;
	}

	public PirataEstado bebe(String bebida) {
		if (bebida.equals("grog")) {
			return new PirataSalu();
		}
		return this;
	}

}
