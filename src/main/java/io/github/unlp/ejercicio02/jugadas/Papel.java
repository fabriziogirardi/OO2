package io.github.unlp.ejercicio02.jugadas;

public class Papel implements Jugada
{
    @Override
    public String getNombre()
    {
        return "Papel";
    }

    @Override
    public String ganaContra(Jugada jugada)
    {
        return jugada.ganaContraPapel();
    }

    @Override
    public String ganaContraPiedra()
    {
        return "Gana papel";
    }

    @Override
    public String ganaContraPapel()
    {
        return "Empate";
    }

    @Override
    public String ganaContraTijera()
    {
        return "Gana tijera";
    }

    @Override
    public String ganaContraLagarto()
    {
        return "Gana lagarto";
    }

    @Override
    public String ganaContraSpock()
    {
        return "Gana papel";
    }
}
