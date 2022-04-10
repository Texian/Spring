package com.example.mailDemo.Service;

import com.example.mailDemo.Entity.Course;

import java.util.List;

public interface CourseService {
    List<Course> getAllCourses();
    Course getByCourseId(int objectId);
    Course addCourse(Course course);
    Course updateCourse(Course course);
    String deleteCourse(int objectId);
}
