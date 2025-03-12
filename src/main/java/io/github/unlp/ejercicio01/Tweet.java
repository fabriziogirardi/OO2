package io.github.unlp.ejercicio01;

public class Tweet
{
    private Tweet retweet;
    private String text;

    public Tweet(String text)
    {
        this.text = text;
    }

    public Tweet(Tweet retweet)
    {
        this.retweet = retweet;
    }
}
