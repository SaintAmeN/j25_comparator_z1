package com.javagda25.comparator.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student s1 = new Student(1L, "a1", "b");
        Student s9 = new Student(9L, "a9", "b");
        Student s3 = new Student(3L, "a3", "b");
        Student s6 = new Student(6L, "a6", "b");
        Student s2 = new Student(2L, "a2", "b");
        Student s7 = new Student(7L, "a7", "b");
        Student s32 = new Student(3L, "a3", "b");
        Student s63 = new Student(6L, "a6", "b");

        students.addAll(Arrays.asList(s1, s9, s3, s6, s2, s7, s32, s63));

//        StudentComparator studentComparator = new StudentComparator();
//        Collections.sort(students, studentComparator);
//
//        students.forEach(System.out::println);
    }
}
