package com.example.mobilna.api;

import lombok.Getter;
import lombok.Setter;

public class Grade {
    @Getter @Setter
    private String grade;

    @Getter @Setter
    private String description;

    @Getter @Setter
    private String subject;

    @Override
    public String toString() {
        return "Grade{" +
                "grade='" + grade + '\'' +
                ", description='" + description + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }

    public String getGrade() {
        return grade;
    }

    public String getDescription() {
        return description;
    }

    public String getSubject() {
        return subject;
    }
}
