package application.states;

public class EndGameState extends BaseState {

    @Override
    public boolean shouldEndMachineState() {
        return true;
    }

    @Override
    public void showOptions() {
        System.out.println(" \n\n  Any key - End the game");
    }
}
