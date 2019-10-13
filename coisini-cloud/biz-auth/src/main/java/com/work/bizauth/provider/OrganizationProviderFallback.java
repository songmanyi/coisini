package com.work.bizauth.provider;


import com.work.bizauth.entity.Role;
import com.work.bizauth.entity.User;
import com.work.cloudcommon.json.JsonData;

import java.util.HashSet;
import java.util.Set;

public class OrganizationProviderFallback implements OrganizationProvider {

    @Override
    public JsonData getUserByUniqueId(String uniqueId) {
        return new JsonData(new User());
    }

    @Override
    public JsonData queryRolesByUserId(String userId) {
        return new JsonData(new HashSet<Role>());
    }
}