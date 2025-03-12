package io.github.unlp.ejercicio01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwitterTest
{
    public Twitter twitter;
    public User user1;
    public User user2;
    public User user3;
    public Tweet tweet1;
    public Tweet tweet2;

    @BeforeEach
    public void setUp()
    {
        twitter = new Twitter();
        user1 = new User("user1");
        user2 = new User("user2");
        user3 = new User("user1");
        tweet1 = new Tweet("tweet1");
        tweet2 = new Tweet("tweet2");

        user1.addTweet(tweet1);
        user2.addTweet(tweet2);
    }

    @Test
    public void testAgregarUsuarios()
    {
        twitter.addUser(user1);
        twitter.addUser(user2);

        assertEquals(2, twitter.getUsers().size());
    }

    @Test
    public void testAgregarUsuariosRepetidos()
    {
        twitter.addUser(user1);
        twitter.addUser(user3);

        assertEquals(1, twitter.getUsers().size());
    }
}
