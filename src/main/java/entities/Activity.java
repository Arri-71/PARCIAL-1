package entities;

import java.util.ArrayList;
public class Activity {

    public static final String ACTIVE_STATE = "active";
    public static final String CLOSED_STATE = "closed";
    public static final String PENDING_STATE = "pending";
    public static final String CANCELED_STATE = "canceled";

    private String name;
    private String state;
    private Iteration iteration;
    public ArrayList<Log> logs;
    private ArrayList<Student> students;//**

    public Activity(String name, String state, Iteration iteration) {
        this.name = name;
        this.state = state;
        this.iteration = iteration;
        this.logs=logs;
        this.iteration.addActivity(this);
        this.students= students;
    }

    /**
     * Evaluate if an activity is active.
     *
     * @return true if the activity is in state pending or active, otherwise return false.
     */
    public boolean isActive() {//**
        if(this.state==ACTIVE_STATE){
            return true;
        }else {
            return false;
        }
    }
    public void addStudent(Student student) {
        this.students.add(student);
    }//**
    public void addLog(Log log) {
        this.logs.add(log);
    }//**

    public ArrayList<Student> getStudents() {//**
        return students;
    }

    public void setStudents(ArrayList<Student> students) {//**
        this.students = students;
    }

}