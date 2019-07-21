package design_pattern.structural.composite;

import java.util.List;

public class Student {
    private String name;
    private String id;
    private int age;

    private List<Course> courseList;

    public Student(String name, String id, int age, List<Course> courseList) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.courseList = courseList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", courseList=" + courseList +
                '}';
    }

    public List<Course> getList(){
        return courseList;
    }

    public void add (Course course){
        courseList.add(course);
    }
}
