package application.states;

import application.models.ContextImpl;
import application.models.Evidence;
import application.models.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class KnifeStateTest {

    private KnifeState knifeState;

    @Mock
    private BaseState stateToReturn;

    @Mock
    private ContextImpl context;

    @Before
    public void setup() {
        knifeState = new KnifeState(stateToReturn);
    }

    @Test
    public void shouldReturn() {
        State state = knifeState.evalState("1", context);
        assertTrue(state.equals(stateToReturn));
    }

    @Test
    public void shouldCalculateExperienceAndCollectEvidence(){
        context.setUser(new User(""));
        State state = knifeState.evalState("1", context);

        assertTrue(state.equals(stateToReturn));
        Mockito.verify(context,Mockito.times(1)).addEvidence(Evidence.IS_NOT_THE_REAL_CRIME_OBJECT);
        Mockito.verify(context,Mockito.times(1)).addExperiencePoint(1);
    }

}