package ru.javalang.module14.example01;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UserListTest {

    @Test
    public void userAdd() {
        User user = new User("Вася", Gender.MALE, 20);
        User user1 = new User("Оля", Gender.FEMALE, 18);
        User user2 = new User("Маша", Gender.FEMALE, 25);
        User user3 = new User("Коля",Gender.MALE, 35);
        User user4 = new User("Олег",Gender.MALE, 30);

        List<User> list = new ArrayList<>(){{
            add(user);
            add(user1);
            add(user2);
            add(user3);
            add(user4);
        }};

        UserList.userAdd(user);
        UserList.userAdd(user1);
        UserList.userAdd(user2);
        UserList.userAdd(user3);
        UserList.userAdd(user4);

        Assert.assertEquals(UserList.getAllUsers(),list);
    }

    @Test
    public void getAllUsers_NO_NULL() {
        //проверка на null
        List<User> expected = UserList.getAllUsers();
        Assert.assertNotNull(expected);
    }

    @Test
    public void usersByGender() {
        User user = new User("Вася", Gender.MALE, 20);
        User user1 = new User("Оля", Gender.FEMALE, 18);
        User user2 = new User("Маша", Gender.FEMALE, 25);
        User user3 = new User("Коля",Gender.MALE, 35);
        User user4 = new User("Олег",Gender.MALE, 30);
        List<User> actual = new ArrayList<>(){{ add(user); add(user3); add(user4); }};

        UserList.userAdd(user);
        UserList.userAdd(user1);
        UserList.userAdd(user2);
        UserList.userAdd(user3);
        UserList.userAdd(user4);

        List<User> expected = UserList.usersByGender(Gender.MALE);

        Assert.assertEquals(expected,actual);
    }
}