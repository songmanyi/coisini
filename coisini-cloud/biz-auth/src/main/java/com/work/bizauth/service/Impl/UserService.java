package com.work.bizauth.service.Impl;


import com.work.bizauth.entity.User;
import com.work.bizauth.provider.OrganizationProvider;
import com.work.bizauth.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private OrganizationProvider organizationProvider;

    @Override
    public User getByUniqueId(String uniqueId) {
        return (User) organizationProvider.getUserByUniqueId(uniqueId).getData();
    }
}
