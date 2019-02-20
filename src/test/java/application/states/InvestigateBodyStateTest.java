package application.states;

import application.models.ContextImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class InvestigateBodyStateTest {

    private InvestigateBodyState investigateBodyState;

    @Mock
    private BaseState stateToReturn;

    @Mock
    private ContextImpl context;

    @Before
    public void setup() {
        investigateBodyState = new InvestigateBodyState(stateToReturn);
    }

    @Test
    public void shouldReturn() {
        State state = investigateBodyState.evalState("4", context);
        assertTrue(state.equals(stateToReturn));
    }

    @Test
    public void validadeNextStates() {
        assertEquals(KnifeState.class, investigateBodyState.evalState("1", context).getClass());
        assertEquals(NothingToSeeState.class, investigateBodyState.evalState("2", context).getClass());
        assertEquals(WoundState.class, investigateBodyState.evalState("3", context).getClass());
    }

}