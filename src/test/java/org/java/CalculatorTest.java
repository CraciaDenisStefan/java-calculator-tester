package org.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	@Test
    public void testSomma() {
        Calculator calculator = new Calculator();
        float risultato = calculator.somma(5, 7);
        Assertions.assertEquals(12, risultato, "errore nel metodo somma");
    }

    @Test
    public void testSottrai() {
        Calculator calculator = new Calculator();
        float risultato = calculator.sottrai(10, 4);
        Assertions.assertEquals(6, risultato, "errore nel metodo sottrai");
    }

    @Test
    public void testDividi() {
        Calculator calculator = new Calculator();
        float risultato = calculator.dividi(8, 2);
        Assertions.assertEquals(4, risultato, "errore nel metodo dividi");
    }

    @Test
    public void testMoltiplica() {
        Calculator calculator = new Calculator();
        float risultato = calculator.moltiplica(3, 6);
        Assertions.assertEquals(18, risultato, "errore nel metodo moltiplica");
    }

}
