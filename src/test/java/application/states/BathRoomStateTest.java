package application.states;

import application.models.ContextImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class BathRoomStateTest {

    private BathRoomState bathRoomState;

    @Mock
    private BaseState stateToReturn;

    @Mock
    private ContextImpl context;

    @Before
    public void setup() {
        bathRoomState = new BathRoomState(stateToReturn);
    }

    @Test
    public void shouldReturn() {
        State state = bathRoomState.evalState("4", context);
        assertTrue(state.equals(stateToReturn));
    }

    @Test
    public void validadeNextStates() {
        assertEquals(NothingToSeeState.class, bathRoomState.evalState("1", context).getClass());
        assertEquals(NothingToSeeState.class, bathRoomState.evalState("2", context).getClass());
        assertEquals(NothingToSeeState.class, bathRoomState.evalState("3", context).getClass());
    }


}