package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    //TC1.1
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("SAD");
        String mood = moodAnalyser.analyseMood("I am in sad mood ");
        Assert.assertEquals("HAPPY",mood);
    }
    //TC1.2
    @Test
    public void givenMessage_WhenNotSad_ShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("HAPPY");
        String mood = moodAnalyser.analyseMood("I am in  happy Mood ");
        Assert.assertEquals("HAPPY",mood);
    }
}
