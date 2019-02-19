package application.states;

import application.User;

import java.util.HashMap;

public abstract class BaseState implements State {

    protected final HashMap<String, BaseState> statesMaps = new HashMap<>();

    @Override
    public State evalState(String option, User user) {
        return this.statesMaps.getOrDefault(option, this);
    }

    @Override
    public void printStateMsg() {
        System.out.println();
        this.showOptions();
        System.out.println();
    }

    protected void showOptions() {
        System.out.println(this.getClass().getCanonicalName());
    }
}
