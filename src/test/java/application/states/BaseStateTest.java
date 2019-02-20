package application.states;

import application.models.ContextImpl;
import application.models.User;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class BaseStateTest {

    private static BaseState baseState;

    @Spy
    private User user = new User("test");

    @Spy
    private ContextImpl context = new ContextImpl();

    @BeforeClass
    public static void setup(){
        baseState = new BaseState() {
            @Override
            protected void showOptions() {

            }
        };
    }

    @Test
    public void shouldSaveState(){
        context.setUser(user);
        baseState.evalState("save", context);
        verify(context, Mockito.times(1)).saveState();
    }

    @Test
    public void shoulComputeExprx(){
        assertEquals(Integer.valueOf(1),baseState.getExperiencePoints());
        assertEquals(Integer.valueOf(0),baseState.getExperiencePoints());
    }

}