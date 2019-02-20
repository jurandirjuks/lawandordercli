package application.states;

import application.models.Context;

public interface State {

    default boolean shouldEndMachineState() {
        return false;
    }

    void printStateMsg();

    State evalState(String option, Context context);
}
