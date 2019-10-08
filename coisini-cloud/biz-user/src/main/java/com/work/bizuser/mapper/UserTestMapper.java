package com.work.bizuser.mapper;

import com.work.bizuser.entity.UserTest;

import java.util.List;

public interface UserTestMapper {

    List<UserTest> getAllUserTest();

    void insert(UserTest userTest);

}
