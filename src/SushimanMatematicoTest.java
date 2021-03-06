import java.util.ArrayList;
import java.util.Arrays;

import junit.framework.TestCase;

public class SushimanMatematicoTest extends TestCase {

	public void testEhPrimo() {
		// assert statements
		assertTrue(SushimanMatematico.ehPrimo(7));
		assertTrue(SushimanMatematico.ehPrimo(11));
		assertTrue(SushimanMatematico.ehPrimo(71));
		assertTrue(SushimanMatematico.ehPrimo(233));
		assertFalse(SushimanMatematico.ehPrimo(12));
		assertFalse(SushimanMatematico.ehPrimo(1));
	}

	public void testGetPrimos() {

		// Testes com valores determinados

		assertEquals(SushimanMatematico.getPrimos(0), Arrays.asList(2, 3, 5, 7));
		assertEquals(SushimanMatematico.getPrimos(33), Arrays.asList(331, 337));
		assertEquals(SushimanMatematico.getPrimos(71), Arrays.asList(719));
		assertEquals(SushimanMatematico.getPrimos(233), Arrays.asList(2333, 2339));
		assertEquals(SushimanMatematico.getPrimos(450), Arrays.asList(4507));

		// Teste entre 200 e 209

		ArrayList<Integer> primeirosPrimos = new ArrayList<Integer>();

		primeirosPrimos = SushimanMatematico.getPrimos(20);

		for (Integer primo : primeirosPrimos) {

			assertTrue(SushimanMatematico.ehPrimo(primo) && primo > 200 && primo < 209);

		}

		// Teste entre 300 e 309

		ArrayList<Integer> primeirosPrimos2 = new ArrayList<Integer>();

		primeirosPrimos2 = SushimanMatematico.getPrimos(30);

		for (Integer primo : primeirosPrimos2) {

			assertTrue(SushimanMatematico.ehPrimo(primo) && primo > 300 && primo < 309);

		}

		// Teste entre 0 e 9

		ArrayList<Integer> primeirosPrimos3 = new ArrayList<Integer>();

		primeirosPrimos3 = SushimanMatematico.getPrimos(0);

		for (Integer primo : primeirosPrimos3) {

			assertTrue(SushimanMatematico.ehPrimo(primo) && primo > 0 && primo < 9);

		}

	}

	public void testGetSuperPrimos() {

		ArrayList<Integer> superPrimos = new ArrayList<Integer>();

		int n;
		int contagem;

		superPrimos = SushimanMatematico.getSuperPrimos(1);

		for (Integer primo : superPrimos) {
			n = primo;
			contagem = 0;

			while (n > 0) {

				n = n / 10;

				if (n > 0) {
					assertTrue(SushimanMatematico.ehPrimo(n));
				}

				contagem++;

			}

			assertEquals(contagem, 1);

		}

		ArrayList<Integer> superPrimos2 = new ArrayList<Integer>();
		superPrimos2 = SushimanMatematico.getSuperPrimos(2);

		for (Integer primo : superPrimos2) {
			n = primo;
			contagem = 0;

			while (n > 0) {

				n = n / 10;

				if (n > 0) {
					assertTrue(SushimanMatematico.ehPrimo(n));

				}
				contagem++;

			}

			assertEquals(contagem, 2);

		}

		ArrayList<Integer> superPrimos3 = new ArrayList<Integer>();
		superPrimos2 = SushimanMatematico.getSuperPrimos(3);

		for (Integer primo : superPrimos3) {
			n = primo;
			contagem = 0;

			while (n > 0) {

				n = n / 10;

				if (n > 0) {
					assertTrue(SushimanMatematico.ehPrimo(n));

				}
				contagem++;

			}
			assertEquals(contagem, 3);

		}

		ArrayList<Integer> superPrimos4 = new ArrayList<Integer>();
		superPrimos2 = SushimanMatematico.getSuperPrimos(4);

		for (Integer primo : superPrimos4) {
			n = primo;
			contagem = 0;

			while (n > 0) {

				n = n / 10;

				if (n > 0) {
					assertTrue(SushimanMatematico.ehPrimo(n));

				}
				contagem++;

			}

			assertEquals(contagem, 4);

		}

		ArrayList<Integer> superPrimos5 = new ArrayList<Integer>();
		superPrimos2 = SushimanMatematico.getSuperPrimos(5);

		for (Integer primo : superPrimos5) {
			n = primo;
			contagem = 0;

			while (n > 0) {

				n = n / 10;

				if (n > 0) {
					assertTrue(SushimanMatematico.ehPrimo(n));

				}
				contagem++;

			}
			assertEquals(contagem, 5);

		}

		ArrayList<Integer> superPrimos6 = new ArrayList<Integer>();
		superPrimos2 = SushimanMatematico.getSuperPrimos(6);

		for (Integer primo : superPrimos6) {
			n = primo;
			contagem = 0;

			while (n > 0) {

				n = n / 10;

				if (n > 0) {
					assertTrue(SushimanMatematico.ehPrimo(n));
				}
				contagem++;

			}
			assertEquals(contagem, 6);

		}

		ArrayList<Integer> superPrimos7 = new ArrayList<Integer>();
		superPrimos2 = SushimanMatematico.getSuperPrimos(7);

		for (Integer primo : superPrimos7) {
			n = primo;
			contagem = 0;

			while (n > 0) {

				n = n / 10;

				if (n > 0) {
					assertTrue(SushimanMatematico.ehPrimo(n));

				}
				contagem++;

			}
			assertEquals(contagem, 7);

		}

		ArrayList<Integer> superPrimos8 = new ArrayList<Integer>();
		superPrimos2 = SushimanMatematico.getSuperPrimos(8);

		for (Integer primo : superPrimos8) {
			n = primo;
			contagem = 0;

			while (n > 0) {

				n = n / 10;

				if (n > 0) {
					assertTrue(SushimanMatematico.ehPrimo(n));

				}
				contagem++;

			}
			assertEquals(contagem, 8);

		}

	}

}
