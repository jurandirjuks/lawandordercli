package application.states;

import application.actors.ConclusionCalculator;
import application.models.ContextImpl;
import application.models.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class ConclusionStateTest {

    @Spy
    private ConclusionCalculator conclusionCalculator;

    @Spy
    private ContextImpl context = new ContextImpl();

    private ConclusionState conclusionState;

    @Before
    public void setup(){
        conclusionState = new ConclusionState(conclusionCalculator);
    }

    @Test
    public void validadeNextStates() {
        context.setUser(new User(""));
        assertEquals(EndGameState.class, conclusionState.evalState("1", context).getClass());
        Mockito.verify(conclusionCalculator,Mockito.times(1)).generateConclusion(context);
    }


}