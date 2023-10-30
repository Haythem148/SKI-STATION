package com.example.skistation.repository;

import com.example.skistation.Entity.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface CourseRep extends CrudRepository<Course,Long> {


}
