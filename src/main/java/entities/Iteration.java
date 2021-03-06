package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Iteration {

    private String goal;
    private Project project;
    private List<Activity> activities;
    private LocalDate dateInit;
    private LocalDate dateEnd;

    public Iteration(String goal, Project project) {
        this.goal = goal;
        this.project = project;
        this.activities = new ArrayList<>();
        project.addIteration(this);
        this.dateInit = dateInit;
        this.dateEnd = dateEnd;
    }

    public void addActivity(Activity activity) {
        this.activities.add(activity);
    }
    public void setDateInit(LocalDate dateInit) {
        this.dateInit = dateInit;
    }
    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }
    public List<Activity> getActivities() {
        return activities;
    }
    public Iteration(String goal, Project project) {
        this.goal = goal;
        this.project = project;
        this.activities = new ArrayList<>();
        project.addIteration(this);
    }

}