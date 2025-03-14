package io.github.unlp.ejercicio01;

public class Tweet
{
    private final User user;
    private final Tweet retweet;
    private final String text;

    public Tweet(User user, String text)
    {
        this.user = user;
        this.text = text;
        this.retweet = null;
    }

    public Tweet(User user, Tweet retweet)
    {
        this.user = user;
        this.text = null;
        this.retweet = retweet;
    }

    public User getUser()
    {
        return user;
    }

    public String getText()
    {
        return text;
    }

    public Tweet getRetweet()
    {
        return retweet;
    }
}
