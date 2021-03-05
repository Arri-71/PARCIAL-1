package entities;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private String name;
    private List<Project> projects;

    public Group(String name) {
        this.name = name;
        this.projects = new ArrayList<>();
    }

    public void addProject(Project plan) {
        this.projects.add(plan);
    }
    public void addMember(Student member) { this.members.add(member);}
    public void addRequirement(Course requirement) { this.requirements.add(requirement);}

}
