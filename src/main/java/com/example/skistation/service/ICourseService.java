package com.example.skistation.service;

import com.example.skistation.Entity.Course;

import java.util.List;

public interface ICourseService {
    Course addCourse(Course c);
    Course updateCourse(Course c);
    List<Course>  getAll();
    Course getId(long id);
    Boolean deleteById(long id);



}
