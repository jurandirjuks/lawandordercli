package application.states;

import application.Context;

public class DiaryState extends BaseState {

    public DiaryState(BaseState stateToReturn) {
        statesMaps.put("1",stateToReturn);
    }

    @Override
    public State evalState(String option, Context context) {
        context.addExperiencePoint(this.getExperiencePoints());
        context.addEvidence(Evidence.EVIDENCE_OF_ADULTERY);
        return super.evalState(option, context);
    }

    @Override
    public void showOptions() {
        System.out.println("The personal diary is with an open page, " +
                "counting as amorous adventures of the victim, a page is missing.");
        System.out.println("\nSelect a option:");
        System.out.println("    1 - return");
    }

}
