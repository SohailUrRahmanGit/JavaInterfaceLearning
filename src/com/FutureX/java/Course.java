package com.FutureX.java;

public class Course {
    public String courseName;
    protected String authorName;
    private Integer noOfReviews;
    Integer noOfStudents;

    public Course() {
        this.courseName = "Course Name" ;
        this.authorName = "Author Name ";
        this.noOfStudents =  0 ;
        this.noOfReviews  = 100;
    }

    public  void displayCourseDetails() {
        System.out.println("Course Name" + courseName);
        System.out.println("Author Name" + authorName);
        System.out.println("No of Students" + noOfStudents);
        System.out.println("Review " + noOfReviews);

    }

}
