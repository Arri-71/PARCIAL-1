package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Project {

    private String name;
    private LocalDate dateInit;
    private LocalDate dateEnd;
    private Group group;
    private List<Iteration> iterations;
    private ArrayList<Student> members;
    private Student leader;

    public Project(String name, LocalDate dateInit, LocalDate dateEnd, Group group) {
        this.name = name;
        this.dateInit = dateInit;
        this.dateEnd = dateEnd;
        this.group = group;
        this.members= members;
        this.leader= leader;
        this.iterations = new ArrayList<>();
        group.addProject(this);
    }
    public List<Iteration> getIterations() {
        return iterations;
    }
    public void addIteration(Iteration iteration) {
        this.iterations.add(iteration);
    }

    public void setDateInit(LocalDate dateInit) {
        this.dateInit = dateInit;
    }

    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }

    public void addMember(Student member) { this.members.add(member);}

    /**
     * Evaluate if a project is active.
     *
     * @return false if the project has open activities or the dateEnd is before than the system date.
     */
    public boolean isActive() {
        if(this.iterations.size()==0||this.dateEnd.isBefore(LocalDate.now())){
            return false;
        }else {
            return true;
        }
    }


}





