package application.models;

import application.states.State;

import java.util.Set;

public class ContextImpl implements Context {

    private State state;
    private User user;
    private User savedUser;

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
        this.state = this.state.evalState(option, this);
    }

    @Override
    public void saveState() {
    this.savedUser = this.user.saveState();
    }

    @Override
    public void loadState() {
        this.user = this.savedUser;
    }

    @Override
    public void addExperiencePoint(Integer experiencePoints) {
        this.user.addExperiencePoints(experiencePoints);
    }

    @Override
    public void addEvidence(Evidence evidence) {
        this.user.addEvidences(evidence);
    }

    @Override
    public Set<Evidence> getEvidences() {
        return this.user.getEvidences();
    }
}
