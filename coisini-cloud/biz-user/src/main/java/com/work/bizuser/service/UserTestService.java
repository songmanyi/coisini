package com.work.bizuser.service;

import com.work.bizuser.entity.UserTest;
import com.work.bizuser.mapper.UserTestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class UserTestService {

    @Autowired
    private UserTestMapper userTestMapper;

    public List<UserTest> getAll() {
        return userTestMapper.getAllUserTest();
    }

    public void add(String name, Integer age) {
        UserTest t = new UserTest();
        t.setId(UUID.randomUUID().toString());
        t.setName(name);
        t.setAge(age);
        userTestMapper.insert(t);
    }

}
