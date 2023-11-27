package org.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class TicketTest {

	@Test
    public void testTiketNormale() throws Exception {
        Ticket ticket = new Ticket(50, 30);
        assertEquals(10.5, ticket.calcolaPrezzo(),"biglietto sbagliato");
    }

    @Test
    public void testScontoU18() throws Exception {
        Ticket ticket = new Ticket(100, 17);
        assertEquals(16.8, ticket.calcolaPrezzo(), "sconto under 18 non e andato a buon fine");
    }

    @Test
    public void testScontoOver65() throws Exception {
        Ticket ticket = new Ticket(100, 67);
        assertEquals(12.6, ticket.calcolaPrezzo(),  "sconto over 65 non e andato a buon fine");
    }
}
