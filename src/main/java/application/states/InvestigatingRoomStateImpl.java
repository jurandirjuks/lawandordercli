package application.states;

public class InvestigatingRoomStateImpl extends BaseState{


    public InvestigatingRoomStateImpl() {
        this.statesMaps.put("1", new BathRoomState(this));
        this.statesMaps.put("2", new BedRoomState(this));
        this.statesMaps.put("3", new KitchenState(this));
        this.statesMaps.put("4", new InvestigateBodyState(this));
        this.statesMaps.put("5", new ConclusionState());
    }

    @Override
    public boolean shouldEndMachineState() {
        return false;
    }

    @Override
    public void showOptions() {
        System.out.println("\nSelect a option:");
        System.out.println("    1 - Investigate bathroom");
        System.out.println("    2 - Investigate bedroom");
        System.out.println("    3 - Investigate kitchen");
        System.out.println("    4 - Investigate the body");
        System.out.println("    5 - stop the investigation, come to a conclusion");
    }
}
