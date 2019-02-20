package application.states;

import application.actors.ConclusionCalculator;
import application.models.Context;

public class ConclusionState extends BaseState {

    private ConclusionCalculator conclusionCalculator;

    public ConclusionState(ConclusionCalculator conclusionCalculator) {
        this.conclusionCalculator = conclusionCalculator;
        statesMaps.put("1",new EndGameState());
    }

    @Override
    public State evalState(String option, Context context) {
        System.out.println(conclusionCalculator.generateConclusion(context));
        return new EndGameState();
    }

    private ConclusionCalculator getConclusionCalculator() {
        return new ConclusionCalculator();
    }

    @Override
    public void showOptions() {
        System.out.println("\n\n" +
                "With everything investigated it is time to come to a conclusion.");
        System.out.println("    1 - conclude");
    }

}
