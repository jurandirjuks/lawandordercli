package application.models;

import application.states.State;

import java.util.Set;

public interface Context {

    void setUser(User user);

    void setState(State state);

    void printStateOptions();

    boolean goToNextSession();

    void readOption(String option);

    void saveState();

    void loadState();

    void addExperiencePoint(Integer experiencePoints);

    void addEvidence(Evidence knifeMissig);

    Set<Evidence> getEvidences();
}
