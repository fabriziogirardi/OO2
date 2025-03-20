package io.github.unlp.ejercicio02.jugadas;

public class Piedra implements Jugada
{
    @Override
    public String getNombre()
    {
        return "Piedra";
    }

    @Override
    public String ganaContra(Jugada jugada)
    {
        return jugada.ganaContraPiedra();
    }

    @Override
    public String ganaContraPiedra()
    {
        return "Empate";
    }

    @Override
    public String ganaContraPapel()
    {
        return "Gana papel";
    }

    @Override
    public String ganaContraTijera()
    {
        return "Gana piedra";
    }

    @Override
    public String ganaContraLagarto()
    {
        return "Gana piedra";
    }

    @Override
    public String ganaContraSpock()
    {
        return "Gana spock";
    }
}
