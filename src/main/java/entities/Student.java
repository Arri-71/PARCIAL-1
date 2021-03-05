package entities;

import java.util.ArrayList;

public class Student {
    private int code;
    private String name;
    private String LastName;
    private String email;
    private ArrayList<Activity> assignedActivities;


    public Student(int code, String name, String lastName, String email, ArrayList<Activity> assignedActivities) {
        this.code = code;
        this.name = name;
        LastName = lastName;
        this.email = email;
        this.assignedActivities = assignedActivities;
    }

}
