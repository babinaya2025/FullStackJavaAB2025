package com.fullstackabi.assignment.Assign8.Ex4;

import java.util.Comparator;

public class StudentSortByRollNoComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getRollNumber() - o2.getRollNumber();
    }
}
