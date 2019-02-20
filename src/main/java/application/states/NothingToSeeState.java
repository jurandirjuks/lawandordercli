package application.states;

public class NothingToSeeState extends BaseState {


    public NothingToSeeState(BaseState stateToReturn) {
    this.statesMaps.put("1",stateToReturn);
    }

    @Override
    protected void showOptions() {
        System.out.println("Nothing interesting here.");
        System.out.println("\nSelect a option:");
        System.out.println("    1 - Go back");
    }
}
