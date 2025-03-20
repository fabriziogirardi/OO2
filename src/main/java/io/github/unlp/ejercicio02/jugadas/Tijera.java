package io.github.unlp.ejercicio02.jugadas;

public class Tijera implements Jugada
{
    @Override
    public String getNombre()
    {
        return "Tijera";
    }

    @Override
    public String ganaContra(Jugada jugada)
    {
        return jugada.ganaContraTijera();
    }

    @Override
    public String ganaContraPiedra()
    {
        return "Gana piedra";
    }

    @Override
    public String ganaContraPapel()
    {
        return "Gana tijera";
    }

    @Override
    public String ganaContraTijera()
    {
        return "Empate";
    }

    @Override
    public String ganaContraLagarto()
    {
        return "Gana tijera";
    }

    @Override
    public String ganaContraSpock()
    {
        return "Gana spock";
    }
}
