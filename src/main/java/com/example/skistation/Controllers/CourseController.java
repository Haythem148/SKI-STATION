package com.example.skistation.Controllers;

import com.example.skistation.Entity.Course;
import com.example.skistation.service.ICourseService;
import com.example.skistation.service.ISkieurService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("course")
@RequiredArgsConstructor
public class CourseController {
    private final ICourseService iCourseService;

    @PostMapping
    Course addCourse(@RequestBody Course c) {
        return iCourseService.addCourse(c);
    }

    @PutMapping
    Course updateCourse(@RequestBody Course c) {
        return iCourseService.updateCourse(c);
    }

    @GetMapping
    List<Course> getAll() {
        return iCourseService.getAll();
    }

    @GetMapping("{id}")
    Course getCourseById(@PathVariable long id) {
        return iCourseService.getId(id);
    }

    @DeleteMapping("{id}")
    Boolean deleteCourseById(@PathVariable long id) {
        return iCourseService.deleteById(id);
    }
}