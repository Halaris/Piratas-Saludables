package entitys;

import org.junit.Test;

public class testPirata {
	@Test
	public void test() {
		Pirata p1 = new Pirata();
		Pirata p2 = new Pirata();
		p1.bebe("grog");
		p1.bebe("grog");
		p1.bebe("grog");
		p1.bebe("grog");
		p1.bebe("grog");
		p1.ataca(p2);
		System.out.println(p1.getPuntos());
		p2.bebe("jugo");
		p2.ataca(p1);
		System.out.println(p2.getPuntos());
	}

	@Test
	public void test2() {
		Pirata p1 = new Pirata();
		Pirata p2 = new Pirata();
		p1.bebe("grog");
		p1.bebe("grog");
		p1.bebe("grog");
		p1.bebe("grog");
		p1.bebe("grog");
		p1.ataca(p2);
		System.out.println(p1.getPuntos());
		p1.bebe("jugo");
		p2.ataca(p1);
		p1.ataca(p2);
		System.out.println(p2.getPuntos());
		System.out.println(p1.getPuntos());
	}
}
