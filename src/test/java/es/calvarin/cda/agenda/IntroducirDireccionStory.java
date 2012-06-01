package es.calvarin.cda.agenda;


import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.jbehave.core.steps.PrintStreamStepMonitor;

public class IntroducirDireccionStory extends JUnitStory {

public IntroducirDireccionStory() {
        Configuration configuration = new MostUsefulConfiguration()
                .useStoryLoader(new LoadFromClasspath(this.getClass().getClassLoader()))
                .useStepMonitor(new PrintStreamStepMonitor());
        
        addSteps(new InstanceStepsFactory(configuration, new IntroducirDireccionSteps()).createCandidateSteps());
    }

}


