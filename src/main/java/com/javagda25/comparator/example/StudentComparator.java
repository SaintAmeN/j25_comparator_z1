package com.javagda25.comparator.example;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        // jeśli o1 jest większe od o2 to zwróć -1
        // jeśli o2 jest większe od o1 to zwróć 1
        // jeśli o1 == o2 zwróć 0

        // indeks
        if (o1.getIndeks() > o2.getIndeks()) {
            return 1;
        } else if (o1.getIndeks() < o2.getIndeks()) {
            return -1;
        }
        return 0;

        // alfabetycznie
//        return o1.getImie().compareTo(o2.getImie());

        // po długości imienia
//        if (o1.getImie().length() > o2.getImie().length()) {
//            return -1;
//        } else if (o1.getImie().length() < o2.getImie().length()) {
//            return 1;
//        }
//        return 0;
    }
}
