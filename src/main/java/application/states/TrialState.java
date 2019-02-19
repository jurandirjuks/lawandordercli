package application.states;

import application.User;

public class TrialState extends BaseState {


    @Override
    public void printStateMsg() {
        System.out.println("final stage");
    }

    @Override
    public State evalState(String option, User user) {
        return this;
    }

    @Override
    public boolean shouldEndMachineState() {
        return true;
    }
}
