package io.github.unlp.ejercicio02.jugadas;

public class Spock implements Jugada
{
    @Override
    public String getNombre()
    {
        return "Spock";
    }

    @Override
    public String ganaContra(Jugada jugada)
    {
        return jugada.ganaContraSpock();
    }

    @Override
    public String ganaContraPiedra()
    {
        return "Gana spock";
    }

    @Override
    public String ganaContraPapel()
    {
        return "Gana papel";
    }

    @Override
    public String ganaContraTijera()
    {
        return "Gana spock";
    }

    @Override
    public String ganaContraLagarto()
    {
        return "Gana lagarto";
    }

    @Override
    public String ganaContraSpock()
    {
        return "Empate";
    }
}
