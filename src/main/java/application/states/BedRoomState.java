package application.states;

public class BedRoomState extends BaseState {

    public BedRoomState(BaseState stateToReturn) {
        statesMaps.put("1",new DiaryState(this));
        statesMaps.put("2",new NothingToSeeState(this));
        statesMaps.put("3", stateToReturn);
    }

    @Override
    public void showOptions() {
        System.out.println("It is possible to see the bed and an open personal diary next to the bedside");
        System.out.println("\nSelect a option:");
        System.out.println("    1 - Investigate personal diary");
        System.out.println("    2 - Investigate bed");
        System.out.println("    3 - return.");
    }
}
