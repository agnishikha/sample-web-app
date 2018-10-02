package com.agnishikha.service;

import com.agnishikha.domain.User;

import java.util.List;

public class GetUsersServiceImpl implements GetUsersService {
    @Override
    public List<User> getUsers() {
      User user =  new User("Agni Shikha","agni_shikha","spinster","0989099","asc@gmail.com");
        User user1 =  new User("Ankita","anki","spinster","0989099","asc@gmail.com");
        User user2 =  new User("Ashraf","aash","bachelor","0989099","asc@gmail.com");

    }
}
