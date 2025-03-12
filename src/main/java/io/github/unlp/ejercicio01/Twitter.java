package io.github.unlp.ejercicio01;

import java.util.HashSet;
import java.util.Set;

public class Twitter
{
    private final Set<User> users = new HashSet<>();

    public void addUser(User user)
    {
        users.add(user);
    }

    public Set<User> getUsers()
    {
        return users;
    }
}
