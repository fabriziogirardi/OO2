package io.github.unlp.ejercicio01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

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

    @Test
    public void testAgregarTweets()
    {
        user1.makeTweet("tweet1");
        user1.makeTweet("tweet2");

        assertEquals(2, user1.getTweets().size());
    }

    @Test
    public void testAgregarRetweets()
    {
        user1.makeTweet("tweet1");
        user1.makeTweet("tweet2");
        user2.makeRetweet(user1.getTweets().get(0));
        user2.makeRetweet(user1.getTweets().get(1));

        assertEquals(2, user2.getTweets().size());
    }

    @Test
    public void testLosRetweetsNoContienenTexto()
    {
        user1.makeTweet("tweet1");
        user2.makeRetweet(user1.getTweets().get(0));

        assertNull(user2.getTweets().get(0).getText());
    }
}
