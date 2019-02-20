package application.states;

public class InvestigateBodyState extends BaseState {

    public InvestigateBodyState(BaseState stateToReturn) {
        statesMaps.put("1",new KnifeState(this));
        statesMaps.put("2",new NothingToSeeState(this));
        statesMaps.put("3",new WoundState(this));
        statesMaps.put("4", stateToReturn);
    }

    @Override
    public void showOptions() {
        System.out.println("The body is inert on the floor, the girl is holding a knife, the blood dirty the carpet");
        System.out.println("\nSelect a option:");
        System.out.println("    1 - Investigate Knife");
        System.out.println("    2 - Investigate pockets");
        System.out.println("    3 - Investigate the wound.");
        System.out.println("    4 - return.");
    }
}
