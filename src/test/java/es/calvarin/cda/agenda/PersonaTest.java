package es.calvarin.cda.agenda;

import org.junit.Test;

import es.calvarin.cda.agenda.AgendaDAO;
import es.calvarin.cda.agenda.AgendaDAOImpl;
import es.calvarin.cda.agenda.Persona;

public class PersonaTest
{
    @Test
    public void testAgregarTelefono()
    {
        Persona persona = new Persona();
        
//        Agenda.agregarTelefono(persona, "555");
        AgendaDAO agendaDAOImpl = new AgendaDAOImpl();
//        Agenda.setAgendaDAO(agendaDAOImpl);
//        assertEquals("555", persona.getTelefonos().get(0));
    }
}
