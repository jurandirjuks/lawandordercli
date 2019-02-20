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

@RunWith(MockitoJUnitRunner.class)
public class WoundStateTest {

    private WoundState woundState;

    @Mock
    private BaseState stateToReturn;

    @Mock
    private ContextImpl context;

    @Before
    public void setup() {
        woundState = new WoundState(stateToReturn);
    }

    @Test
    public void shouldReturn() {
        State state = woundState.evalState("1", context);
        assertTrue(state.equals(stateToReturn));
    }

    @Test
    public void shouldCalculateExperienceAndCollectEvidence(){
        context.setUser(new User(""));
        State state = woundState.evalState("1", context);

        assertTrue(state.equals(stateToReturn));
        Mockito.verify(context,Mockito.times(1)).addEvidence(Evidence.IS_NOT_A_SUICIDE_WOUND);
        Mockito.verify(context,Mockito.times(1)).addExperiencePoint(1);
    }

}