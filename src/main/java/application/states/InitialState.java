package application.states;

public class InitialState extends BaseState {


    public InitialState() {
        this.statesMaps.put("1", new InvestigatingRoomStateImpl());
        this.statesMaps.put("2", new TrialState());
    }

    @Override
    public void printStateMsg() {
        System.out.println("\nYou were called to settle a case. A young woman dead in her apartment." +
        "\nYou can investigate and search for evidence in the apartment or go straight to the trial and try" +
        "\n to find the truth by questioning the boyfriend." +
        "\nWhich one will you choose?");
        System.out.println("\nSelect a option:");
        System.out.println("    1 - Investigate crime scene");
        System.out.println("    2 - Go to trial");
    }

}
