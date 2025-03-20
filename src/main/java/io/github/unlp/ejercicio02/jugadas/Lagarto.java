package io.github.unlp.ejercicio02.jugadas;

public class Lagarto implements Jugada
{
    @Override
    public String getNombre()
    {
        return "Lagarto";
    }

    @Override
    public String ganaContra(Jugada jugada)
    {
        return jugada.ganaContraLagarto();
    }

    @Override
    public String ganaContraPiedra()
    {
        return "Gana piedra";
    }

    @Override
    public String ganaContraPapel()
    {
        return "Gana lagarto";
    }

    @Override
    public String ganaContraTijera()
    {
        return "Gana tijera";
    }

    @Override
    public String ganaContraLagarto()
    {
        return "Empate";
    }

    @Override
    public String ganaContraSpock()
    {
        return "Gana lagarto";
    }
}
