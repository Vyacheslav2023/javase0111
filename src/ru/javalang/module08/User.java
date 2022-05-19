package ru.javalang.module08;

import java.util.ArrayList;
import java.util.List;

public class User {
    public static enum Permission {
        USER_MANAGEMENT, CONTENT_MANAGEMENT
    }

    private List<Permission> permissions;

    public List<Permission> getPermissions() {
        return new ArrayList<Permission>(permissions);
    }
}
