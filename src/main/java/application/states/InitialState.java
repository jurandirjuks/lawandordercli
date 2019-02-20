package application.states;

public class InitialState extends BaseState {


    public InitialState() {
        this.statesMaps.put("1", new InvestigatingRoomStateImpl());
    }

    @Override
    public void printStateMsg() {
        System.out.println("\nYou were called to settle a case. A young woman dead in her apartment." +
        "\nYou should investigate and search for evidence in the apartment");
        System.out.println("It's a murder scene. " +
                "It has a body in the middle of the room, it was a woman and had a stab wound in the stomach." +
                "\nThe boyfriend who lived with her was not on site, " +
                "but will be called to testify at the jury as soon as you find out what happened at the scene." +
                "\nEverything leads you to believe in suicide, but your intuition bothers you." +
                "\nTime to find out what happened!" +
                "\nYou are in a room and you can see doors to the bathroom, bedroom, kitchen and balcony." );
        System.out.println("\nSelect a option:");
        System.out.println("    1 - Investigate crime scene");
    }

}
