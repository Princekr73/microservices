package com.lcwd.user.service.services;

import com.lcwd.user.service.entites.User;

import java.util.List;

public interface UserService {

    //user operations


    //create
    User saveUser(User user);

    //get all user
    List<User>getAllUser();

    //get single user of given userid

    User getUser(String userId);

    //TODO:delete
    //TODO:update
}
