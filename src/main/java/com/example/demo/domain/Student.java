package com.example.demo.domain;

public class Student {

    private final Long studentId;
    private final String studentName;

    public Student( final Long studentId,
                    final String studentName ) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public Long getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }
}
