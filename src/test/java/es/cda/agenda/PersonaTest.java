package es.cda.agenda;

import org.junit.Test;

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
