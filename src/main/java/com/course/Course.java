package com.course;

public class Course {
    private int courseId;
    private String courseName;
    private String courseDescription;
    private int isFree;
    private String courseFee;
    private int userId;
    //private String courseContentPath;

    public Course(int courseId, String courseName, String courseDescription, int isFree, String courseFee, int userId) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.isFree = isFree;
        this.courseFee = courseFee;
        this.userId = userId;
    }

    public Course(String courseName, String courseDescription, int isFree, String courseFee, int userId) {
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.isFree = isFree;
        this.courseFee = courseFee;
        this.userId = userId;
    }

    /*public Course(String courseName, String courseDescription, boolean isFree, String courseFee, int userId, String courseContentPath) {
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.isFree = isFree;
        this.courseFee = courseFee;
        this.userId = userId;
        this.courseContentPath = courseContentPath;
    }*/

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

    public int getIsFree() {
        return isFree;
    }

    public void setFree(int free) {
        isFree = free;
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

    /*public String getCourseContentPath() {
        return courseContentPath;
    }

    public void setCourseContentPath(String courseContentPath) {
        this.courseContentPath = courseContentPath;
    }*/
}
