package es.cda.agenda;

import java.util.ArrayList;
import java.util.List;

public class Persona
{
    private List<String> direcciones;

    public Persona()
    {
        this.direcciones = new ArrayList<String>();
    }

    public void agregaDireccion(String direccion)
    {
        this.direcciones.add(direccion);
    }
    
    public List<String> recuperaDireccion()
    {
        return this.direcciones;
    }
}
