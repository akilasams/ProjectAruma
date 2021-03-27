package com.course;

import java.util.List;

public class Course {
    private int courseId;
    private String courseName;
    private String courseDescription;
    private String courseFee;
    private int userId;
    private List<String> courseFiles;

    public Course() {
    }

    public Course(String courseName, String courseDescription, String courseFee, int userId, List<String> courseFiles) {
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.courseFee = courseFee;
        this.userId = userId;
        this.courseFiles = courseFiles;
    }

    public Course(int courseId, String courseName, String courseDescription, String courseFee, int userId) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.courseFee = courseFee;
        this.userId = userId;
    }

    public Course(String courseName, String courseDescription, String courseFee, int userId) {
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.courseFee = courseFee;
        this.userId = userId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(String courseFee) {
        this.courseFee = courseFee;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<String> getCourseFiles() {
        return courseFiles;
    }

    public void setCourseFiles(List<String> courseFiles) {
        this.courseFiles = courseFiles;
    }
}
