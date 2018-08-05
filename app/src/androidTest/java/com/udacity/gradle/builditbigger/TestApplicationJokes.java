package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import junit.framework.Assert;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

@RunWith(AndroidJUnit4.class)
public class TestApplicationJokes {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testIfJokeIsNotNull() {
        try {
            EndpointsAsyncTask task = new EndpointsAsyncTask(null);
            task.execute();
            String joke = task.get(30, TimeUnit.SECONDS);

            Assert.assertNotNull(joke);
            Assert.assertTrue(joke instanceof String);
            Assert.assertTrue(joke.length() > 0);
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
}
