package com.yorku.roomscheduler.patterns.factory;

import com.yorku.roomscheduler.model.users.Student;
import com.yorku.roomscheduler.model.users.User;

public class StudentFactory extends UserFactory {
    @Override
    public User createUser(String userId, String email, String password, String... extraParams) {
        String studentNumber = (extraParams.length > 0) ? extraParams[0] : "UNKNOWN";
        return new Student(userId, email, password, studentNumber);
    }
}