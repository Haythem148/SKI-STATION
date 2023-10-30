package com.example.skistation.service;

import com.example.skistation.Entity.Course;
import com.example.skistation.repository.CourseRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class ICourseServiceImp implements ICourseService{
    @Autowired//permet d'activer l'injection automatique de dépendance.

    CourseRep courseRep;


    @Override
    public Course addCourse(Course c) {

        return courseRep.save(c);
    }

    @Override
    public Course updateCourse(Course c) {

        return courseRep.save(c);
    }

    @Override
    public List<Course> getAll() {
        return (List<Course>) courseRep.findAll();
    }

    @Override
    public Course getId(long id) {
       // return courseRep.findById(id).orElse( null);
        return courseRep.findById(id).orElseThrow(() -> new IllegalArgumentException("No Course found with this id"+id));

    }

    @Override
    public Boolean deleteById(long id) {
        courseRep.deleteById(id);
       return !courseRep.existsById(id);
    }
}
