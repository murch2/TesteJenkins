/**
 * @author Rodrigo Duarte Louro
 *
 * May 15, 2014
 */
package teste;

import static org.junit.Assert.*;
import main.Main;

import org.junit.Test;

public class MainTest {

	@Test
	public void somaTest() {
		assertEquals(5, Main.soma(2, 3));
		assertEquals(-1, Main.soma(2, -3));
		assertEquals(0, Main.soma(0, 0));
	}
}
