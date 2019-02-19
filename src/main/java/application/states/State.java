package application.states;

import application.User;

public interface State {

    default boolean shouldEndMachineState() {
        return false;
    }

    void printStateMsg();

    State evalState(String option, User user);
}
