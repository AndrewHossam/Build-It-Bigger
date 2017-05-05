package com.udacity.gradle.builditbigger;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Andrew on 5/5/2017.
 */

public class TestTask {
    @Test
    public void t() {
        assertEquals("This is totally a funny joke", new EndpointAsyncTask().doInBackground(MainActivity.context));

    }
}
