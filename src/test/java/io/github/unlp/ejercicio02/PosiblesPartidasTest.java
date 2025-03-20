package io.github.unlp.ejercicio02;

import io.github.unlp.ejercicio02.jugadas.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PosiblesPartidasTest
{
    @Test
    public void testPiedraContraPiedra()
    {
        Jugador jugador1 = new Jugador("Jugador 1", new Piedra());
        Jugador jugador2 = new Jugador("Jugador 2", new Piedra());
        Partida partida  = new Partida(jugador1, jugador2);
        assertEquals("Empate", partida.getResultado());
    }

    @Test
    public void testTijeraContraTijera()
    {
        Jugador jugador1 = new Jugador("Jugador 1", new Tijera());
        Jugador jugador2 = new Jugador("Jugador 2", new Tijera());
        Partida partida  = new Partida(jugador1, jugador2);
        assertEquals("Empate", partida.getResultado());
    }

    @Test
    public void testPapelContraPapel()
    {
        Jugador jugador1 = new Jugador("Jugador 1", new Papel());
        Jugador jugador2 = new Jugador("Jugador 2", new Papel());
        Partida partida  = new Partida(jugador1, jugador2);
        assertEquals("Empate", partida.getResultado());
    }

    @Test
    public void testLagartoContraLagarto()
    {
        Jugador jugador1 = new Jugador("Jugador 1", new Lagarto());
        Jugador jugador2 = new Jugador("Jugador 2", new Lagarto());
        Partida partida  = new Partida(jugador1, jugador2);
        assertEquals("Empate", partida.getResultado());
    }

    @Test
    public void testSpockContraSpock()
    {
        Jugador jugador1 = new Jugador("Jugador 1", new Spock());
        Jugador jugador2 = new Jugador("Jugador 2", new Spock());
        Partida partida  = new Partida(jugador1, jugador2);
        assertEquals("Empate", partida.getResultado());
    }

    @Test
    public void testPiedraContraTijera()
    {
        Jugador jugador1 = new Jugador("Jugador 1", new Piedra());
        Jugador jugador2 = new Jugador("Jugador 2", new Tijera());
        Partida partida  = new Partida(jugador1, jugador2);
        assertEquals("Gana piedra", partida.getResultado());
    }

    @Test
    public void testPiedraContraPapel()
    {
        Jugador jugador1 = new Jugador("Jugador 1", new Piedra());
        Jugador jugador2 = new Jugador("Jugador 2", new Papel());
        Partida partida  = new Partida(jugador1, jugador2);
        assertEquals("Gana papel", partida.getResultado());
    }

    @Test
    public void testPiedraContraLagarto()
    {
        Jugador jugador1 = new Jugador("Jugador 1", new Piedra());
        Jugador jugador2 = new Jugador("Jugador 2", new Lagarto());
        Partida partida  = new Partida(jugador1, jugador2);
        assertEquals("Gana piedra", partida.getResultado());
    }

    @Test
    public void testPiedraContraSpock()
    {
        Jugador jugador1 = new Jugador("Jugador 1", new Piedra());
        Jugador jugador2 = new Jugador("Jugador 2", new Spock());
        Partida partida  = new Partida(jugador1, jugador2);
        assertEquals("Gana spock", partida.getResultado());
    }

    @Test
    public void testTijeraContraPapel()
    {
        Jugador jugador1 = new Jugador("Jugador 1", new Tijera());
        Jugador jugador2 = new Jugador("Jugador 2", new Papel());
        Partida partida  = new Partida(jugador1, jugador2);
        assertEquals("Gana tijera", partida.getResultado());
    }

    @Test
    public void testTijeraContraLagarto()
    {
        Jugador jugador1 = new Jugador("Jugador 1", new Tijera());
        Jugador jugador2 = new Jugador("Jugador 2", new Lagarto());
        Partida partida  = new Partida(jugador1, jugador2);
        assertEquals("Gana tijera", partida.getResultado());
    }

    @Test
    public void testTijeraContraSpock()
    {
        Jugador jugador1 = new Jugador("Jugador 1", new Tijera());
        Jugador jugador2 = new Jugador("Jugador 2", new Spock());
        Partida partida  = new Partida(jugador1, jugador2);
        assertEquals("Gana spock", partida.getResultado());
    }

    @Test
    public void testPapelContraLagarto()
    {
        Jugador jugador1 = new Jugador("Jugador 1", new Papel());
        Jugador jugador2 = new Jugador("Jugador 2", new Lagarto());
        Partida partida  = new Partida(jugador1, jugador2);
        assertEquals("Gana lagarto", partida.getResultado());
    }

    @Test
    public void testPapelContraSpock()
    {
        Jugador jugador1 = new Jugador("Jugador 1", new Papel());
        Jugador jugador2 = new Jugador("Jugador 2", new Spock());
        Partida partida  = new Partida(jugador1, jugador2);
        assertEquals("Gana papel", partida.getResultado());
    }

    @Test
    public void testLagartoContraSpock()
    {
        Jugador jugador1 = new Jugador("Jugador 1", new Lagarto());
        Jugador jugador2 = new Jugador("Jugador 2", new Spock());
        Partida partida  = new Partida(jugador1, jugador2);
        assertEquals("Gana lagarto", partida.getResultado());
    }
}
