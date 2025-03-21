package io.github.unlp.ejercicio02;

import io.github.unlp.ejercicio02.jugadas.*;

public class Jugador
{
    private final String nombre;
    private final Jugada jugada;

    public Jugador(String nombre, Jugada jugada)
    {
        this.nombre = nombre;
        this.jugada = jugada;
    }

    public String getNombre()
    {
        return nombre;
    }

    public Jugada getJugada()
    {
        return jugada;
    }

    public String ganaContra(Jugador jugador)
    {
        return jugada.ganaContra(jugador.getJugada());
    }
}