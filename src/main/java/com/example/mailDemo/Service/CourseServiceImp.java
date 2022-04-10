package com.example.mailDemo.Service;

import com.example.mailDemo.Dao.CourseDao;
import com.example.mailDemo.Entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImp implements CourseService{
    @Autowired
    private CourseDao courseDao;
    @Autowired
    private SendEmailService sendEmailService;

    public List<Course> getAllCourses(){
        return this.courseDao.findAll();
    }

    public Course getByCourseId(int objectId){
        Optional<Course> op = this.courseDao.findById(objectId);
        Course course = null;
        if(op.isPresent()) course = op.get();
        else throw new RuntimeException("Course not found for id: " + objectId);
        return course;
    }

    public Course addCourse(Course course){
        sendEmailService.sendEmail("sender@sender.com", "Test add", "Course add");
        return this.courseDao.save(course);
    }

    public Course updateCourse(Course course){
        return this.courseDao.save(course);
    }

    public String deleteCourse(int objectId){
        this.courseDao.deleteById(objectId);
        sendEmailService.sendEmail("sender@sender.com", "Test delete", "Course delete");
        return "Deleted Successfully";
    }
}
