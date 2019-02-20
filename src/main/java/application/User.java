package application;

import application.states.Evidence;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class User implements Memento {

    private String name;
    private Integer experiencePoints;
    private Set<Evidence> evidences;

    public User(String name) {
        this.name = name;
        this.experiencePoints = 0;
        this.evidences = new LinkedHashSet();
    }

    public User(String name, Integer experiencePoints, Set<Evidence> evidences) {
        this.name = name;
        this.experiencePoints = experiencePoints;
        this.evidences = evidences;
    }

    @Override
    public User saveState() {
        return new User(this.name,this.experiencePoints,this.evidences);
    }

    public void addEvidences(Evidence evidence) {
        this.evidences.add(evidence);
    }

    public void addExperiencePoints(Integer experiencePoints) {
        this.experiencePoints += experiencePoints;
    }

    public Set<Evidence> getEvidences() {
        return new LinkedHashSet(this.evidences);
    }
}
