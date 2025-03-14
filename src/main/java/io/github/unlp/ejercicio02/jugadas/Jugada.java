package io.github.unlp.ejercicio02.jugadas;

import java.util.HashSet;
import java.util.Set;

public abstract class Jugada
{
    protected Set<Jugada> leGana = new HashSet<>();

    public abstract String getNombre();

    public void agregarGanaContra(Jugada jugada)
    {
        if (jugada != null)
        {
            leGana.add(jugada);
        }
    }

    public boolean ganaContra(Jugada jugada)
    {
        return leGana.contains(jugada);
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;

        Jugada jugada = (Jugada) obj;
        return equals(jugada);
    }

    private boolean equals(Jugada jugada)
    {
        return getNombre().equals(jugada.getNombre());
    }

    @Override
    public int hashCode()
    {
        return getNombre().hashCode();
    }
}
