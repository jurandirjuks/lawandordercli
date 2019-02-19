package application;

import application.states.State;

public class ContextImpl implements Context {

    private State state;
    private User user;

    @Override
    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public void setState(State state) {
        this.state = state;
    }

    @Override
    public void printStateOptions() {
        this.state.printStateMsg();

    }

    @Override
    public boolean goToNextSession() {
        return state.shouldEndMachineState();
    }

    @Override
    public void readOption(String option) {
        this.state = this.state.evalState(option,user);
    }
}
