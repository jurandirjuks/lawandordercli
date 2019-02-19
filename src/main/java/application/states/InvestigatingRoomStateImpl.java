package application.states;

public class InvestigatingRoomStateImpl extends BaseState{


    public InvestigatingRoomStateImpl() {
        this.statesMaps.put("1", new BathRoomState());
        this.statesMaps.put("2", new BedRoomState());
        this.statesMaps.put("3", new KitchenState());
        this.statesMaps.put("4", new LivingRoomState());
        this.statesMaps.put("5", new BalconyState());
        this.statesMaps.put("6", new InvestigateBodyState());
        this.statesMaps.put("7", new GotToCourtState());
    }

    @Override
    public boolean shouldEndMachineState() {
        return false;
    }

    @Override
    public void showOptions() {
        System.out.println("It's a murder scene. " +
                "It has a body in the middle of the room, it was a woman and had a stab wound in the stomach." +
                "\nThe boyfriend who lived with her was not on site, " +
                "but will be called to testify at the jury as soon as you find out what happened at the scene." +
                "\nEverything leads you to believe in suicide, but your intuition bothers you." +
                "\nTime to find out what happened!" +
                "\nYou are in a room and you can see doors to the bathroom, bedroom, kitchen and balcony." );
        System.out.println("\nSelect a option:");
        System.out.println("    1 - Investigate bathroom");
        System.out.println("    2 - Investigate bedroom");
        System.out.println("    3 - Investigate kitchen");
        System.out.println("    4 - Investigate living room");
        System.out.println("    5 - Investigate balcony");
        System.out.println("    6 - Investigate the body");
        System.out.println("    7 - stop the investigation, go to court");
    }
}
