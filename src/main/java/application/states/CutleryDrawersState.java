package application.states;

import application.models.Context;
import application.models.Evidence;

public class CutleryDrawersState extends BaseState {

    public CutleryDrawersState(BaseState toReturn) {
        statesMaps.put("1", toReturn);
    }

    @Override
    public State evalState(String option, Context context) {
        context.addExperiencePoint(this.getExperiencePoints());
        context.addEvidence(Evidence.KNIFE_MISSIG);
        return super.evalState(option, context);
    }

    @Override
    protected void showOptions() {
        System.out.println("YThe cutlery gauze  is half open, the knife column is a bit messy.");
        System.out.println("\nSelect a option:");
        System.out.println("    1 - go back");

    }
}
