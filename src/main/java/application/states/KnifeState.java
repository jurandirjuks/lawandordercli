package application.states;

import application.models.Context;
import application.models.Evidence;

public class KnifeState extends BaseState {

    public KnifeState(BaseState baseState) {
        statesMaps.put("1",baseState);
    }

    @Override
    public State evalState(String option, Context context) {
        context.addExperiencePoint(this.getExperiencePoints());
        context.addEvidence(Evidence.IS_NOT_THE_REAL_CRIME_OBJECT);
        return super.evalState(option, context);
    }

    @Override
    public void showOptions() {
        System.out.println("The hand holding the knife is bloodless. " +
                "There is blood on the metal but it seems to have been spread with the finger.");
        System.out.println("\nSelect a option:");
        System.out.println("    1 - return");
    }
}
