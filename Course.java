package chapter_09;
import java.util.ArrayList;
import java.util.List;

public class Course {

    private String course;
    private List<Student2> students;

    public Course(String course){
        this.course = course;
        students = new ArrayList<Student2>();
    }

    public void addStudent(Student2 student) {
        students.add(student);
    }


    public void roll(){
        System.out.println("Students:\t");

        for(Student2 student : this.students){
            System.out.println(student);
        }
}
    }
