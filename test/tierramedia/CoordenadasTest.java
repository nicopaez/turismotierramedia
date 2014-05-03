package tierramedia;

import org.junit.Assert;
import org.junit.Test;

public class CoordenadasTest {

	@Test
	public void equalDeberiaSerTrueParaMismosValores() {
		Coordenadas coord1 = new Coordenadas(1, 1);
		Coordenadas coord2 = new Coordenadas(1, 1);
		
		Assert.assertEquals(coord1, coord2);
	}

}
