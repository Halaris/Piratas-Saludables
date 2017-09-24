package entitys;

public class PirataEscorbuto extends PirataEstado {
	public PirataEscorbuto() {
		super();
		this.ataque = 2;
		this.defensa = 0;
	}

	public PirataEstado bebe(String bebida) {
		if (bebida.equals("jugo"))
			return new PirataSalu();
		return this;
	}

}
