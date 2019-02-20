package application.states;

import application.Context;

import java.util.Arrays;
import java.util.Set;

public class ConclusionCalculator {

    private String BAD_ENDING = "\nIt's all okay, it really was suicide";

    private String INCOCLUSIVE_ENDING = "\n" +
            "I've found some suspicious things, but I will not charge anybody with just found it here, better call a senior detective.";

    private String GOOD_ENDING = "\nThe knife in the hand of the victim is not the murder weapon," +
            " it was placed after the attack and the killer's own finger was used to simulate the blood on the knife. " +
            "\nThe victim's personal diary suggests she was the victim of a passionate attack and the guilty tried " +
            "to make it appear that it was suicide. " +
            "\nThe fingerprints on the knife and torn pages of the newspaper will confirm the culprit.\n" +
            "\n" +
            "Case closed successfully.";


    public String generateConclusion(Context context) {
        Set<Evidence> ev = context.getEvidences();

        if (ev.containsAll(Arrays.asList(Evidence.values())))
            return GOOD_ENDING;

        if (ev.size() > 0)
            return INCOCLUSIVE_ENDING;

        return BAD_ENDING;
    }
}
