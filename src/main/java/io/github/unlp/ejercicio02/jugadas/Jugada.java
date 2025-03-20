package io.github.unlp.ejercicio02.jugadas;

public interface Jugada
{
    public String getNombre();
    public String ganaContra(Jugada jugada);
    public String ganaContraPiedra();
    public String ganaContraPapel();
    public String ganaContraTijera();
    public String ganaContraLagarto();
    public String ganaContraSpock();
}
