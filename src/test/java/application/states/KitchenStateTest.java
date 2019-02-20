package application.states;

import application.models.ContextImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class KitchenStateTest {

    private KitchenState kitchenState;

    @Mock
    private BaseState stateToReturn;

    @Mock
    private ContextImpl context;

    @Before
    public void setup() {
        kitchenState = new KitchenState(stateToReturn);
    }

    @Test
    public void shouldReturn() {
        State state = kitchenState.evalState("4", context);
        assertTrue(state.equals(stateToReturn));
    }

    @Test
    public void validadeNextStates() {
        assertEquals(NothingToSeeState.class, kitchenState.evalState("1", context).getClass());
        assertEquals(NothingToSeeState.class, kitchenState.evalState("2", context).getClass());
        assertEquals(CutleryDrawersState.class, kitchenState.evalState("3", context).getClass());
    }

}