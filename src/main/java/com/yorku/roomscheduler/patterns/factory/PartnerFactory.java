package com.yorku.roomscheduler.patterns.factory;

import com.yorku.roomscheduler.model.users.Partner;
import com.yorku.roomscheduler.model.users.User;

public class PartnerFactory extends UserFactory{
	@Override
    public User createUser(String userId, String email, String password, String... extraParams) {
        String organizationId = (extraParams.length > 0) ? extraParams[0] : "UNKNOWN";
        String companyName = (extraParams.length > 0) ? extraParams[0] : "UNKNOWN";
        return new Partner(userId, email, password, organizationId, companyName);
    }
}
