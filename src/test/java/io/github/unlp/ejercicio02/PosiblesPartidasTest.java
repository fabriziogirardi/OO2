package io.github.unlp.ejercicio02;

import io.github.unlp.ejercicio02.jugadas.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PosiblesPartidasTest
{
    private final Jugada piedra  = new Piedra();
    private final Jugada tijera  = new Tijera();
    private final Jugada papel   = new Papel();
    private final Jugada lagarto = new Lagarto();
    private final Jugada spock   = new Spock();

    @BeforeEach
    public void setUp()
    {
        piedra.agregarGanaContra(tijera);
        piedra.agregarGanaContra(lagarto);
        tijera.agregarGanaContra(papel);
        tijera.agregarGanaContra(lagarto);
        papel.agregarGanaContra(piedra);
        papel.agregarGanaContra(spock);
        lagarto.agregarGanaContra(papel);
        lagarto.agregarGanaContra(spock);
        spock.agregarGanaContra(tijera);
        spock.agregarGanaContra(piedra);
    }

    @Test
    public void testPiedraContraPiedra()
    {
        Jugador jugador1 = new Jugador("Jugador 1", piedra);
        Jugador jugador2 = new Jugador("Jugador 2", piedra);
        Partida partida  = new Partida(jugador1, jugador2);
        assertEquals("Empate", partida.getResultado());
    }

    @Test
    public void testTijeraContraTijera()
    {
        Jugador jugador1 = new Jugador("Jugador 1", tijera);
        Jugador jugador2 = new Jugador("Jugador 2", tijera);
        Partida partida  = new Partida(jugador1, jugador2);
        assertEquals("Empate", partida.getResultado());
    }

    @Test
    public void testPapelContraPapel()
    {
        Jugador jugador1 = new Jugador("Jugador 1", papel);
        Jugador jugador2 = new Jugador("Jugador 2", papel);
        Partida partida  = new Partida(jugador1, jugador2);
        assertEquals("Empate", partida.getResultado());
    }

    @Test
    public void testLagartoContraLagarto()
    {
        Jugador jugador1 = new Jugador("Jugador 1", lagarto);
        Jugador jugador2 = new Jugador("Jugador 2", lagarto);
        Partida partida  = new Partida(jugador1, jugador2);
        assertEquals("Empate", partida.getResultado());
    }

    @Test
    public void testSpockContraSpock()
    {
        Jugador jugador1 = new Jugador("Jugador 1", spock);
        Jugador jugador2 = new Jugador("Jugador 2", spock);
        Partida partida  = new Partida(jugador1, jugador2);
        assertEquals("Empate", partida.getResultado());
    }

    @Test
    public void testPiedraContraTijera()
    {
        Jugador jugador1 = new Jugador("Jugador 1", piedra);
        Jugador jugador2 = new Jugador("Jugador 2", tijera);
        Partida partida  = new Partida(jugador1, jugador2);
        assertEquals("Jugador 1", partida.getResultado());
    }

    @Test
    public void testPiedraContraPapel()
    {
        Jugador jugador1 = new Jugador("Jugador 1", piedra);
        Jugador jugador2 = new Jugador("Jugador 2", papel);
        Partida partida  = new Partida(jugador1, jugador2);
        assertEquals("Jugador 2", partida.getResultado());
    }

    @Test
    public void testPiedraContraLagarto()
    {
        Jugador jugador1 = new Jugador("Jugador 1", piedra);
        Jugador jugador2 = new Jugador("Jugador 2", lagarto);
        Partida partida  = new Partida(jugador1, jugador2);
        assertEquals("Jugador 1", partida.getResultado());
    }

    @Test
    public void testPiedraContraSpock()
    {
        Jugador jugador1 = new Jugador("Jugador 1", piedra);
        Jugador jugador2 = new Jugador("Jugador 2", spock);
        Partida partida  = new Partida(jugador1, jugador2);
        assertEquals("Jugador 2", partida.getResultado());
    }

    @Test
    public void testTijeraContraPapel()
    {
        Jugador jugador1 = new Jugador("Jugador 1", tijera);
        Jugador jugador2 = new Jugador("Jugador 2", papel);
        Partida partida  = new Partida(jugador1, jugador2);
        assertEquals("Jugador 1", partida.getResultado());
    }

    @Test
    public void testTijeraContraLagarto()
    {
        Jugador jugador1 = new Jugador("Jugador 1", tijera);
        Jugador jugador2 = new Jugador("Jugador 2", lagarto);
        Partida partida  = new Partida(jugador1, jugador2);
        assertEquals("Jugador 1", partida.getResultado());
    }

    @Test
    public void testTijeraContraSpock()
    {
        Jugador jugador1 = new Jugador("Jugador 1", tijera);
        Jugador jugador2 = new Jugador("Jugador 2", spock);
        Partida partida  = new Partida(jugador1, jugador2);
        assertEquals("Jugador 2", partida.getResultado());
    }

    @Test
    public void testPapelContraLagarto()
    {
        Jugador jugador1 = new Jugador("Jugador 1", papel);
        Jugador jugador2 = new Jugador("Jugador 2", lagarto);
        Partida partida  = new Partida(jugador1, jugador2);
        assertEquals("Jugador 2", partida.getResultado());
    }

    @Test
    public void testPapelContraSpock()
    {
        Jugador jugador1 = new Jugador("Jugador 1", papel);
        Jugador jugador2 = new Jugador("Jugador 2", spock);
        Partida partida  = new Partida(jugador1, jugador2);
        assertEquals("Jugador 1", partida.getResultado());
    }

    @Test
    public void testLagartoContraSpock()
    {
        Jugador jugador1 = new Jugador("Jugador 1", lagarto);
        Jugador jugador2 = new Jugador("Jugador 2", spock);
        Partida partida  = new Partida(jugador1, jugador2);
        assertEquals("Jugador 1", partida.getResultado());
    }
}
