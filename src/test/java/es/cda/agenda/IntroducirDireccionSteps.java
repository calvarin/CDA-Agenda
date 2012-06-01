package es.cda.agenda;

import junit.framework.Assert;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class IntroducirDireccionSteps
{

    private Persona persona;
    private String direccion;
    private String telefono;

    @Given("Tengo una persona y tengo su direccion $la_direccion caca $su_telefono")
    public void initDireccionPersona(String direccion, String telefono)
    {
        persona = new Persona();
        this.direccion = direccion;
        this.telefono = telefono;
        System.out.println(this.direccion);
        System.out.println(this.telefono);
    }

    @When("Guardo la direccion")
    public void testGuardaDireccion()
    {
        persona.agregaDireccion(direccion);
    }

    @Then("El sistema devuelve: $la_direccion")
    public void testValidaDireccion(String entrada)
    {
        Assert.assertEquals(persona.recuperaDireccion().get(0), entrada);
    }
}