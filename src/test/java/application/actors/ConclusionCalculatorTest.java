package application.actors;

import application.models.ContextImpl;
import application.models.Evidence;
import application.models.User;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ConclusionCalculatorTest {

    private ConclusionCalculator conclusionCalculator = new ConclusionCalculator();

    @Test
    public void shouldReturnBadENding(){
        ContextImpl context = new ContextImpl();
        context.setUser(new User(""));
        assertTrue(ConclusionCalculator.BAD_ENDING.equals(conclusionCalculator.generateConclusion(context)));
    }

    @Test
    public void shouldReturnInconclusiveEnding(){
        ContextImpl context = new ContextImpl();
        context.setUser(new User(""));
        context.addEvidence(Evidence.EVIDENCE_OF_ADULTERY);
        assertTrue(ConclusionCalculator.INCOCLUSIVE_ENDING.equals(conclusionCalculator.generateConclusion(context)));
    }

    @Test
    public void shoulReturnGoodEnding(){
        ContextImpl context = new ContextImpl();
        context.setUser(new User(""));
        Arrays.stream(Evidence.values()).forEach(context::addEvidence);
        assertTrue(ConclusionCalculator.GOOD_ENDING.equals(conclusionCalculator.generateConclusion(context)));
    }
}