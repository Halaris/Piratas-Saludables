package entitys;

public abstract class PirataEstado {
	protected int ataque;
	protected int defensa;

	public int ataca(PirataEstado enemigo) {
		return ataque - enemigo.defensa;
	}

	public abstract PirataEstado bebe(String bebida);
}
