package application.states;

import application.models.ContextImpl;
import application.models.Evidence;
import application.models.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.TestCase.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class CutleryDrawersStateTest {

    @Mock
    private BaseState toReturn;

    @Spy
    private ContextImpl context;

    private CutleryDrawersState cutleryDrawersState;


    @Before
    public void setup(){
        cutleryDrawersState = new CutleryDrawersState(toReturn);
    }

    @Test
    public void shouldCalculateExperienceAndCollectEvidence(){
        context.setUser(new User(""));
        State state = cutleryDrawersState.evalState("1", context);

        assertTrue(state.equals(toReturn));
        Mockito.verify(context,Mockito.times(1)).addEvidence(Evidence.KNIFE_MISSIG);
        Mockito.verify(context,Mockito.times(1)).addExperiencePoint(1);
    }

}