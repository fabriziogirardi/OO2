package io.github.unlp.ejercicio01;

import java.util.ArrayList;
import java.util.List;

public class User
{
    private final String screenName;
    List<Tweet> tweets = new ArrayList<>();

    public User(String screenName)
    {
        this.screenName = screenName;
    }

    public void addTweet(Tweet tweet)
    {
        tweets.add(tweet);
    }

    public void addRetweet(Tweet tweet)
    {
        tweets.add(new Tweet(tweet));
    }

    public String getScreenName()
    {
        return screenName;
    }

    public List<Tweet> getTweets()
    {
        return tweets;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass())
        {
            return false;
        }

        User user = (User) obj;
        return equals(user);
    }

    private boolean equals(User user)
    {
        return screenName.equals(user.screenName);
    }
}
