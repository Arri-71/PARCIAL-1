package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SabanaResearch {

    private List<Group> groups;
    private List<Summary> summaries;
    private List<Course> courses;
    private List<Student> students;

    public SabanaResearch(List<Group> groups, List<Summary> summaries, List<Course> courses, List<Student> students) {
        this.groups = groups;
        this.summaries = new ArrayList<>();
        this.courses= new ArrayList<>();
        this.students=new ArrayList<>();
    }

    public int countOfGroups() {
        return this.groups.size();
    }

    public int countOfSummaries() {
        return this.summaries.size();
    }

    public int countOfStudents() {
        return this.students.size();
    }

    public int countOfCourses() {
        return this.courses.size();
    }

    /**
     * Create a summary entry in the current date.
     * - Calculate the count of active projects.
     *
     * @return The new Summary entry.
     */
    public Summary createSummaryEntry() {
        LocalDate date= LocalDate.now();
        int activeProjects= countActiveProjects();
        int openActivities= countOpenActivities();
        int closedActivities= countClosedActivities();

        return new Summary(activeProjects,date,openActivities,closedActivities);
    }
    public int countActiveProjects(){
        int counter =0;
        for (int i=0; i<this.groups.size();i++){
            for (int j=0; j<this.groups.get(j).getProjects().size(); j++){
                Project p= this.groups.get(j).getProjects().get(j);
                if(p.isActive()){
                    counter++;
                }
            }
        }
        return counter;
    }
    public int countOpenActivities(){
        int counter =0;
        for (int i=0; i<this.groups.size();i++){
            for (int j=0; j<this.groups.get(j).getProjects().size(); j++){
                Project p= this.groups.get(j).getProjects().get(j);
                if(p.isActive()){
                    for(int k=0; k<p.getIterations().size();k++){
                        for(int n=0;n<p.getIterations().get(k).getActivities().size(); n++){
                            Activity a=p.getIterations().get(k).getActivities().get(n);
                            if(a.isActive()){
                                counter++;
                            }
                        }
                    }
                }
            }
        }
        return counter;
    }
    public int countClosedActivities(){
        int counter =0;
        for (int i=0; i<this.groups.size();i++){
            for (int j=0; j<this.groups.get(j).getProjects().size(); j++){
                Project p= this.groups.get(j).getProjects().get(j);
                if(p.isActive()){
                    for(int k=0; k<p.getIterations().size();k++){
                        for(int n=0;n<p.getIterations().get(k).getActivities().size(); n++){
                            Activity a=p.getIterations().get(k).getActivities().get(n);
                            if(!a.isActive()){
                                counter++;
                            }
                        }
                    }
                }
            }
        }
        return counter;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public List<Summary> getSummaries() {
        return summaries;
    }

    public void setSummaries(List<Summary> summaries) {
        this.summaries = summaries;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;