package application.states;

import application.models.Context;
import application.models.Evidence;

public class WoundState extends BaseState {

    public WoundState(BaseState baseState) {
        statesMaps.put("1",baseState);
    }

    @Override
    public State evalState(String option, Context context) {
        context.addExperiencePoint(this.getExperiencePoints());
        context.addEvidence(Evidence.IS_NOT_A_SUICIDE_WOUND);
        return super.evalState(option, context);
    }

    @Override
    public void showOptions() {
        System.out.println("\n" +
                "The cut is wide, made with force. Something that looks nothing like a single, straight cut.");
        System.out.println("\nSelect a option:");
        System.out.println("    1 - return");
    }
}
