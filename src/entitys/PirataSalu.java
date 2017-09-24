package entitys;

public class PirataSalu extends PirataEstado {
	private int grog;

	public PirataSalu() {
		super();
		this.ataque = 5;
		this.defensa = 2;
		this.grog = 0;
	}

	public PirataEstado bebe(String bebida) {
		if (bebida.equals("grog")) {
			if (grog < 3) {
				grog++;
				return this;
			} else
				return new PirataEscorbuto();
		} else if (bebida.equals("jugo"))
			return new PirataHyper();
		return this;
	}

}
