package application.states;

public class BathRoomState extends BaseState {

    public BathRoomState(BaseState baseState) {
        NothingToSeeState value = new NothingToSeeState(this);
        statesMaps.put("1", value);
        statesMaps.put("2", value);
        statesMaps.put("3", value);
        statesMaps.put("4", baseState);
    }

    @Override
    protected void showOptions() {
        System.out.println("You can see the shower room, a toilet and a sink!");
        System.out.println("\n Select a option:");
        System.out.println("    1 - Investigate shower room");
        System.out.println("    2 - Investigate toilet");
        System.out.println("    3 - Investigate sink");
        System.out.println("    4 - return");
    }
}
