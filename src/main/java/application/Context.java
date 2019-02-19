package application;

import application.states.State;

public interface Context {

    void setUser(User user);

    void setState(State state);

    void printStateOptions();

    boolean goToNextSession();

    void readOption(String option);

}
