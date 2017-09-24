package entitys;

public class Pirata {
	private PirataEstado estado;
	private int puntos;

	public Pirata() {
		estado = new PirataSalu();
		puntos = 0;
	}

	public void bebe(String bebida) {
		estado = estado.bebe(bebida);
	}

	public void ataca(Pirata enemigo) {
		puntos = this.estado.ataca(enemigo.estado);
	}

	public int getPuntos() {
		return puntos;
	}
}
