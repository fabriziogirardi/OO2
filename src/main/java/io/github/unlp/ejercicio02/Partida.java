package io.github.unlp.ejercicio02;

public class Partida
{
    private final Jugador jugador1;
    private final Jugador jugador2;

    public Partida(Jugador jugador1, Jugador jugador2)
    {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public Jugador getJugador1()
    {
        return jugador1;
    }

    public Jugador getJugador2()
    {
        return jugador2;
    }

    public String getResultado()
    {
        return jugador1.ganaContra(jugador2);
    }
}
