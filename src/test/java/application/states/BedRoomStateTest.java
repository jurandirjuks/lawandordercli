package application.states;

import application.models.ContextImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class BedRoomStateTest {

    private BedRoomState bedRoomState;

    @Mock
    private BaseState stateToReturn;

    @Mock
    private ContextImpl context;

    @Before
    public void setup() {
        bedRoomState = new BedRoomState(stateToReturn);
    }

    @Test
    public void shouldReturn() {
        State state = bedRoomState.evalState("3", context);
        assertTrue(state.equals(stateToReturn));
    }

    @Test
    public void validadeNextStates() {
        assertEquals(DiaryState.class, bedRoomState.evalState("1", context).getClass());
        assertEquals(NothingToSeeState.class, bedRoomState.evalState("2", context).getClass());
    }

}