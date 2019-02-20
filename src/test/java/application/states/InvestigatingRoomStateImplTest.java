package application.states;

import application.models.ContextImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class InvestigatingRoomStateImplTest {

    private InvestigatingRoomStateImpl investigatingRoomStateImpl;

    @Mock
    private ContextImpl context;

    @Before
    public void setup() {
        investigatingRoomStateImpl = new InvestigatingRoomStateImpl();
    }

    @Test
    public void validadeNextStates() {
        assertEquals(BathRoomState.class, investigatingRoomStateImpl.evalState("1", context).getClass());
        assertEquals(BedRoomState.class, investigatingRoomStateImpl.evalState("2", context).getClass());
        assertEquals(KitchenState.class, investigatingRoomStateImpl.evalState("3", context).getClass());
        assertEquals(InvestigateBodyState.class, investigatingRoomStateImpl.evalState("4", context).getClass());
        assertEquals(ConclusionState.class, investigatingRoomStateImpl.evalState("5", context).getClass());
    }

}