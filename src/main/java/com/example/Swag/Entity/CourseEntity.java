package com.example.Swag.Entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "tblcourse")
public class CourseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "course_id")
    private long courseId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
