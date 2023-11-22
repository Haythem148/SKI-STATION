package com.example.skistation.service;

import com.example.skistation.Entity.Course;
import com.example.skistation.Entity.Moniteur;
import com.example.skistation.repository.CourseRep;
import com.example.skistation.repository.InscriptionRep;
import com.example.skistation.repository.MoniteurRep;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
@Slf4j
public class IMoniteurServiceImp implements IMoniteurService {

    private final MoniteurRep moniteurrep;
    private final CourseRep courseRep;

    @Override
    public Moniteur addMoniteur(Moniteur m) {
        return moniteurrep.save(m);
    }

    @Override
    public Moniteur updateMoniteur(Moniteur m) {
        return moniteurrep.save(m);
    }

    @Override
    public List<Moniteur> getAll() {
        return (List<Moniteur>) moniteurrep.findAll();
    }

    @Override
    public Moniteur getId(long id) {
        return moniteurrep.findById(id).orElseThrow(() -> new IllegalArgumentException("No Course found with this id" + id));
    }

    @Override
    public Boolean deleteById(long id) {
        moniteurrep.deleteById(id);
        return !moniteurrep.existsById(id);
    }

    @Override
    public Moniteur addInstructorAndAssignToCourse(Moniteur moniteur, Long numCourse) {
        Course course = courseRep.findById(numCourse).orElseThrow(() -> new IllegalArgumentException("No course found with this id: " + numCourse));;
        Set<Course> courses = new HashSet<>();
        courses.add(course);
        moniteur.setCourses(courses);
        return moniteurrep.save(moniteur);
    }
}
