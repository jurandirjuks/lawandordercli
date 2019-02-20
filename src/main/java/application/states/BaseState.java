package application.states;

import application.Context;

import java.util.HashMap;

public abstract class BaseState implements State {

    private Integer experiencePoints = 1;

    public static final String SAVE_OPTION = "save";

    protected final HashMap<String, BaseState> statesMaps = new HashMap<>();


    @Override
    public State evalState(String option, Context context) {
        if (shouldSaveUser(option)) {
            context.saveState();
            System.out.println("\n progress saved!");
            return this;
        }

        return this.statesMaps.getOrDefault(option, this);
    }

    protected boolean shouldSaveUser(String option) {
        return SAVE_OPTION.equals(option);
    }


    @Override
    public void printStateMsg() {
        System.out.println();
        this.showOptions();
        System.out.println("   save - save progress");
        System.out.println();
    }

    protected void showOptions() {
        System.out.println(this.getClass().getCanonicalName());
    }

    protected Integer getExperiencePoints() {
        if (experiencePoints > 0) {
            experiencePoints = 0;
            System.out.println("   ## You have found a evidence and gained a point of experience. ##");
            return 1;
        }

        return 0;
    }
}
