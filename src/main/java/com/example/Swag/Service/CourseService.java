package com.example.Swag.Service;

import com.example.Swag.Entity.CourseEntity;
import com.example.Swag.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public String addStudent(String name, String description) {

        CourseEntity courseEntity = new CourseEntity();
        courseEntity.setName(name);
        courseEntity.setDescription(description);
        courseRepository.save(courseEntity);
        return "Course Successfully Added.";
    }

    public List<CourseEntity> getAllCourses() {
        return courseRepository.findAll();
    }

    public Optional<CourseEntity> findCourseById(Long id) {
        return courseRepository.findById(id);
    }

    public void deleteCourseById(Long id) {
        courseRepository.deleteById(id);
    }
    public CourseEntity updateCourse(long id, CourseEntity courseEntity) {
        courseEntity.setCourseId(id);
        return courseRepository.save(courseEntity);
    }
}
