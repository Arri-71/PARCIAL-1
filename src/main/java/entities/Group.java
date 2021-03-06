package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Group {

    private String name;
    private int id;
    private LocalDate createdAt;
    private String area;
    private List<Project> projects;
    private ArrayList<Student> members;
    private Student leader;
    private ArrayList<Course> requirements;

    public Group(String name)  {
        this.name = name;
        this.id=id;
        this.name=name;
        this.createdAt=createdAt;
        this.projects = new ArrayList<>();
        this.members= members;
        this.leader=leader;
        this.area=area;
        this.requirements=requirements;

    }

    public void addProject(Project plan) {
        this.projects.add(plan);
    }
    public void addMember(Student member) { this.members.add(member);}
    public void addRequirement(Course requirement) { this.requirements.add(requirement);}
    public List<Project> getProjects() {
        return projects;
    }
    public Group(String name)  {
        this.name = name;
        this.name=name;
        this.projects = new ArrayList<>();
    }
}
