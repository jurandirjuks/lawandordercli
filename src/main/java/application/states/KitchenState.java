package application.states;

public class KitchenState extends BaseState {

    public KitchenState(BaseState baseState) {
        NothingToSeeState nothingToSeeState = new NothingToSeeState(this);
        statesMaps.put("1", nothingToSeeState);
        statesMaps.put("2",nothingToSeeState);
        statesMaps.put("3",new CutleryDrawersState(this));
        statesMaps.put("4",baseState);
    }

    @Override
    public void showOptions() {
        System.out.println("You see a clean kitchen that has been cleaned recently, all the closets are closed.\n" +
                "You notice a stove, a refrigerator and the cutlery drawers.");
        System.out.println("\nSelect a option:");
        System.out.println("    1 - Investigate stove");
        System.out.println("    2 - Investigate refrigerator");
        System.out.println("    3 - Investigate cutlery drawers.");
        System.out.println("    4 - return.");
    }
}
