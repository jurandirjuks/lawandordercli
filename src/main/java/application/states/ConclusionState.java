package application.states;

import application.Context;

public class ConclusionState extends BaseState {

    public ConclusionState() {
        statesMaps.put("1",new EndGameState());
    }

    @Override
    public State evalState(String option, Context context) {
        System.out.println(new ConclusionCalculator().generateConclusion(context));
        return new EndGameState();
    }

    @Override
    public void showOptions() {
        System.out.println("\n\n" +
                "With everything investigated it is time to come to a conclusion.");
        System.out.println("    1 - conclude");
    }

}
