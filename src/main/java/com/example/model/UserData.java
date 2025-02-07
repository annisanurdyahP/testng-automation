package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class UserData {
    public static List<User> getUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("Valid Standar User login with valid data", "standard_user", "secret_sauce", true, ""));
        users.add(new User("Locked out user", "locked_out_user", "secret_sauce", false, "Epic sadface: Sorry, this user has been locked out."));
        users.add(new User("Visual user", "visual_user", "secret_sauce", true, ""));
        users.add(new User("Invalid username", "invalid_username", "secret_sauce", false, "Epic sadface: Username and password do not match any user in this service"));
        users.add(new User("Invalid password", "standard_user", "invalid_password", false, "Epic sadface: Username and password do not match any user in this service"));
        return users;
    }
}
