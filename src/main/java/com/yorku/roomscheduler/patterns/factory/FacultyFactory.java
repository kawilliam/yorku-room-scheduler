package com.yorku.roomscheduler.patterns.factory;

import com.yorku.roomscheduler.model.users.Faculty;
import com.yorku.roomscheduler.model.users.User;

public class FacultyFactory extends UserFactory{
	@Override
    public User createUser(String userId, String email, String password, String... extraParams) {
        String employeeId = (extraParams.length > 0) ? extraParams[0] : "UNKNOWN";
        String department = (extraParams.length > 1) ? extraParams[1] : "UNKNOWN";
        return new Faculty(userId, email, password, employeeId, department);
    }
}
