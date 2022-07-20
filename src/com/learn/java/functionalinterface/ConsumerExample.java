package com.learn.java.functionalinterface;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

import java.util.List;
import java.util.function.Consumer;

/**
 * packageName : com.learn.java.functionalinterface
 * fileName : ConsumerExample
 * author : psjw
 * date : 2022-07-20
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2022-07-20        psjw         최초 생성
 */
public class ConsumerExample {
    static Consumer<Student> c2 = (student) -> System.out.println(student);
    static Consumer<Student> c3 = (student) -> System.out.print(student.getName());
    static Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());

    public static void printName() {
        List<Student> studentList = StudentDatabase.getAllStudents();
        studentList.forEach(c2);
    }

    public static void printNameAndActivities() {
        System.out.println("printNameAndActivities");

        List<Student> studentList = StudentDatabase.getAllStudents();
        studentList.forEach(c3.andThen(c4)); //consumer chaining
    }

    public static void printNameAndActivitiesCondition() {
        System.out.println("printNameAndActivitiesCondition");
        List<Student> studentList = StudentDatabase.getAllStudents();
        studentList.forEach((student -> {
            if(student.getGradeLevel()>=3 && student.getGpa() >=3.9){
                c3.andThen(c4).andThen(c2).accept(student);
            }
        })); //consumer chaining
    }

    public static void main(String[] args) {
        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());

        c1.accept("java8");
        printName();
        printNameAndActivities();
        printNameAndActivitiesCondition();
    }
}
