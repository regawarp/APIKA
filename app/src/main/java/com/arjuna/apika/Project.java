package com.arjuna.apika;

/**
 * Created by Regawa on 6/29/2018.
 */

public class Project {
    private String projectName;
    private String projectDuration;
    private String projectDescription;
    private String projectDayPosted;
    private String projectAuctioner;
    private String projectBudget;

    Project(String projectName, String projectDuration, String projectDescription, String projectDayPosted, String projectAuctioner, String projectBudget){
        this.setProjectName(projectName);
        this.setProjectDuration(projectDuration);
        this.setProjectDescription(projectDescription);
        this.setProjectDayPosted(projectDayPosted);
        this.setProjectAuctioner(projectAuctioner);
        this.setProjectBudget(projectBudget);
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDuration() {
        return projectDuration;
    }

    public void setProjectDuration(String projectDuration) {
        this.projectDuration = projectDuration;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public String getProjectDayPosted() {
        return projectDayPosted;
    }

    public void setProjectDayPosted(String projectDayPosted) {
        this.projectDayPosted = projectDayPosted;
    }

    public String getProjectAuctioner() {
        return projectAuctioner;
    }

    public void setProjectAuctioner(String projectAuctioner) {
        this.projectAuctioner = projectAuctioner;
    }

    public String getProjectBudget() {
        return projectBudget;
    }

    public void setProjectBudget(String projectBudget) {
        this.projectBudget = projectBudget;
    }
}
