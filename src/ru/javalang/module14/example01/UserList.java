package ru.javalang.module14.example01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserList {

    private static Map<Integer,User> allUsers = new HashMap<>();

    private static User user;

    private static int countId;

    public static void userAdd(User user1){
        user=user1;
        if(!hasUser()){
            user.setId(countId++);
            allUsers.put(countId,user);
        }
    }

    public static void userAdd(String name, Gender gender){

        user = new User(name, gender);

        if(!hasUser()){
            user.setId(countId++);
            allUsers.put(countId,user);
        }
    }

    public static void userAdd(String name, Gender gender, int age){
        user = new User(name, gender, age);

        if(!hasUser()){
            user.setId(countId++);
            allUsers.put(countId,user);
        }
    }

    public static List<User> getAllUsers() {
        return new ArrayList<>(allUsers.values());
    }

    public static void setUserList(List<User> users){
        for(User user: users){
            userAdd(user.getName(),user.getGender(),user.getAge());
        }
    }

    public static int getAverageAgeOfAllUsers(){
        int countAge = 0;
        for(User user: allUsers.values()){
            countAge += user.getAge();
        }
        return countAge/allUsers.size();
    }

    public void method(){
        System.out.println("Метод для тестирования");
    }

    public static List<User> usersByGender(Gender gender){
        List<User> selectUsers = new ArrayList<>();
        for(User user: allUsers.values()){
            if(user.getGender() == gender){
                selectUsers.add(user);
            }
        }
        return selectUsers;
    }

    public static int getCountId() {
        return countId;
    }

    public static void setCountId(int countId) {
        UserList.countId = countId;
    }

    public static Map<Integer, User> getUserMap() {
        return allUsers;
    }

    public static void setUserMap(Map<Integer, User> userMap) {
        UserList.allUsers = userMap;
    }

    private static boolean hasUser(){
        for (User user1 : allUsers.values()){
            if (user1.equals(user) && user1.hashCode() == user.hashCode()){
                return true;
            }
        }
        return false;
    }
}
