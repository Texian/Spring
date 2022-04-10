package com.example.mailDemo.Entity;

import javax.persistence.*;

@Entity
@Table(name="tbl_courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "c_id")
    private int courseId;
    private String title;
    private String instructor;

    public Course() {
    }

    public Course(int courseId, String title, String instructor) {
        this.courseId = courseId;
        this.title = title;
        this.instructor = instructor;
    }

    public int getCourseId(){
        return courseId;
    }

    public void setCourseId(int courseId){
        this.courseId = courseId;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getInstructor(){
        return instructor;
    }

    public void setInstructor(String instructor){
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return "Course {" +
                "\nCourse ID: " + courseId +
                "\nTitle: " + title +
                "\nInstructor: " +
                "}";
    }
}
