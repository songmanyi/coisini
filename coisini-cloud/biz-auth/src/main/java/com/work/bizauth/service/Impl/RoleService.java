package com.work.bizauth.service.Impl;


import com.work.bizauth.entity.Role;
import com.work.bizauth.provider.OrganizationProvider;
import com.work.bizauth.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class RoleService implements IRoleService {

    @Autowired
    private OrganizationProvider organizationProvider;

    @Override
    public Set<Role> queryUserRolesByUserId(String userId) {
        return (Set<Role>) organizationProvider.queryRolesByUserId(userId).getData();
    }

}